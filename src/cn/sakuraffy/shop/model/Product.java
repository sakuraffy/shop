package cn.sakuraffy.shop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_product")
public class Product implements java.io.Serializable {

	private static final long serialVersionUID = -5102917489458854913L;

	private Integer id;
	private Category category;
	private String name;
	private Double price;
	private String pic;
	private String remark;
	private String xremark;
	private Date date;
	private Boolean commend;
	private Boolean open;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(Integer id, Category category, String name, Double price,
			String pic, String remark, String xremark, Date date,
			Boolean commend, Boolean open) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
		this.pic = pic;
		this.remark = remark;
		this.xremark = xremark;
		this.date = date;
		this.commend = commend;
		this.open = open;
	}



	@Id
	@GeneratedValue
	@Column(name="id",nullable=false)
	public final Integer getId() {
		return id;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="cid")
	public final Category getCategory() {
		return category;
	}
	public final void setCategory(Category category) {
		this.category = category;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final Double getPrice() {
		return price;
	}
	public final void setPrice(Double price) {
		this.price = price;
	}
	public final String getPic() {
		return pic;
	}
	public final void setPic(String pic) {
		this.pic = pic;
	}
	public final String getRemark() {
		return remark;
	}
	public final void setRemark(String remark) {
		this.remark = remark;
	}
	public final String getXremark() {
		return xremark;
	}
	public final void setXremark(String xremark) {
		this.xremark = xremark;
	}
	public final Date getDate() {
		return date;
	}
	public final void setDate(Date date) {
		this.date = date;
	}
	public final Boolean getCommend() {
		return commend;
	}

	public final void setCommend(Boolean commend) {
		this.commend = commend;
	}
	public final Boolean getOpen() {
		return open;
	}
	public final void setOpen(Boolean open) {
		this.open = open;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", name="
				+ name + ", price=" + price + ", pic=" + pic + ", remark="
				+ remark + ", xremark=" + xremark + ", date=" + date
				+ ", commend=" + commend + ", open=" + open + "]";
	}
	
	
}