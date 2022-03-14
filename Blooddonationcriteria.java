import java.util.*;
public class Blooddonationcriteria {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=20&&weight<=40) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}
