import java.util.Scanner;

public class savingsAccountDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		savingsAccount account1 = new savingsAccount();
		
		System.out.print("Enter your annual interest rate.");
		account1.setAnnualInterestRate(keyboard.nextDouble());
		
		System.out.print("Enter your account balance.");
		account1.setBalance(keyboard.nextDouble());
		
		System.out.print("Enter the number of months your account has been active.");
		int monthsActive = keyboard.nextInt();
		
		double depositTotal = 0;
		double withdrawlTotal = 0;
		double interestTotal = 0;
		
		for(int count = 1; count <= monthsActive;)
		{
			//deposit
			System.out.printf("Enter how much you deposited in your account for month %d.", count);
			double deposit = keyboard.nextDouble();
			account1.depositing(deposit);
			depositTotal += deposit;
			
			//withdraw
			System.out.printf("Enter how much you withdrew from your account for month %d.", count);
			double withdraw = keyboard.nextDouble();
			account1.Withdraw(withdraw);
			withdrawlTotal += withdraw;
			
			//Interest
			System.out.printf("The amount of interest you earned for month %d was $%.02f. \n", count, account1.getMonthlyInterest());
			interestTotal += account1.getMonthlyInterest();
			account1.addinterest();
			
			++count;
		}
		
		System.out.print("---------------------------- \n");
		System.out.printf("Ending Balance: $%.02f \n", account1.getBalance());
		System.out.printf("Total Deposits: $%.02f \n", depositTotal);
		System.out.printf("Total Withdrawls: $%.02f \n", withdrawlTotal);
		System.out.printf("Total Interest Earned: $%.02f \n", interestTotal);
		System.out.print("---------------------------- \n");
		
		
		keyboard.close();
	}

}
