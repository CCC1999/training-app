package entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * 权限模块-用户实体类
 * @author asus
 * @since jdk8
 * 2019-12-19 pm 15:00
 */
@Alias("AuthUser")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	//--成员变量
	private int id;
	private String username;
	private String password;
	private int roleId;
	private int status;	
	private Role role;
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	//-- 构造器
	public User() {
	}
	public User(String username, String password, int roleId, int status) {
		super();
		this.username = username;
		this.password = password;
		this.roleId = roleId;
		this.status = status;
	}
	
	//-- getter和setter方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", roleId=" + roleId
				+ ", status=" + status + ", role=" + role + "]";
	}
	
	
}
