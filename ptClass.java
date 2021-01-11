package ChemE;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ptClass 
{
	ArrayList<element> table = new ArrayList<element>();
	
	public ptClass()
	{
		/*for (int i = 0; i < 118; i++)
		{
			table.add(new element("cooper","cooper","cg",17,17.5));
		}
		
		table.set(2, new element("Lithium", "Alkali Metal", "Li", 3, 6.94));
		*/
		
		table.add(new element("Hydrogen", "Nonmetals", "H", 1, 1.008));
		table.add(new element("Helium", "Noble Gases", "He", 2, 4.0026));
		table.add(new element("Lithium", "Alkali Metals", "Li", 3, 6.94));
		table.add(new element("Beryllium", "Alkaline Earth Metals", "Be", 4, 9.0122));
		table.add(new element("Boron", "Metalloids", "B", 5, 10.81));
		table.add(new element("Carbon", "Nonmetals", "C", 6, 12.011));
		table.add(new element("Nitrogen", "Nonmetals", "N", 7, 14.007));
		table.add(new element("Oxygen", "Nonmetals", "O", 8, 15.999));
		table.add(new element("Fluorine", "Nonmetals", "F", 9, 18.998));
		table.add(new element("Neon", "Noble Gases", "Ne", 10, 20.180));
		table.add(new element("Sodium", "Alkali Metals", "Na", 11, 22.990));
		table.add(new element("Magnesium", "Alkaline Earth Metals", "Mg", 12, 24.305));
		table.add(new element("Aluminium", "Post-Transition Metals", "Al", 13, 26.982));
		table.add(new element("Silicon", "Metalloids", "Si", 14,  28.085));
		table.add(new element("Phosphorus", "Nonmetals", "P", 15, 30.974));
		table.add(new element("Sulfur", "Nonmetals", "S", 16, 32.06));
		table.add(new element("Chlorine", "Nonmetals", "Cl", 17, 35.45));
		table.add(new element("Argon", "Noble Gases", "Ar", 18, 39.948));
		table.add(new element("Potassium", "Alkali Metals", "K", 19, 30.098));
		table.add(new element("Calcium", "Alkaline Earth Metals", "Ca", 20, 40.078));
		table.add(new element("Scandium", "Transition Metals", "Sc", 21, 44.956));
		table.add(new element("Titanium", "Transition Metals", "Ti", 22, 47.867));
		table.add(new element("Vanadium", "Transition Metals", "V", 23, 50.942));
		table.add(new element("Chromium", "Transition Metals", "Cr", 24, 51.996));
		table.add(new element("Manganese", "Transition Metals", "Mn", 25, 54.938));
		table.add(new element("Iron", "Transition Metals", "Fe", 26, 55.845));
		table.add(new element("Cobalt", "Transition Metals", "Co", 27, 58.933));
		table.add(new element("Nickel", "Transition Metals", "Ni", 28, 58.693));
		table.add(new element("Copper", "Transition Metals", "Cu", 29, 63.546));
		table.add(new element("Zinc", "Transition Metals", "Zn", 30, 65.38));
		table.add(new element("Gallium", "Post-Transition Metals", "Ga", 31, 69.723));
		table.add(new element("Germanium", "Metalloids", "Ge", 32, 72.630));
		table.add(new element("Arsenic", "Metalloids", "As", 33, 74.922));
		table.add(new element("Selenium", "Nonmetals", "Se", 34, 78.971));
		table.add(new element("Bromine", "Nonmetals", "Br", 35, 79.904));
		table.add(new element("Krypton", "Noble Gases", "Kr", 36, 83.798));
		table.add(new element("Rubidium", "Alkali Metals", "Rb", 37, 85.468));
		table.add(new element("Strontium", "Alkaline Earth Metals", "Sr", 38, 87.62));
		table.add(new element("Yttrium", "Transition Metals", "Y", 39, 88.906));
		table.add(new element("Zirconium", "Transition Metals", "Zr", 40, 91.224));
		table.add(new element("Niobium", "Transition Metals", "Nb", 41, 92.906));
		table.add(new element("Molybdenum", "Transition Metals", "Mo", 42, 95.95));
		table.add(new element("Technetium", "Transition Metals", "Tc", 43, 98));
		table.add(new element("Ruthenium", "Transition Metals", "Ru", 44, 101.07));
		table.add(new element("Rhodium", "Transition Metals", "Rh", 45, 102.91));
		table.add(new element("Palladium", "Transition Metals", "Pd", 46, 106.42));
		table.add(new element("Silver", "Transition Metals", "Ag", 47, 107.87));
		table.add(new element("Cadmium", "Transition Metals", "Cd", 48, 112.41));
		table.add(new element("Indium", "Post-Transition Metals", "In", 49, 114.82));
		table.add(new element("Tin", "Post-Transition Metals", "Sn", 50, 118.71));
		table.add(new element("Antimony", "Metalloids", "Sb", 51, 121.76));
		table.add(new element("Tellurium", "Metalloids", "Te", 52, 127.60));
		table.add(new element("Iodine", "Nonmetals", "I", 53, 126.90));
		table.add(new element("Xenon", "Noble Gases", "Xe", 54, 131.29));
		table.add(new element("Caesium", "Alkali Metals", "Cs", 55, 132.91));
		table.add(new element("Barium", "Alkaline Earth Metals", "Ba", 56, 137.33));
		// skip elements 57-71 
		table.add(new element("Hafnium", "Transition Metals", "Hf", 72, 178.49));
		table.add(new element("Tantlum", "Transition Metals", "Ta", 73, 180.95));
		table.add(new element("Tungsten", "Transition Metals", "W", 74, 183.84));
		table.add(new element("Rhenium", "Transition Metals", "Re", 75, 186.21));
		table.add(new element("Osmium", "Transition Metals", "Os", 76, 190.23));
		table.add(new element("Iridium", "Transition Metals", "Ir", 77, 192.22));
		table.add(new element("Platinum", "Transition Metals", "Pt", 78, 195.08));
		table.add(new element("Gold", "Transition Metals", "Au", 79, 196.97));
		table.add(new element("Mercury", "Transition Metals", "Hg", 80, 200.59));
		table.add(new element("Thallium", "Post-Transition Metals", "Tl", 81, 204.38));
		table.add(new element("Lead", "Post-Transition Metals", "Pb", 82, 207.2));
		table.add(new element("Bismuth", "Post-Transition Metals", "Bi", 83, 208.98));
		table.add(new element("Polonium", "Post-Transition Metals", "Po", 84, 209));
		table.add(new element("Astatine", "Metalloids", "At", 85, 210));
		table.add(new element("Radon", "Noble Gases", "Rn", 86, 222));
		table.add(new element("Francium", "Alkali Metals", "Fr", 87, 223));
		table.add(new element("Radium", "Alkaline Earth Metals", "Ra", 88, 226));
		// skip elements 89-103
		// skip elements 104-118
		
	}
	
	// returns element based on symbol, returns null if not found
	public element getElementS(String symbol)
	{
		element temp = null;
		
		for (element n: table)
		{
			if (n.getSymbol().equals(symbol))
			{
				temp = n;
			}
		}
		
		return temp;
	}
	
	// returns element based on atomic number, returns null if not found
	public element getElementAN(int number)
	{
		element temp = null;
		
		for (element n: table)
		{
			if (n.getNumber() == (number))
			{
				temp = n;
			}
		}
		
		return temp;
	}
	
	
	
	public double getMolecularWeight(String response)
	{

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
		
		double output = 0;
		
		for (String n: elements)
		{
			output += getElementS(n).getWeight();
		}
		
		return output;
	}
	
	public double moleCalc(String compound, double grams)
	{
		
		double molecularWT = grams / getMolecularWeight(compound);
		
		return molecularWT;
	}
	
	public String getSymbolAN(int number) // get symbol from atomic number
	{
		String symbolResult = getElementAN(number).getSymbol(); // finds symbol based on atomic number
		return symbolResult;
		
	}
	
	public void nuclearDecay(int massNumber, int number, int decay)
	{
		
		// user chooses alpha emission
		if (decay == 1) // alpha emission = 4;2 He
		{
			
			System.out.println();
			System.out.println("Initial: " + massNumber + ";" + number + " " + getSymbolAN(number));
			System.out.println("Daughter: " + (massNumber-4) + ";" + (number-2) + " " + getSymbolAN(number-2));
		}
		
		// user chooses beta emission
		else if (decay == 2) // beta emission = 0;-1 e
		{

			System.out.println();
			System.out.println("Initial: " + massNumber + ";" + number + " " + getSymbolAN(number));
			System.out.println("Daughter: " + massNumber + ";" + (number+1) + " " + getSymbolAN(number+1));
		}
		
		// user chooses positron emission
		else if (decay == 3) // positron emission = 0;+1 e
		{
		
			System.out.println();
			System.out.println("Initial: " + massNumber + ";" + number + " " + getSymbolAN(number));
			System.out.println("Daughter: " + massNumber + ";" + (number-1) + " " + getSymbolAN(number-1));
		}
		
		// user chooses electron transfer (similar to beta emission)
		else if (decay == 4) // positron emission = 0;-1 e
		{
			
			System.out.println();
			System.out.println("Initial: " + massNumber + ";" + number + " " + getSymbolAN(number));
			System.out.println("Daughter: " + massNumber + ";" + (number+1) + " " + getSymbolAN(number+1));
		}
		
		// user chooses gamma decay
		else // gamma decay = 0/0γ
		{

			System.out.println();
			System.out.println("Daughter: " + massNumber + ";" + number + " " + getSymbolAN(number) + " + 0/0γ");
		}
	}
	
	public void nuclearFission(double mol)
	{
		
		DecimalFormat d2 = new DecimalFormat("#.##");
		DecimalFormat d3 = new DecimalFormat("#.###");
		
		mol = Double.valueOf(d2.format(mol));
		
		double energy = 1.6; // total energy per U-235 atom
		int powerE = -13; // exp of total energy per U-235 atom
		
		double avo = 6.022; // avogadro's mol number
		int powerA = 23; // exp of avogadro's mol number
		
		double nuclearFission = Double.valueOf(d3.format(energy * avo * mol));
		int power = powerE + powerA; // multiplies power

		System.out.println();
		System.out.println(nuclearFission + " * 10^" + power + " J/mol U-235");
	}
	
	public static double log(double x, double b)
	{
	    return (double) (Math.log(x) / Math.log(b));
	}
	
	public void halflife(double massI, double massF, double time, double halflife, double rate)
	{
		if (massI == 0) // solve for initial mass (rate constant, time, massF)
		{
			DecimalFormat d1 = new DecimalFormat("#.#");
			
			if (rate == 1+)
			{
				
			}
			else
			{
				massI = massF / Math.pow(Math.E, -rate*time);
				System.out.println("\nInitial Mass = " + Double.valueOf(d1.format(massI)));
			}
		}
		
		else if (massF == 0) // solve for final mass (time, half-life, massI)
		{
			DecimalFormat d0 = new DecimalFormat("#.");
			DecimalFormat d1 = new DecimalFormat("#.#");
			DecimalFormat d2 = new DecimalFormat("#.##");
			if (massI == 1)
			{
				
				double power = Double.valueOf(d0.format(halflife/time));
				massF = 100/Math.pow(2, power);
				
				System.out.println("\nFinal Mass: " + Double.valueOf(d2.format(massF)));
			}
			
			else
			{
				double x = Double.valueOf(d1.format(time/halflife)); // x = amount of half lives
				massF = Double.valueOf(d1.format(massI * Math.pow(0.5, x)));
				
				System.out.println("\n" + massF);
			}
		}
		
		else if (time == 0) // solve for time duration (massI, massF, half-life)
		{
			DecimalFormat d1 = new DecimalFormat("#.#");
			
			time = halflife * log((massF/massI),0.5);
			System.out.println("\nTime = " + Double.valueOf(d1.format(time)));
		}
		
		else if (halflife == 0) // solve for half-life (massI, massF, time)
		{
			DecimalFormat d1 = new DecimalFormat("#.#");
			DecimalFormat d2 = new DecimalFormat("#.##");
			
			if (massI == 1 && massF == 1 && time == 1)
			{
				halflife = 0.693/rate;
				System.out.println("\nHalf-life = " + Double.valueOf(d2.format(halflife)));
			}
			
			else
			{
				double n = log((massF/massI),0.5);
				halflife = time/n;
				
				System.out.println("\nHalf-life = " + Double.valueOf(d1.format(halflife)));
			}
			
		}
		
		else // solve for rate (time, massI, massF)
		{
			DecimalFormat d6 = new DecimalFormat("#.######");
			DecimalFormat d3 = new DecimalFormat("#.###");
			
			if (massI == 1 && massF == 1 && time == 1) // massI, massF, time unknown
			{
				rate = 0.693/halflife;
				System.out.println("\nHalf-life = " + Double.valueOf(d6.format(rate)));
			}
			
			else 
			{
				rate = (-1/time) * (Math.log(massF/massI));
				System.out.println("\nRate Constant = " + Double.valueOf(d3.format(rate)));
			}
		}
	}
	
}
