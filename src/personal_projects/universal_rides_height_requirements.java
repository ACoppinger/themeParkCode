package personal_projects;
import java.util.Scanner; 

public class universal_rides_height_requirements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter height in inches:");
		int height = input.nextInt();
		if (height < 34)
				{
			System.out.println("No results");
				}
		if (height >= 36)
		{
			System.out.println("Woody Woodpecker's Nuthouse Coaster");
		}
		if (height >= 40)
		{
			System.out.println("Despicable Me Minion Mayhem, Fast & Furious Supercharged, Race Through New York Starring Jimmy Fallon, The Simpsons Ride, TRANSFORMERS:  The Ride 3D");
		}
		if (height >= 42)
		{
			System.out.println("Harry Potter and the Escape from Gringotts, MEN IN BLACK Alien Attack");
		}
		if (height >= 48)
		{
			System.out.println("Revenge of the Mummy");
		}
		if (height >= 51)
		{
			System.out.println("Hollywood Rip Ride Rockit");
		}

	}


}
