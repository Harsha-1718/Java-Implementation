package cap;
import java.util.*;
public class Account {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int balance=s.nextInt();
        int debitamount=s.nextInt();
        debit(balance,debitamount);
    }
    static void debit(int balance,int debitamount){
        if(balance>debitamount){
            int finalbalance=balance-debitamount;
            System.out.println(finalbalance);
        }
        else if(balance<debitamount){
            System.out.println("Debit amount exceeded balance");
        }
    }
}
