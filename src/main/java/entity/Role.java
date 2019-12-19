package entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * 权限模块-角色实体类
 * @author asus
 *
 */
@Alias("AuthRole")
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String description;
	
	public Role() {
		
	}

	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
