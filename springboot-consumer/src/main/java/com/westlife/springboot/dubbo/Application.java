package com.westlife.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午3:43:25 
 * @version 1.0 
 * @parameter
 *消费者
 * springboot启动类
 */
@SpringBootApplication
@ImportResource("classpath:/config/applicationContext.xml")
@ComponentScan({"com.westlife.springboot.dubbo.consumer"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
