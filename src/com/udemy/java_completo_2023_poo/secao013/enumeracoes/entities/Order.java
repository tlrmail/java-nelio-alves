package com.udemy.java_completo_2023_poo.secao013.enumeracoes.entities;

import java.util.Date;

import com.udemy.java_completo_2023_poo.secao013.enumeracoes.entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus orderStatus;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, Date moment, OrderStatus orderStatus) {
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
