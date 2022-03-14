import java.util.*;
public class voting {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		int age=s.nextInt();
		String k=(age>=18)?"Eligible":"Not eligible";
		System.out.println(k);
	}
}
