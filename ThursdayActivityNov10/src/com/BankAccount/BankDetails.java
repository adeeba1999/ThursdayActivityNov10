package com.BankAccount;

public class BankDetails {
	private Bank[] account;
	private int entry;
	
	BankDetails()
	{
		account=new Bank[4];
				
	}
public void checkBalance(Bank input)
{
	if(entry<account.length) 
	{
		account[entry]=input; 
		entry++; 
		
		if(input.getBalance()<(1000))
		System.out.println("Low Balance Account Details are :"+  input.getName() + ", Rs." + input.getBalance()); 
	}
}
	public static void main(String[] args) {
		
		Bank b1 = new Bank("Ayeshaa",668523,5625.40);
		Bank b2 = new Bank("adeeba",528596,127.55);
		Bank b3 = new Bank("simran",813641,19853.66);
		Bank b4 = new Bank("shadan",768452,27454);
		
		BankDetails myBank = new BankDetails();
		myBank.checkBalance(b1);
		myBank.checkBalance(b2);
		myBank.checkBalance(b3);
		myBank.checkBalance(b4);
	}
}



