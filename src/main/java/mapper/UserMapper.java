package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.User;

/**
 * 用户Dao类
 * @author asus
 *
 */
public interface UserMapper {
	//-- 根据用户应和密码查找用户
	User findByNameAndPassword(@Param("username") String username,@Param("password") String password);
	User findByName(String username);
	User findById(int id);
	List<User> findAll();
	void updateUser(User user);
	void deleteUser(int id);
	void save(User user);
	
	User findUserAndRole();
	
}
