package cap;
class SavingsAccount{
	private static double annualIntrestRate;
	private double savingsBalance;
	public SavingsAccount() {
		annualIntrestRate=0.0;
		savingsBalance=0.0;
	}
	public SavingsAccount(double annualIntrestRate,double savingsBalance) {
		this.annualIntrestRate=annualIntrestRate;
		this.savingsBalance=savingsBalance;
	}
	public double getannualIntrestRate() {
		return annualIntrestRate;
	}
	public void setannualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate=annualIntrestRate;
	}
	public double getsavingsBalance() {
		return savingsBalance;
	}
	public void setsavingsBalance(double savingsBalance) {
		this.savingsBalance=savingsBalance;
	}
	public double calculateMonthlyInterest() {
		double intRate = (savingsBalance * annualIntrestRate/12);
		savingsBalance = savingsBalance + intRate;
		return intRate;
		}
	public static void modifyInterestRate(double newInteresRate) {
		annualIntrestRate = newInteresRate;
		}
}
public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount();
		SavingsAccount saver2=new SavingsAccount();
		saver1.setsavingsBalance(2000);
		saver2.setsavingsBalance(3000);
		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.getsavingsBalance());
		System.out.println(saver2.getsavingsBalance());
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.getsavingsBalance());
		System.out.println(saver2.getsavingsBalance());
	}
}
