package singleresponsibilityprinciple.badexample;

import java.util.Random;

public class AccountService{
    Account acc = new Account();
	
	public void fillAccountDetails() {
	  Random random = new Random();
	  acc.setAccountHolderName("Rajesh");
	  acc.setAccountId(random.nextInt());
	  acc.setAge(25);
	  acc.setMailId("rajesh@gmail.com");
	  acc.setBankName("ABC");
	  System.out.println("Account application form is generated");
	}
	
	public void storeAccountDetails() {
		String accountName = acc.getAccountHolderName();
		int accountID =acc.getAccountId();
		int age = acc.getAge();
		String bankName = acc.getBankName();
		String mailID = acc.getMailId();
		System.out.println( "New Account details inserted successfully for ID" + acc.getAccountId());
		
	}
	
	public String sendNotification() {
		return "Your Account is created with ID" + acc.getAccountId();
	}
}