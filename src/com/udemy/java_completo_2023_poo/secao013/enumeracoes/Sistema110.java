package com.udemy.java_completo_2023_poo.secao013.enumeracoes;

import java.util.Date;

import com.udemy.java_completo_2023_poo.secao013.enumeracoes.entities.Order;
import com.udemy.java_completo_2023_poo.secao013.enumeracoes.entities.enums.OrderStatus;

public class Sistema110 {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMMENT);
		
		System.out.println(order);
		
		Order order2 = new Order(1458, new Date(), OrderStatus.valueOf("PROCESSING"));
		
		System.out.println(order2);
		
		OrderStatus os1 = OrderStatus.SHIPPED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		

	}

}
