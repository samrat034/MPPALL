package Lab5_1;

//import java.util.Calendar;
import java.util.GregorianCalendar;

public class Order {
	private Commissioned com;
	private int orderNo;
	//private Calendar orderDate;
	private GregorianCalendar orderDate;
	private double orderAmount;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public GregorianCalendar getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(GregorianCalendar orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Order(Commissioned com,int orderNo, GregorianCalendar orderDate, double orderAmount) {
		this.com=com;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	
	

}
