package ch08T;

public class OrderTest {

	public static void main(String[] args) {
		
		Order myOrder = new Order();
		
		myOrder.orderNumber = "2020110200003";
		myOrder.customerPhone = "01023450001";
		myOrder.customerAddress = "Ω≈√Ã 6±Ê 111-333";
		myOrder.orderDate = "20201102";
		myOrder.orderTime = "130258";
		myOrder.price = 35000;
		myOrder.menuId = "0003";
		
		myOrder.showOrderDetail();
	}

}
