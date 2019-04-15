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

	public ServerResponse<String> checkAnswer(String username, String question, String answer);

	public ServerResponse<String> forgetResetPassWord(String username, String passWordNew, String forgetToken);

	public ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

	public ServerResponse<User> update_information(User user);

	public ServerResponse<User> getInformation(Integer userId);
}
