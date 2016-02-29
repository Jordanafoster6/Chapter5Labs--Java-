import java.util.Scanner;

public class barChart {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the sales for store 1.");
		int store1 = keyboard.nextInt();
		int level1num = (store1 / 100);
		
		System.out.print("Please enter the sales for store 2.");
		int store2 = keyboard.nextInt();
		int level2num = (store2 / 100);
		
		System.out.print("Please enter the sales for store 3.");
		int store3 = keyboard.nextInt();
		int level3num = (store3 / 100);
		
		System.out.print("Please enter the sales for store 4.");
		int store4 = keyboard.nextInt();
		int level4num = (store4 / 100);
		
		System.out.print("Please enter the sales for store 5.");
		int store5 = keyboard.nextInt();
		int level5num = (store5 / 100);
		
		System.out.print("SALES BAR CHART \n");
		
		for(int r = 1; r <= 1; r++)
		{
			System.out.print("Store 1: ");
			for(int c = 0; c < level1num; ++c)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			System.out.print("Store 2: ");
			for(int c = 0; c < level2num; ++c)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			System.out.print("Store 3: ");
			for(int c = 0; c < level3num; ++c)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			System.out.print("Store 4: ");
			for(int c = 0; c < level4num; ++c)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			System.out.print("Store 5: ");
			for(int c = 0; c < level5num; ++c)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		keyboard.close();
	}
}
