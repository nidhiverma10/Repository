class Employee
{

private String Name;
private byte Age;
private Address Address;

public Employee(String Name,byte Age,Address Address){

this.Name=Name;
this.Age=Age;
this.Address=Address;
}

public void setName(String Name){
this.Name=Name;
}

public String getName(){
return Name;
}

public void setAge(byte Age){
this.Age=Age;
}

public byte getAge(){
return Age;
}

public void setAddress(Address Address){
this.Address=Address;
}

public Address getAddress(){
return Address;
}

	