
public class Account
{
private int accountNo;
private float balance;
private Customer customer;
private static int i;
// array of transactions

Transaction transactions[]=new Transaction[2];
int index;

public Account()
{
	accountNo=++i;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public String toString()
{
	return String.format("AccountNo:"+" "+this.getAccountNo()+" "+"Balance:"+" "+this.getBalance()+" "+"Customer"+" "+this.customer.toString());
}
}
