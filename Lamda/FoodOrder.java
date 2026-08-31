package Lamda;

public class FoodOrder {
	
	public static void processOrder(OrderStatus status,String orderId) {
		status.updateStatus(orderId);
	}
	
public static void main(String[] args) {
	
	OrderStatus orderplaced = new OrderStatus() {
		public void updateStatus(String orderId) {
			System.out.println("Order Id: "+orderId+"\nStatus: Order has been placed successfully");
		}
		
	};
	OrderStatus orderprepared = new OrderStatus() {
		public void updateStatus(String orderId) {
			System.out.println("Order Id: "+orderId+"\nStatus: Food is being prepared");
		}
	};
	
	OrderStatus orderDelivery = new OrderStatus() {
		public void updateStatus(String orderId) {
			System.out.println("Order Id: "+orderId+"\nStatus: Delivery is on the ");
		}
	};
	
	String orderId = "FO329";
	
	processOrder(orderplaced, orderId);
	processOrder(orderprepared, orderId);
	processOrder(orderDelivery, orderId);
	
}
}
