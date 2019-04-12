/**
 * 
 */
package com.yrk.mybatis.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.yrk.mybatis.enums.Gender;
import com.yrk.mybatis.model.User;

import net.minidev.json.JSONObject;

/**
 * @author runkaiyang
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
	}
	
	@Test
	public void getUsers() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/getUsers").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(MockMvcResultHandlers.print());
	}
	
	@Test
	public void insert() throws Exception {
		Map<String, User> map = new HashMap<String, User>();
		User u = new User();
		u.setGender(Gender.MAN);
		u.setNickName("test");
		u.setPassWord("xxx");
		u.setUserName("tttttt");
		map.put("user", u);
		String val = JSONObject.toJSONString(map);
		mockMvc.perform(MockMvcRequestBuilders.post("/add").param("user", val));
	}
}
