class BankAccount{
	String accountNo;
	String accountName;
	int  balance=1000;
	public BankAccount(String accountNo,String accountName) {
		this.accountNo=accountNo;
		this.accountName=accountName;
	}
}
public class Bank {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount("D27","Harsha");
		System.out.println(ba.accountName);
		System.out.println(ba.accountNo);
		System.out.println(ba.balance);

	}

}
