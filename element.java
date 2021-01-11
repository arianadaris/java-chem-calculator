package ChemE;

public class element 
{
	private String name, classification, symbol;
	private int number;
	private double weight;
	
	public element(String name, String classification, String symbol, int number, double weight)
	{
		this.name = name;
		this.classification = classification;
		this.number = number;
		this.weight = weight;	
		this.symbol = symbol;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getClassification()
	{
		return classification;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setClassification (String newName)
	{
		classification = newName;
	}
	
	public void getSymbol(String newName)
	{
		symbol =  newName;
	}
	
	public void setNumber(int newName)
	{
		number = newName;
	}
	
	public void setWeight(double newName)
	{
		weight = newName;
	}
	
	public String toString()
	{
		return "Name: " + name + "\nClassification: " + classification +
				"\nSymbol: " + symbol + "\nNumber: " + number + "\nWeight: " + weight;
	}
	
}
