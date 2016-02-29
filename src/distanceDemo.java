import java.util.Scanner;

public class distanceDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		distance mph1 = new distance();
		
		System.out.print("How fast were you going? (MPH).");
		mph1.setMPH(keyboard.nextInt());
		
		while(mph1.getMPH() < 0)
		{
			System.out.println("Error, you entered a number below 0.");
			System.out.println("Please enter a valid number of hours.");
			mph1.setHours(keyboard.nextInt());
		}
		
		System.out.print("How long did it take to go the distance traveled? (hours).");
		mph1.setHours(keyboard.nextInt());
		
		while(mph1.getHours() < 0)
		{
			System.out.println("Error, you entered a number below 0.");
			System.out.println("Please enter a valid number of hours.");
			mph1.setHours(keyboard.nextInt());
		}
		
		System.out.println("----------------------------");
		for(int count = 1; count <= mph1.getHours(); ++count)
		{
			System.out.printf("%d           %d miles \n", count, (mph1.getMPH() * count));
		}
		keyboard.close();
	}
		
}
