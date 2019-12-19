package service;

import entity.User;

/**
 * 用户业务接口
 * @author asus
 *
 */
public interface IUserService {
	/**
	 * 验证用户名和密码是否正确
	 * @param username
	 * @param password
	 * @return 成功或失败
	 */
	boolean verifyUser(String username,String password);
	
	/**
	 * 注册用户
	 * @param user
	 */
	void registerUser(User user);
}
