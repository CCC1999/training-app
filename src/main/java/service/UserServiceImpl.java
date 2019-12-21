package service;

import java.util.List;

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
	public int registerUser(User user) {
		return userMapper.save(user);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	
	
}
