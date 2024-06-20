package com.app.core;

public class Order {
	private int orderId;
	private static int idgen; 
	private Pet petId;
	private int quantity;
	private Status status;
	public Order(int orderId, Pet petId, int quantity, Status status) {
		super();
		this.orderId = ++idgen;
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Pet getPetId() {
		return petId;
	}
	public void setPetId(Pet petId) {
		this.petId = petId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
	
	

}
