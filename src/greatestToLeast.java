import java.util.Scanner;

public class greatestToLeast {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int integer;
		int largest = 0;
		int smallest = 100;
		do
		{
			
			System.out.print("Enter an integer, enter -99 when finished. ");
			integer = keyboard.nextInt();
						
			if(integer > largest)
			{
				largest = integer;
			}
			else if (integer < smallest && integer != -99)
			{
				smallest = integer;
			}
			
		}while(integer != -99);
		
		System.out.print("---------------------------------------- \n");
		System.out.printf("The smallest number you entered was: %d \n", smallest);
		System.out.printf("The largest number you entered was: %d \n", largest);
		System.out.print("----------------------------------------");
		
		
		keyboard.close();
		

	}

}
