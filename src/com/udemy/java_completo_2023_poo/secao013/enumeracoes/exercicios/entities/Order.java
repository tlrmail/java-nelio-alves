package com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.udemy.java_completo_2023_poo.secao013.enumeracoes.exercicios.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public Double total() {
		Double total = 0.0d;
		for(OrderItem it: items) {
			total = total + it.subTotal();
		}
		return total;
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		StringBuilder retorno = new StringBuilder();
		retorno.append("ORDER SUMMARY:");
		retorno.append("\nOrder moment: ".concat(sdf.format(this.moment)));
		retorno.append("\nOrder status:".concat(this.status.name()));
		retorno.append("\n".concat(this.client.toString()));
		retorno.append("\nOrder items:");
		for(OrderItem item: items) {
			retorno.append("\n"+item.toString());
		}
		retorno.append("\nTotal price: $" + this.total());
		
		return retorno.toString();
	}
	

}
