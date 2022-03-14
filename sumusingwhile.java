import java.util.*;
public class sumusingwhile {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int sum=0;
		while(start<=end) {
			sum=sum+start;
			start++;
		}
		System.out.println(sum);
	}
}
