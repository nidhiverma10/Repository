import java.util.Scanner;




public class BankClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i;
		
		do{
			
		System.out.println("***************************************************************************");
		System.out.println("1.Create Account");
		System.out.println("2.Deposit Amount");
		System.out.println("3.Show Balance");
		System.out.println("4.WithDraw Amount");
		System.out.println("5.Print Transcation");
		System.out.println("***************************************************************************");
		System.out.println("Enter Choice:");
		Scanner scan=new Scanner(System.in);
		
		Customer c=new Customer();
		BankServiceImpl bs=new BankServiceImpl();
		Address add=new Address();
		
	
		 i = scan.nextInt();
		
		switch(i)
		{
		case 1:
			System.out.println("Enter First Name:");
			c.setFname(scan.next());
			
			System.out.println("Enter Last Name:");
			c.setLname(scan.next());
			
			System.out.println("Enter Street Name:");
			add.setStreet(scan.next());
			
			System.out.println("Enter City:");
			add.setCity(scan.next());
			
			c.setAddress(add);
			
			bs.createAccount(c, 1000);
			break;
			
			
		case 2:
			
			System.out.println("Enter Account number");
			
			int AccNo=scan.nextInt();
			
			System.out.println("Enter Amount");
			
			float bal=scan.nextFloat();
			
			float bal2=bs.deposit(AccNo,bal);
			if(bal2==-1)
			{
				System.out.println("Invalid Account Number!!");
			}
			
			System.out.println(bal2);
			break;
			
		
		case 3:
			
			System.out.println("Enter Account");
			int AccNo1=scan.nextInt();
			
			float a=bs.showBalance(AccNo1);
			
			if(a==-1)
			{
				System.out.println("Invalid Account Number!!");
			}
			System.out.println(a);
			break;
			
		case 4:
			
            System.out.println("Enter Account number");
			
        	int AccNo11=scan.nextInt();
			System.out.println("Enter Amount");
			float bal1=scan.nextFloat();
			
			float bal3=bs.withDraw(AccNo11,bal1);
			
			if(bal3==-1)
			{
				System.out.println("Invalid!!");
			}
			System.out.println(bal3);
			break;
			
			default:
				System.out.println("Invalid Choice!!!");
			
		}
	
		}while(i<5);
		
		
		

	}

}
