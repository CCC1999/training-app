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
	
	//-- 1.依靠Spring获取UserMapper的实现类
	@Autowired
	UserMapper userMapper;
	@Autowired
	IUserService ius;
	
	@Test
	public void findUser() {
		//-- 查询系统中是否有该用户
		User u = userMapper.findByNameAndPassword("zhangsan","123");
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
		User u = new User("关系","123",1,1);
		ius.registerUser(u);
	}
	@Test
	public void query() {
		
		System.out.println(userMapper.findUserAndRole());
		
	}
}
