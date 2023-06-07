package entities;

import entities.enums.OrderStatus;

public class Order {
	private String moment;
	private OrderStatus status;
	
	public Order() {
	}

	public Order( String moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "\nORDER SUMMARY: \nOrder moment: " + moment + "\nORDER statud : " + status;
	}
	
	
	
}
