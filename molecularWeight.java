package ChemE;

import java.util.*;
import java.lang.*;

public class molecularWeight 
{
	
	public static void Run()
	{
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Input compound.");
		System.out.println();
		
		String response = scan.next();
		System.out.println();
		
		scan.close();
		
		ArrayList<String> elements = new ArrayList<String>();
		
		for (int i = 0; i < response.length(); i++)
		{
			if (Character.isUpperCase(response.charAt(i))) // if upper case
			{
				if (i == response.length()-1) // if last index
				{
					elements.add(Character.toString(response.charAt(i)));
				}
				
				else // if not last index
				{
					if (Character.isLowerCase(response.charAt(i+1))) // if next index is lower case
					{
						elements.add(Character.toString(response.charAt(i))+Character.toString(response.charAt(i+1)));
					}
					
					else // if next index upper case
					{
						elements.add(Character.toString(response.charAt(i)));
					}
				}
			}
		}
		
		ptClass periodic = new ptClass();
		
		double output = 0;
		
		for (String n: elements)
		{
			output += periodic.getElementS(n).getWeight();
		}
		
		System.out.println(output);
		
		
	}
}
