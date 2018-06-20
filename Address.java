public class Address
{
	String street;
	String aptNr;
	String city;
	int zipCode;
	String state;

	public Address(String street, String aptNr, String city, int zipCode, String state)
	{
		this.street = street;
		this.aptNr = aptNr;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}

	public String getStreet()
	{
		return street;
	}

	public void setString(String street)
	{
		this.street = street;
	}

	public String getApt()
	{
		return aptNr;
	}

	public void setApt(String aptNr)
	{
		this.aptNr = aptNr;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public int getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String toString()
	{
		return "Street: " + street + " Apt Num: " + aptNr + " City: " + city + " Zip: " + zipCode + " State: " + state;
	}

	public int hasCode()
	{
		int hash = 17;
		hash = 17 * hash + zipCode;
		hash = 17 * hash + (street == null ? 0 : street.hashCode());
		hash = 17 * hash + (aptNr == null ? 0 : aptNr.hashCode());
		hash = 17 * hash + (city == null ? 0 : city.hashCode());
		hash = 17 * hash + (state == null ? 0 : state.hashCode());
		return hash;
	}

	public boolean equals(Object obj)
	{

		if(getClass() != obj.getClass()) //make sure its another address before comparing 
		{
			return false;
		}

		Address temp = (Address) obj;


		if(street != temp.getStreet())
		{
			return false;
		}

		if(aptNr != temp.getApt())
		{
			return false;
		}

		if(city != temp.getCity())
		{
			return false;
		}

		if(zipCode != temp.getZipCode())
		{
			return false;
		}
		
		if(state != temp.getState())
		{
			return false;
		}

		return true;
	}
}