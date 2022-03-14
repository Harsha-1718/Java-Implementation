import java.util.*;
public class Grades {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		if(marks>=90) {
			System.out.println("A Grade");
		}
		else if(marks>=80&&marks<90) {
			System.out.println("B Grade");
		}
		else if(marks>=70&&marks<80) {
			System.out.println("C Grade");
		}
		else if(marks>=60&&marks<70) {
			System.out.println("D Grade");
		}
		else if(marks>=50&&marks<60) {
			System.out.println("E Grade");
		}
		else {
			System.out.println("Fail");
		}
	}
}
