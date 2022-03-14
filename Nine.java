package cap;
import java.util.*;
public class Nine {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int counter=s.nextInt();
		int arr[]=new int[counter];
		for(int i=0;i<counter;i++) {
			arr[i]=s.nextInt();
		}
		int largest=arr[0];
		for(int i=0;i<counter;i++) {
			int number=arr[i];
			if(number>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
