package cap;
import java.util.*;
public class Twelve {
	public static void main(String[] args) {
        int grades[]=new int[20];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<grades.length;i++){
            grades[i]=s.nextInt();
            if(grades[i]==-1){
                break;
            }
        }
        System.out.format("%.2f",Average(grades));
    }
    static double Average(int grades[]){
        int sum=0;
        for(int i=0;i<grades.length;i++){
            sum=sum+grades[i];
        }
        return sum/grades.length;
    }
}
