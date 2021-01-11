package ChemE;

import java.util.Scanner;

public class chemistry 
{
	public static void main(String[]args)
	{
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Select a number from the menu below:");
		System.out.println();
		System.out.println("1 - Periodic Table");
		System.out.println("2 - Molecular Weight");
		System.out.println("3 - Molecular Calculator");
		System.out.println("4 - Half-Life Equations");
		System.out.println("5 - Nuclear Decay Equations");
		System.out.println("6 - Nuclear Fission by Mol");
		System.out.println();
		
		int response;
		response = scan.nextInt();
		
		ptClass periodic = new ptClass();
		
		if (response == 1) // elements on periodic table
		{
			System.out.println();
			periodicTable.Run();
		}
		
		else if (response == 2) // molecular weight
		{
			System.out.println();
			molecularWeight.Run();
		}
		
		else if (response == 3) // molecular calculator
		{
			System.out.println();
			System.out.println("Input compound.");
			String compound = scan.next();
			System.out.println("Input grams.");
			double grams = scan.nextDouble();
			
			System.out.println();
			System.out.printf("%.5f",periodic.moleCalc(compound, grams));
			System.out.print(" mol");
		}
		
		else if (response == 4) // half-life equations
		{
			System.out.println("\nInput 0 for unknown variable. \nFor unnecessary unknown variable, input 1.");
			System.out.println("\nInput initial mass.");
			double massI = scan.nextDouble();
			 
			System.out.println("\nInput final mass.");
			double massF = scan.nextDouble();
			
			System.out.println("\nInput time duration.");
			double time = scan.nextDouble();
			
			System.out.println("\nInput half-life of element.");
			double halflife = scan.nextDouble();
			
			System.out.println("\nInput rate constant.");
			double rate = scan.nextDouble();
			
			periodic.halflife(massI, massF, time, halflife, rate);
			
			
		}
		
		else if (response == 5) // nuclear decay
		{
			// get atomic number and mass number of element undergoing decay
			System.out.println();
			System.out.println("Input mass number.");
			int massNumber = scan.nextInt();
			System.out.println("Input atomic number.");
			int number = scan.nextInt();
			
			// determine which decay is being applied
			System.out.println();
			System.out.println("Input decay type.");
			System.out.println("1 - alpha emission \n2 - beta emission \n3 - positron emission \n4 - electron capture \n5 - gamma decay");
			System.out.println();
			int decay = scan.nextInt();
			System.out.println();
			
			periodic.nuclearDecay(massNumber, number, decay);
			
		}
		
		else if (response == 6) // nuclear fission by mol number
		{
			System.out.println();
			System.out.println("Input mol amount.");
			System.out.println();
			double mol = scan.nextDouble();
			
			periodic.nuclearFission(mol);
		}
		
		else 
		{
		     scan.close();
		}
	}
}
