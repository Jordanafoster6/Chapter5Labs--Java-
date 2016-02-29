import java.util.Scanner;

public class sumNumbers {

	public static void main(String[] args) 
	{
		int total = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a positive, non zero, number.)");
		int answer = keyboard.nextInt();
	
		for(int count = 1; count <= answer; count++)
		{
			total += count;
		}
		System.out.println("eg");
		keyboard.close();
	}
}
