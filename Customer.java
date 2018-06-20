import java.util.Date;

public class Customer
{
	long id;
	String name;
	Date customerSince;
	Address myAddress;

	public Customer(long id, String name, Date customerSince, Address myAddress)
	{
		this.id = id;
		this.name = name;
		this.customerSince = customerSince;
		this.myAddress = myAddress;
	}

	public long getID()
	{
		return id;
	}

	public void setID(long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getCustomerSince()
	{
		return customerSince;
	}

	public void setCustomerSince(Date customerSince)
	{
		this.customerSince = customerSince;
	}

	public Address getAddress()
	{
		return myAddress;
	}

	public void setAddress(Address myAddress)
	{
		this.myAddress = myAddress;
	}

	public String toString()
	{
		return "ID: " + id + " Name: " + name + " Customer Since: " + customerSince + "\nAddress: " + myAddress.toString();
	}

	public int hashCode()
	{
		int hash = 17;
		hash = 17 * hash + (int)id;
		hash = 17 * hash + (name == null ? 0 : name.hashCode());
		hash = 17 * hash + (customerSince == null ? 0 : customerSince.hashCode());
		hash = 17 * hash + (myAddress == null ? 0 : myAddress.hashCode());
		return hash;
	}

	public boolean equals(Object obj)
	{
		if(getClass() != obj.getClass()) //makes sure that its another customer being compared to before checking 
		{
			return false;
		}

		Customer temp = (Customer) obj;

		if(this.id != temp.getID())
		{
			return false;
		}
		if(this.name != temp.getName())
		{
			return false;
		}
		if(this.customerSince.compareTo(temp.getCustomerSince()) != 0)
		{
			return false;
		}
		if(!this.myAddress.equals(temp.getAddress()))
		{
			return false;
		}

		return true;
	}
}