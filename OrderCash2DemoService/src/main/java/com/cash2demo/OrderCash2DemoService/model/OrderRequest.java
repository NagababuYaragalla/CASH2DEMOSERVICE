package com.cash2demo.OrderCash2DemoService.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String orderNumber;
	private String skuModelCode;
	private String orderLineItem;
	private String organization;

	public OrderRequest() {
	}

	public OrderRequest(String orderNumber, String skuModelCode, String orderLineItem, String organization) {
		this.orderNumber = orderNumber;
		this.skuModelCode = skuModelCode;
		this.orderLineItem = orderLineItem;
		this.organization = organization;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSkuModelCode() {
		return skuModelCode;
	}

	public void setSkuModelCode(String skuModelCode) {
		this.skuModelCode = skuModelCode;
	}

	public String getOrderLineItem() {
		return orderLineItem;
	}

	public void setOrderLineItem(String orderLineItem) {
		this.orderLineItem = orderLineItem;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

}