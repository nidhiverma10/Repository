public class City
{
    String name;
    int code;
    
    public String getCountry() {
         return name;
    }
    public void setCountry(String country) {
         this.name = country;
    }
    public int getCode() {
         return code;
    }
    public void setCode(int code) {
         this.code = code;
    }
    public City(String country, int code) {
        
	 super();
         this.name = country;
         this.code = code;
    }
}