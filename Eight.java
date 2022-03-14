package cap;
import java.util.*;
public class Eight {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(n2%n1==0) {
			System.out.println(n1+" is a multiple of "+n2);
		}
		else {
			System.out.println(n1+" is a not a multiple of "+n2);		
			}
	}
}
