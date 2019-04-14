package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * InterfaceName: IUserService
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/4/8
 */

public interface IUserService {
	ServerResponse<User> login(String username, String password);

	public ServerResponse<String> register(User user);

	public ServerResponse<String> checkValid(String str, String type);

	public ServerResponse selectQuestion(String username);
}
