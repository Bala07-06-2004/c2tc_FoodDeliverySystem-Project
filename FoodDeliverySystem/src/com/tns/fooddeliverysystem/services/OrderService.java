package com.tns.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.Order;

public class OrderService {

	private List<Order> orders= new ArrayList<>();
	private List<DeliveryPerson> deliveryPersons= new ArrayList<>(); 
	public void placeorder (Order order) {
		orders.add (order);
		}
	
	public List<Order> getOrders () {
		return orders;
		}
	
	public void addDeliveryPerson (DeliveryPerson deliveryPerson) {
		deliveryPersons.add(deliveryPerson);
		}
	
	public List<DeliveryPerson> getDeliveryPersons () {
		return deliveryPersons; 
		}
	
	public void assignDeliveryPersonToOrder (int orderId, int deliveryPersonId) {
		for (Order order :orders) {
			if (order.getOrderId()== orderId) {
				for (DeliveryPerson deliveryPerson: deliveryPersons) {
					if (deliveryPerson.getDeliveryPersonId () == deliveryPersonId) {
						order.setDeliveryPerson (deliveryPerson);	
					return;
				}
			}
		}
		}}}
