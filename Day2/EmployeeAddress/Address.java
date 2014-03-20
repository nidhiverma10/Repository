public class Address {
    
    City city;
    Country country;
    
    Address(String city,int cityCode,String country,int counCode)
    {
         
         this.city=new City(city, cityCode);
         this.country=new Country(country,counCode);
         
         
         
         
         
         
    }
    

}

