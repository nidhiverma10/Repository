 public class City
{
    private String cityName;
    private Country country;
    
  /* public City(String cityName,Country country)
	{
		this.cityName =cityName;
		this.country = country;
	}*/

	public String getCityName()
	{
		return cityName;
	}

	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}

	public Country getCountry()
	{
		return country;
	}

	public void setCountry(Country country)
	{
		this.country = country;
	}

	public String toString()
	{
		return String.format(" City: " + this.cityName + this.country);
}
}