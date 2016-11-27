package cn.sakuraffy.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_account")
public class Account implements java.io.Serializable {
	
	private static final long serialVersionUID = 8257930349608306278L;
	
	private Integer id;
	private String login;
	private String name;
	private String pass;
	
	// Action --> ModelDriven
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(Integer id, String login, String name, String pass) {
		super();
		this.id = id;
		this.login = login;
		this.name = name;
		this.pass = pass;
	}
	
	public Account(String login, String name, String pass) {
		super();
		this.login = login;
		this.name = name;
		this.pass = pass;
	}
	
	public Account(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}

	@Id
	@GeneratedValue
	public final Integer getId() {
		return id;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	public final String getLogin() {
		return login;
	}
	public final void setLogin(String login) {
		this.login = login;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPass() {
		return pass;
	}
	public final void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", login=" + login + ", name=" + name
				+ ", pass=" + pass + "]";
	}
	
}
