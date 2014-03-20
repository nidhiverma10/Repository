public class Employee
{
	private String name;
	private byte age;
	private Address address;
	
	public Employee(String name,byte age,Address address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
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

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public String toString()
	{
		return String.format("Employee: " + this.name + " Age: " + this.age + this.address);
	}

}