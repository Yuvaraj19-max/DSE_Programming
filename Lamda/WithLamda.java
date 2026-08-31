package Lamda;

public class WithLamda {
	
	public static void processOrder(OrderStatus status,String orderId) {
		status.updateStatus(orderId);
	}
	
	public static void main(String[] args) {
		
		String orderId = "FO329";
		
		OrderStatus orderplaced = (OrderStatus)-> {
				System.out.println("Order Id: "+orderId+"\nStatus: Order has been placed successfully");
		};
		OrderStatus orderprepared =  (OrderStatus)-> {
				System.out.println("Order Id: "+orderId+"\nStatus: Food is being prepared");
		};
		
		OrderStatus orderDelivery =  (OrderStatus)-> {
				System.out.println("Order Id: "+orderId+"\nStatus: Delivery is on the ");
		};
		
		processOrder(orderplaced, orderId);
		processOrder(orderprepared, orderId);
		processOrder(orderDelivery, orderId);
	}
}
