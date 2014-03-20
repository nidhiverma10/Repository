import java.util.Arrays;


public class AccountDAOImpl implements AccountDAO {
    static Account[] arr=new Account[2];
    static int index;
    Account acc=new Account();
	@Override
	
	public Account findAccount(int accountNo) {
		for(int i=0;i<index;i++)
		{
			if(arr[i].getAccountNo()==accountNo)
			{
				acc=arr[i];
				return arr[i];                                                                              
			}
			
		}
			
		return null;
	}

	@Override
	public boolean saveAccount(Account a)
	{
		if(index < 2){
		
		arr[index]=a;
		System.out.println(arr[index]);
		index++;
		return true;
		}
		
		else
		{
		arr=Arrays.copyOf(arr, 10);
		arr[index]=a;
		System.out.println(arr[index]);
		index++;
		return true;
		}
		
	}


	

}
