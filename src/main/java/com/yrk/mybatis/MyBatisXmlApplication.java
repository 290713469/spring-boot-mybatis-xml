/**
 * 
 */
package com.yrk.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author runkaiyang
 *
 */
@SpringBootApplication
@MapperScan("com.yrk.mybatis")
public class MyBatisXmlApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MyBatisXmlApplication.class, args);
	}

}
