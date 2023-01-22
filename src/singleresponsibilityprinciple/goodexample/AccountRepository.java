package singleresponsibilityprinciple.goodexample;

public class AccountRepository{
	public void  storeAccountDetails(Account acc) {
		//DB operations is done by getting details of account by Account entity class.
		System.out.println( "Account Details stored successfully in database for  ID " + acc.getAccountId());
	}
}