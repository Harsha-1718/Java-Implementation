import java.util.*;
public class prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean k=true;
		if(num==0||num==1) {
			k=false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				k=false;
			}
		}
		if(k==true) {
			System.out.println(num+" "+"is a prime number");
		}
		else {
			System.out.println(num+" "+"is not a prime number");
		}
	}
	
}
