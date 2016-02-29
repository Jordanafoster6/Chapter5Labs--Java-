
public class savingsAccount {

	private double AnnualInterestRate;
	private double balance;
	
	
	public double getAnnualInterestRate() {
		return AnnualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		AnnualInterestRate = annualInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double Withdraw(double withdrawl)
	{
		balance = (balance - withdrawl);
		return balance;
	}
	
	public double depositing(double deposit)
	{
		balance = (balance + deposit);
		return balance;
	}
	
	public double addinterest()
	{
		balance += getMonthlyInterest();
		return balance;
	}
	
	public double getMonthlyInterest()
	{
		return (balance * (AnnualInterestRate / 12 / 100));
	}
	
}
