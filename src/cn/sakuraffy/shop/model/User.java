package cn.sakuraffy.shop.model;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Date birthday;
	
	public User(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	public User(Integer id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public final Integer getId() {
		return id;
	}
	
	public final void setId(Integer id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final Date getBirthday() {
		return birthday;
	}
	public final void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
