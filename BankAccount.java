import java.text.NumberFormat;
public class BankAccount
{
	private String ID;
	private double Balance;

	public BankAccount(String initID, double initBalance)
	{	ID = initID;
		Balance = initBalance;
	}
	public BankAccount()
	{	ID = "???";
		Balance = 0;
	}
	public BankAccount(String initID)
	{	initID.equals(ID);
	}
	public String getID()
	{	return ID;
	}
	public void setID(String name)
	{	ID=name;
	}
	public double getBalance()
	{	return Balance;
	}
	public void addInterest()
	{
		if (Balance < 1000)
		{
			Balance *= 1.025;
		}else if (Balance >= 1000 && Balance < 5000)
		{
			Balance *= 1.035;
		}else if (Balance >= 5000)
		{
			Balance *= 1.045;
		}
	}
	public boolean withdraw(double withdrawAmount)
	{	if(withdrawAmount>0 && withdrawAmount<Balance)
		{	Balance -= withdrawAmount;
			return true;
		}else
			return false;
	}
	public void deposit(double depositAmount)
	{	if(depositAmount>=0)
		{	Balance += depositAmount;
		}
	}
	public String toString()
	{	NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String result = "ID: " + ID + "\nBalance: " + fmt.format(Balance);

		return result;
	}
	public boolean equals(BankAccount otherAccount)
	{	if(ID.equals(otherAccount.getID()))
		{	return true;
		}else
			return false;
	}
}