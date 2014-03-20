public class Country {
    
    private String CountryName;
    
    
    public Country() 
    {
         
    }
    
    public Country(String countryName)
	{
		this.CountryName = CountryName;
	}

    public String getCountryName()
	{
  	   return CountryName;
	}

    public void setCountryName(String CountryName)
	{
		this.CountryName = CountryName;
	}


    public String toString()
	{
		return String.format(" Country: " + this.CountryName);
	}
    

}

