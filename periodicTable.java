package ChemE;

import java.util.Scanner;

public class periodicTable
{
	public static void Run()
	{
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Select search parameter.");
		System.out.println();
		System.out.println("1 - Symbol");
		System.out.println("2 - Atomic Number");
		System.out.println();
		int input;
		input = scan.nextInt();
		
		ptClass table = new ptClass();
		
		if (input == 1)
		{
			System.out.println("Input element symbol.");
			String response;
			response = scan.next();
			
			System.out.println();
			System.out.println(table.getElementS(response)); // print element from searching by symbol
		}
		
		else if (input == 2)
		{
			System.out.println("Input atomic number.");
			int response;
			response = scan.nextInt();
			
			System.out.println();
			System.out.println(table.getElementAN(response)); // print element from searching by atomic number
		}
		
	}
	
	public static void main(String[]args)
	{
		Run();
	}
}
