import java.util.*;
public class primenumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean k=true;
		int n=s.nextInt();
		if(n==0||n==1) {
			k=false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				k=false;
			}
		}
		if(k==false) {
			System.out.println("Not a prime");
		}
		else {
			System.out.println("Prime");
		}
	}
}
