package oopss;



class some{
	public int a;
	public int b;
	
	some(){
		System.out.println("Parameterless constructor");
	}
	
	some(int a,int b){
		a=20;
		b=30;
		System.out.println("Parameterized constructor");
	}
}


public class paracons {
public static void main(String[] args) {
	some s=new some();
	some s1=new some(20,30);
}
}
