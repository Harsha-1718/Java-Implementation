package cap;

class Invoice{
	private String part_number;
	private String part_description;
	private int quantity;
	private double price_per_item;
	
	public Invoice(String part_number,String part_description,int quantity,double price_per_item) {
		this.part_number=part_number;
		this.part_description=part_description;
		this.quantity=quantity;
		this.price_per_item=price_per_item;
	}
	public String getpart_number() {
		return part_number;
	}
	public void setpart_number(String part_number) {
		this.part_number=part_number;
	}
	public String getpart_description() {
		return part_description;
	}
	public void setpart_description(String part_description) {
		this.part_description=part_description;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		if(quantity>0) {
		this.quantity=quantity;
		}
		else {
			this.quantity=0;
		}
	}
	public double getprice_per_item() {
		return price_per_item;
	}
	public void setprice_per_item(double price_per_item) {
		if(price_per_item>0) {
		this.price_per_item=price_per_item;
		}
		else {
			this.price_per_item=0.0;
		}
	}
	public double getInvoice() {
		return quantity*price_per_item;
	}
		
	
}
public class InvoiceTest {
	public static void main(String[] args) {
		Invoice iv=new Invoice("D00","Chair",3,600);
		System.out.println(iv.getInvoice());
	}
}
