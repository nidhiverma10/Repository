public class Employee {

   private String name;
   private byte age;
   private Address address[];
   
    public String getName() {
    
         return name;
    }
    public void setName(String name) {
         
         
         this.name = name;
    }
    public byte getAge() {
         System.out.println(age);
         return age;
    }
    public void setAge(byte age) {
         this.age = age;
    }
    public Address[] getAddress() {
         return this.address;
    }
    public void setAddress(Address[] String city,int cityCode,String country,int counCode) {
         this.address = new Address[](city, cityCode, country, counCode);
    }
    
    void printAddress()
    {
         
         System.out.println("City"+address.city.getCountry()+" "+"City Code"+address.city.getCode()+""+"Country"+address.country.getName()+"  "+"Country Code"+address.country.getCode());
         
         
    }
    
    public Employee() {
             }
    
}

