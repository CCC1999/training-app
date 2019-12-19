package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import mapper.UserMapper;

/**
 * 用户业务实现类
 * @author asus
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean verifyUser(String username, String password) {

		return userMapper.findByNameAndPassword(username, password)!=null;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		userMapper.save(user);
		System.out.println(user);
	}
	
}
