import java.util.Scanner;

public class PayrollDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Payroll pay1 = new Payroll();
		
		double withholdings = 0;
		
		int sentinel;
		do
		{
			//ID NUmber
			System.out.print("Enter an employee ID Number.");
			pay1.setIdNumber(keyboard.nextDouble());
			if(pay1.getIdNumber() < 0)
			{
				System.out.print("Error, negative numbers arent accepted. \n");
				System.out.print("Please enter a valid ID Number. \n");
				pay1.setIdNumber(keyboard.nextInt());
			}
			keyboard.nextLine();
			
			
			//Gross pay
			System.out.print("Enter the employee's gross pay.");
			pay1.setGrossPay(keyboard.nextDouble());
			if(pay1.getGrossPay() < 0)
			{
				System.out.print("Error, negative numbers arent accepted. \n");
				System.out.print("Please enter a valid gross pay. \n");
				pay1.setGrossPay(keyboard.nextDouble());
			}
			keyboard.nextLine();
				
			do
			{
				//State Tax
				System.out.print("Enter state tax applied to gross pay.");
				pay1.setStateTax(keyboard.nextDouble());
				if(pay1.getStateTax() < 0)
				{
					System.out.print("Error, negative numbers arent accepted. \n");
					System.out.print("Please enter a valid state tax. \n");
					pay1.setStateTax(keyboard.nextDouble());
				}
				else if(pay1.getStateTax() > pay1.getGrossPay())
				{
					System.out.print("Error, the state tax cannot be greater than the gross pay. \n");
					System.out.print("Please enter a valid state tax. \n");
					pay1.setStateTax(keyboard.nextDouble());
				}
				keyboard.nextLine();
				
				//Federal Tax
				System.out.print("Enter Federal tax applied to gross pay.");
				pay1.setFederalTax(keyboard.nextDouble());
				if(pay1.getFederalTax() < 0)
				{
					System.out.print("Error, negative numbers arent accepted. \n");
					System.out.print("Please enter a valid Federal tax. \n");
					pay1.setFederalTax(keyboard.nextDouble());
				}
				else if(pay1.getFederalTax() > pay1.getGrossPay())
				{
					System.out.print("Error, the Federal tax cannot be greater than the gross pay. \n");
					System.out.print("Please enter a valid Federal tax. \n");
					pay1.setFederalTax(keyboard.nextDouble());
				}
				keyboard.nextLine();
				
				//FICA
				System.out.print("Enter FICA withholdings applied to gross pay.");
				pay1.setFICA(keyboard.nextDouble());
				if(pay1.getFICA() < 0)
				{
					System.out.print("Error, negative numbers arent accepted. \n");
					System.out.print("Please enter a valid FICA withholding. \n");
					pay1.setFICA(keyboard.nextDouble());
				}
				else if(pay1.getFICA() > pay1.getGrossPay())
				{
					System.out.print("Error, the FICA withholding cannot be greater than the gross pay. \n");
					System.out.print("Please enter a valid FICA withholding. \n");
					pay1.setFICA(keyboard.nextDouble());
				}
				keyboard.nextLine();
				
				withholdings = pay1.getStateTax() + pay1.getFederalTax() + pay1.getFICA();
				
			}while(withholdings > pay1.getGrossPay());
				
			System.out.print("---------------------------- \n");
			System.out.printf("Gross Pay: $%.02f \n", pay1.getGrossPay());
			System.out.printf("Withholdings: $%.02f \n", withholdings);
			System.out.printf("Net Pay: $%.02f \n", pay1.getNetPay());
			System.out.print("---------------------------- \n");
			
			System.out.print("Enter 1 to continue or 0 to finish.");
			sentinel = keyboard.nextInt();
			
		}while(sentinel != 0);

		System.out.print("Thank you payroll completed.");
		keyboard.close();
	}

}
