package com.mmall.common;

/**
 * ClassName: Const
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/4/8
 */

public class Const {
	public static final String CURRENT_USER = "currentUser";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";

	public interface Role {
		// 普通用户
		int ROLE_CUSTOMER = 0;
		// 管理员
		int ROLE_ADMIN = 1;
	}




}
