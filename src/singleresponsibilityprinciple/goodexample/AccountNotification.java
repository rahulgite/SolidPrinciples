package singleresponsibilityprinciple.goodexample;

public class AccountNotification{
	public void sendNotification(Account acc) {
		System.out.println("Your account has been created successfully with Id" + acc.getAccountId());
	}
}