package oopss;

abstract class Property{
	abstract void display();
	
}

public class abstractionusing extends Property {
	void display() {
		System.out.println("Abstract method is executed");
	}
	
	public static void main(String[] args) {
		abstractionusing k=new abstractionusing();
		k.display();
	}
}
