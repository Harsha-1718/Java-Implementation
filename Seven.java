package cap;
import java.util.*;
public class Seven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		int sum=n1+n2+n3;
		int product=n1*n2*n3;
		double avg=n1+n2+n3/3;
		System.out.println("Sum is="+sum);
		System.out.println("Product is="+product);
		System.out.println("Average is="+avg);
		large(n1,n2,n3);
		small(n1,n2,n3);
	}
	
	static void large(int n1,int n2,int n3) {
		if(n1>n2&&n1>n3) {
			System.out.println(n1+" is larger");
		}
		else if(n2>n3&&n2>n1) {
			System.out.println(n2+" is greater");
		}
		else {
			System.out.println(n3+" is greater");
		}
	}
	static void small(int n1,int n2,int n3) {
		if(n1<n2&&n1<n3) {
			System.out.println(n1+" is smaller");
		}
		else if(n2<n1&&n2<n3) {
			System.out.println(n2+" is smaller");
		}
		else {
			System.out.println(n3+" is smaller");
		}
	}
}
