import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FurnitureBusiness
{
	private String name;
	private HashMap<Customer,List<Furniture>> myHash = new HashMap<Customer, List<Furniture>>();

	public int purchase(Customer c, Furniture... f)
	{
		int total = 0;

		if(myHash.containsKey(c)) //checks if that value is in the hashmap 
		{
			List<Furniture> myList = myHash.get(c); //gets the furniture already bought so we can add more to it 

			for(Furniture temp : f)
			{
				myList.add(temp); //adds the furniture to the list 
				total += temp.getPrice(); //adds the price to the total 
			}

			myHash.put(c, myList); //sets that list as the value 
		}
		else
		{
			List<Furniture> myList = new ArrayList<Furniture>(); 
			//creates a new list for the furniture bought because this customer doesn't exist yet
			for(Furniture temp : f)
			{
				myList.add(temp); //adds the furniture to the list 
				total += temp.getPrice(); //adds the price to the total
			}	

			myHash.put(c, myList); //sets that list as the value
		}

		return total; //returns the total of the purchase
	}

	public boolean hasBought(Customer c, Furniture f)
	{

		for(Furniture furn : myHash.get(c)) //goes through all of the purchased furniture in the list
		{
			if(furn.equals(f)) //if they are equal then return true
			{
				return true;
			}
		}

		return false;
	}

	public List<Furniture> getPurchases(Customer c)
	{
		return myHash.get(c); //returns the list of the purchased furniture
	}

	public int moneySpent(Customer c)
	{
		int total = 0;

		for(int i = 0; i < myHash.get(c).size(); i++) //goes through the list to get the total of everything
		{
			total += myHash.get(c).get(i).getPrice();
		}

		return total; //return the total after getting everything, will be 0 if nothing is purchased
	}
}