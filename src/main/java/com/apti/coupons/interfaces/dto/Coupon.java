package com.apti.coupons.interfaces.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Coupon implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5212675438217537376L;
	@Id
	@GeneratedValue
	private Long id;
	private String category;
	private String couponcode;
	private String description;
	private String merchant;
	private String title;
	@OneToOne
	@JoinColumn(name="id")	    
	private Store stor_id;
	private Date expire_at;
	private Date published_at;
	
	public Coupon()
	{}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCouponcode() {
		return couponcode;
	}
	public void setCouponcode(String couponcode) {
		this.couponcode = couponcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getTitel() {
		return title;
	}
	public void setTitel(String titel) {
		this.title = titel;
	}
	public Store getStore() {
		return stor_id;
	}
	public void setStore(Store store) {
		this.stor_id = store;
	}
	public Date getExpire_at() {
		return expire_at;
	}
	public void setExpire_at(Date expire_at) {
		this.expire_at = expire_at;
	}
	public Date getPublished_at() {
		return published_at;
	}
	public void setPublished_at(Date published_at) {
		this.published_at = published_at;
	}
	
	
}
