package oopss;

class Customers{
	public Customers() {
		System.out.println("Parent class constructor");
	}
}

class secondcustomer extends Customers{
	public secondcustomer() {
		System.out.println("child class constructor");
	}
}

/**
 * @author Administrator
 *
 */
public class inhex {
	public static void main(String[] args) {
		secondcustomer second=new secondcustomer();
		
	}
}
