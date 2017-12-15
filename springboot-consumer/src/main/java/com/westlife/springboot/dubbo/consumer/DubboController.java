package com.westlife.springboot.dubbo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.westlife.UserService;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午3:43:45 
 * @version 1.0 
 * @parameter
 * 测试类
 */
@RestController
@RequestMapping("/api/v1/dubbo")
public class DubboController {

	@Autowired
	private UserService userService;//注入接口

	@RequestMapping("/hello")
	public String hello() {
		String name = userService.getUserName();// dubbo远程调用
		System.out.println("username: " + name);
		return name;
	}
}
