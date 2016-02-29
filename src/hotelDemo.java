import java.util.Scanner;

public class hotelDemo {

	public static void main(String[] args) {
		
		int numFloors;
		int numRooms = 0;
		int numOccupied = 0;
		int count = 1;
		double occRate;
		
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			System.out.print("How many floors does the hotel have?");
			numFloors = keyboard.nextInt();
			
		}while(numFloors < 1);
		
		do 
		{
			System.out.printf("How many rooms are on floor %d?", count);
			numRooms += keyboard.nextInt();
			//totalRooms += numRooms;
			
			System.out.printf("How many rooms are occupied on floor %d?", count);
			numOccupied += keyboard.nextInt();
			//totalOccupied += numOccupied;
			
			count++;
			
		}while(count <= numFloors);
		
		occRate = (double) (numOccupied / numRooms);
			
		System.out.println("----------------------------");
		System.out.printf("Number of floors: %d \n", numFloors);
		System.out.printf("Number of rooms: %d \n", numRooms);
		System.out.printf("Number of occupied rooms: %d  \n", numOccupied);
		System.out.printf("Occupancy Rate: %.2f \n", occRate);
		System.out.println("----------------------------");
		keyboard.close();
	}

}
