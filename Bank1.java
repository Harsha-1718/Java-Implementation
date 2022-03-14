class Bank11{
	 BankAccount[] list;
	static int lastAssignedNo;
	String accountNo;
	static{
		lastAssignedNo=0;
	}
	public Bank11() {
		this.accountNo="Z0001 "+ ++Bank11.lastAssignedNo;
	}
	public BankAccount[] getBankAccount() {
		return list;
	}
	public void setBankAccount(BankAccount[] list) {
		this.list=list;
	}
	
}
public class Bank1 {

	public static void main(String[] args) {
		Bank11 bt=new Bank11();
		Bank11 bt1=new Bank11();
		System.out.println(bt.accountNo);
		System.out.println(bt1.accountNo);
		for(int i=0;i<bt.list.length;i++) {
			
		}
	}

}
