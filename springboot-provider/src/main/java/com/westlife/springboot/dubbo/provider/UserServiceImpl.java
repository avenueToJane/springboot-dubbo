package com.westlife.springboot.dubbo.provider;

import com.westlife.UserService;
/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午3:44:27 
 * @version 1.0 
 * @parameter
 *提供者接口的实现类
 */
public class UserServiceImpl implements UserService {

	@Override
	public String getUserName() {
		
		return "通过dubbo远程调用得到的结果";
	}

}
