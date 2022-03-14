package oopss;

 class first{
	public String Name;
	public int Id;
	private int age;
	protected void show() {
		System.out.println("Harsha");
	}
}
class second extends first{
	public void display() {
		System.out.println(Name);
//		System.out.println(age);
	}
}
class third{
	public void display1() {
//		System.out.println(Id);
	}
}
public class encapsulationexample {
	public static void main(String[] args) {
	second test=new second();
//	test.age=19;
	test.show();
}
}
 
