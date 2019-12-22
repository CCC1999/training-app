import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import entity.User;
import mapper.UserMapper;
import service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestUserMapper {
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	IUserService ius;
	
	@Test
	public void findUser() {
		User u = userMapper.findByNameAndPassword("张利勇","123456");
		System.out.println(u);
	}
	
	@Test
	public void saveUser() {
		User u= new User("","",1,1);
		userMapper.save(u);
	}
	@Test
	public void testVerifyUser() {
		System.out.println(ius.verifyUser("zhangsan", "123"));
	}
	@Test
	public void registerUser() {
		User u = new User("数据库","123",1,1);
		ius.registerUser(u);
	}
	@Test
	public void query() {
		List<User> users= ius.findAll();
		for(User user : users) {
			System.out.println(user);
		}
		
	}
}
