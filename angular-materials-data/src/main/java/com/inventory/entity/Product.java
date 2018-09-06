package com.inventory.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID", unique = true, nullable = false)
	private Integer id;
	
	private String product_name;
	
	private String product_type;
	
	private String product_description;
	
	private Long product_price;
	
	private Long product_quantity;
    
	private String payment_mode;
	
	/**
	 * @return the payment_mode
	 */
	public String getPayment_mode() {
		return payment_mode;
	}
	/**
	 * @param payment_mode the payment_mode to set
	 */
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public Product() {
		
	}
	/**
	 * @param id
	 * @param product_name
	 * @param product_type
	 * @param product_description
	 * @param product_price
	 * @param product_quantity
	 * @param product_delivery
	 */
	public Product(Integer id, String product_name, String product_type, String product_description, Long product_price,
			Long product_quantity, String payment_mode) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_type = product_type;
		this.product_description = product_description;
		this.product_price = product_price;
		this.product_quantity = product_quantity;
		this.payment_mode = payment_mode;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the product_type
	 */
	public String getProduct_type() {
		return product_type;
	}

	/**
	 * @param product_type the product_type to set
	 */
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	/**
	 * @return the product_description
	 */
	public String getProduct_description() {
		return product_description;
	}

	/**
	 * @param product_description the product_description to set
	 */
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	/**
	 * @return the product_price
	 */
	public Long getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(Long product_price) {
		this.product_price = product_price;
	}

	/**
	 * @return the product_quantity
	 */
	public Long getProduct_quantity() {
		return product_quantity;
	}

	/**
	 * @param product_quantity the product_quantity to set
	 */
	public void setProduct_quantity(Long product_quantity) {
		this.product_quantity = product_quantity;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
