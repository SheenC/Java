package hello;

public class CashRegister 
{
	public double totalAmount;
	public int transactionCount;
	private static int registerCount = 0; 
	
	public CashRegister()
	{
		this.totalAmount = 0.0;
		this.transactionCount = 0;
		++ registerCount ;
	}

	public void AddTransaction(double amount) 
	{
		this.totalAmount += amount;
		this.transactionCount +=1;
	}
	
	public int TransactionCount() 
	{
		return this.transactionCount;
	}
	
	public double Total() 
	{
		return this.totalAmount;
	}
	
	public void ResetTransactions() 
	{
		this.totalAmount = 0.0;
		this.transactionCount = 0;
	}
	
	public static int RegisterCount() 
	{
		return registerCount;
	}
	
	//use main() function to test the CashRegister Class
	public static void main(String args[]) 
	{
		//Create three new accounts
		CashRegister Account1 = new CashRegister();
		CashRegister Account2 = new CashRegister();
		CashRegister Account3 = new CashRegister();
		
		//Do transactions to the three accounts
		Account1.AddTransaction(10.5);
		Account1.AddTransaction(0.5);
		Account2.AddTransaction(100);
		Account3.AddTransaction(20.8);
		Account3.AddTransaction(10);
		Account3.AddTransaction(5);
		
		//Test the TransactionCount
		System.out.println("The transaction count of Account1 is: " + Account1.transactionCount);
		System.out.println("The transaction count of Account2 is: " + Account2.transactionCount);
		System.out.println("The transaction count of Account3 is: " + Account3.transactionCount);
		
		//Test the Total		
		System.out.println("The total amount of Account1 is: " + Account1.Total());
		System.out.println("The total amount of Account2 is: " + Account2.Total());
		System.out.println("The total amount of Account3 is: " + Account3.Total());
		
		// Test the RegisterCount
		System.out.println("The regiter count is: " + CashRegister.RegisterCount());
		
		//Test the ResetTransactions
		System.out.println("Now reset the Account1" );
		Account1.ResetTransactions();
		int newtransactioncount1 = Account1.transactionCount;
		double newtotal1 = Account1.Total();
		System.out.println("The new transaction count of Account1 is: " + newtransactioncount1);
		System.out.println("The new total amount of Account1 is: " + newtotal1);
			
	}
	
}

