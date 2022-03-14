import java.util.*;
public class sumusingfor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				int start=s.nextInt();
				int end=s.nextInt();
				int sum=0;
				for(int i=start;i<=end;i++) {
					 sum=sum+i;
				}
				System.out.println(sum);
	}
}
