
public interface BankService 
{
int createAccount(Customer c,float amount);
float showBalance(int accountNo);
float withDraw(int accountNo,float amount);
float deposit(int accountNo,float amount);

}
