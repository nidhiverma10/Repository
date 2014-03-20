import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Employee emp[] = new Employee[1];

		emp[0]=new Employee();
                emp[0].setName("Nidhi");
		emp[0].setAge((byte)23);

		Country con=new Country();
		con.setCountryName("India");

		City city=new City();
		city.setCityName("Pune");
		city.setcountry(cn);

		Address arr[]=new Address[2];
		arr[0]=new Address();
		arr[0].setStreet("abc");
		arr[0].setCity("abc");

		emp[0].setAddress(arr);
		System.out.println(emp[0]);

		}
		
	}	

}