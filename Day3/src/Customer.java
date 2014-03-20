
public class Customer {
	private String fname;
	private String lname;
	private Address address;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString()
	{
		return String.format("FirstName:"+" "+this.getFname()+" "+"LastName"+" "+this.getLname()+" "+"Address:"+" "+this.address.toString());
	}
}
