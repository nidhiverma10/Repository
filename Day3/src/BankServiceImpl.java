
import java.util.Random;


public class BankServiceImpl implements BankService {
	private AccountDAO ad=new AccountDAOImpl();
	
	@Override
	public int createAccount(Customer c, float amount) {
		
		Account acc= new Account();
		acc.setCustomer(c);
		acc.setBalance(amount);
		Random randomgenerator=new Random();
		acc.setAccountNo(randomgenerator.nextInt(300));
		
		ad.saveAccount(acc);
		return acc.getAccountNo();
	}

	@Override
	public float deposit(int accountNo, float amount) {
	
	Account acc=new Account();
	
	acc=ad.findAccount(accountNo);
	if(acc==null)
	{
		return -1;
	}
	if(acc.getAccountNo()==accountNo && accountNo!=0)
	{
		acc.setBalance(acc.getBalance()+amount);
		return acc.getBalance();
	}
	
	return 1;
	
	}

	@Override
	public float showBalance(int accountNo)
	{
		Account acc=new Account();
		acc=ad.findAccount(accountNo);
		
		if(acc==null)
		{
			return -1;
		}
		
		if(acc.getAccountNo()==accountNo)
		{
			return acc.getBalance();
		}
		return -1;
		
		
	}

	@Override
	public float withDraw(int accountNo, float amount) {
		
		Account acc=new Account();
		acc=ad.findAccount(accountNo);
		
		if(acc==null)
		{
			return -1;
		}
		
		if(acc.getAccountNo()==accountNo)
		{
			if(acc.getBalance() >= amount)
			{
			acc.setBalance(acc.getBalance() - amount);
			return acc.getBalance();
			}
			
		}
			
			return -1;
		}
	}
	
