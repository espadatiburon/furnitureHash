public class Sofa implements Furniture
{
	private String name;
	private int modelNr;
	private int price;

	public Sofa(String name, int modelNr, int price)
	{
		super();
		this.name = name;
		this.modelNr = modelNr;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public int getModelNr()
	{
		return modelNr;
	}

	public int getPrice()
	{
		return price;
	}

	public String toString()
	{
		return "Name: " + name + " Model: " + modelNr + " Price: " + price;
	}

	public int hashCode()
	{
		int hash = 17;
		hash = 17 * hash + modelNr;
		hash = 17 * hash + (name == null ? 0 : name.hashCode());
		return hash;
	}

	public boolean equals(Object obj)
	{
		//makes sure that object isn't null and that it's an instance of Sofa class before checking if its equal
		if(obj == null)
		{
			return false;
		}
		if(!(obj instanceof Sofa))
		{
			return false;
		}

		Sofa temp = (Sofa) obj;

		if(name != temp.getName())
		{
			return false;
		}

		if(modelNr != temp.getModelNr())
		{
			return false;
		}

		return true;
	}
}