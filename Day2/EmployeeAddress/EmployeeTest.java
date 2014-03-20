import java.util.*;


import java.util.Scanner;


public class EmployeeTest {

    
    public static void main(String[] args) {
         
    Scanner scan=new Scanner(System.in);
        

         Employee emp[]=new Employee[2];
	 Address Addr[]=new Adderss;

         System.out.println("Go!!");
         for(int i=0;i<2;i++)
             {
                 emp[i]=new Employee();
		 System.out.println("Enter Name:");
                 emp[i].setName(scan.next());
		 System.out.println("Enter Age:");
                 emp[i].setAge(scan.nextByte());
		 System.out.println("Enter Address:");
                 
	         emp[i].setAddress( scan.next(), scan.nextInt(), scan.next(), scan.nextInt());
                 
                 
             }
         for(Employee objEmployee:emp)
             {
                 System.out.println("Name:"+objEmployee.getName()+"   "+"Age:"+objEmployee.getAge());
                 objEmployee.printAddress();
                 System.out.println("\n");
             }
         
         
         

    }

}
