public class Employee {

   private String name;
   private byte age;
   private Address address[];

   public Employee()
             {
             }
   
    public String getName()
       {
    
         return name;
       }
    
    public void setName(String name)
       {
         
         
         this.name = name;
        }
    
    public byte getAge() 
        {
        
         return age;
         }
    
    public void setAge(byte age)
         {
         this.age = age;
          }
    
    public Address[] getAddress() 
        {
         return this.address;
        }
   
    public void setAddress(Address address[]) 
       {
          this.address = address;
       }
   
    public String toString()
       {
       String str=String.format("Employee:"+" "+this.name+" "+"Age"+this.age);
      
	 for(int i=0;i<this.address.length;++i)
        {
         str=str + this.address[i].toString();
        
        }
    
          return str;

    }
    
    
}

