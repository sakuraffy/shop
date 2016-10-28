package cn.sakuraffy.shop.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_category")
public class Category {
	private Integer id;
	private boolean hot;
	private String type;
	private Account account;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(Integer id, boolean hot, String type) {
		super();
		this.id = id;
		this.hot = hot;
		this.type = type;
	}

	public Category(boolean hot, String type) {
		super();
		this.hot = hot;
		this.type = type;
	}

	@Id
	@GeneratedValue
	public final Integer getId() {
		return id;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	public final boolean isHot() {
		return hot;
	}
	public final void setHot(boolean hot) {
		this.hot = hot;
	}
	public final String getType() {
		return type;
	}
	public final void setType(String type) {
		this.type = type;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="aid")
	public final Account getAccount() {
		return account;
	}
	public final void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", hot=" + hot + ", type=" + type
				+ ", account=" + account + "]";
	}
}
