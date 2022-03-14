package abstractionimplementation;

abstract class Operation{
	String Name;
	 abstract int calculateCost();
	 public abstract String toString();
	public Operation(String Name) {
		this.Name=Name;
	}
}
class first extends Operation{
	int length;
	public first(String Name,int length) {
		super(Name);
		this.length=length;
	}
	int  calculateCost() {
		return length*2;
	}
	public String toString() {
		return "Length of scale is "+this.length+" and it's cost is "+calculateCost();
	}
}
class second extends Operation{
	int length;
	public second(String Name,int length) {
		super(Name);
		this.length=length;
	}
	int  calculateCost() {
		return length*2;
	}
	public String toString() {
		return "Length of scale is "+this.length+" and it's cost is "+calculateCost();
	}
}
public class simpleoperations {

	public static void main(String[] args) {
		
		second o1=new second("Two centimeters",2);
		second s2=new second("Three centimeters",3);
		System.out.println(o1.toString());
		System.out.println(s2.toString());
	}

}
