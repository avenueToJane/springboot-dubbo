package com.westlife.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午3:44:12 
 * @version 1.0 
 * @parameter
 *提供者 启动类
 */
@SpringBootApplication
@ImportResource(value="classpath:config/applicationContext.xml")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
