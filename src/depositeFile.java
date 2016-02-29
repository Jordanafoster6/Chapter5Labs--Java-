import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class depositeFile {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:\\Users\\Jordan\\Desktop\\Java Coursework\\Chapter5Labs\\src\\Deposits.txt");
		File file2 = new File("C:\\Users\\Jordan\\Desktop\\Java Coursework\\Chapter5Labs\\src\\Withdrawls.txt");
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard1 = new Scanner(file1);
		Scanner keyboard2 = new Scanner(file2);
		savingsAccount account1 = new savingsAccount();
		
		System.out.print("Enter your annual interest rate.");
		account1.setAnnualInterestRate(keyboard.nextDouble());
		
		account1.setBalance(500);

		double interestTotal = 0;
		double withdraw = 0;double deposit = 0;
		while(keyboard2.hasNext() || keyboard1.hasNext())
		{
			
			if(keyboard1.hasNext()){
				deposit = keyboard1.nextDouble();	
				account1.depositing(deposit);
			}
			if(keyboard2.hasNext()){
				withdraw = keyboard2.nextDouble();	
				account1.Withdraw(withdraw);
			}
		}
		
		
		//Interest
		interestTotal += account1.getMonthlyInterest();
		account1.addinterest();
		
		System.out.print("---------------------------- \n");
		System.out.printf("Ending Balance: $%.02f \n", account1.getBalance());
		System.out.printf("Total Interest Earned: $%.02f \n", interestTotal);
		System.out.print("---------------------------- \n");
		
		
		keyboard.close();
		keyboard1.close();
		keyboard2.close();
	}

}
