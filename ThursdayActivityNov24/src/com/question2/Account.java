package com.question2;

public class Account {
	public void deposit()
	{
		System.out.println("deposit here");
		
	}
	void withdraw(int bal) throws UserDefineException
	{ 
		if(bal<100)
		{
			throw new UserDefineException("No SufficientFundException");
			
		}
		else {
			System.out.println("please Take money");
		}
	}
	public static void main(String[] args) {
		

		Account a=new Account();
		a.deposit();
		
		try {
			a.withdraw(2000);
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}

	}

}

