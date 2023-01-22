package singleresponsibilityprinciple.goodexample;

import java.util.Random;

public class AccountService{
	public Account fillDetails() {
		Random random = new Random();
		Account account = new Account();
		account.setAccountHolderName("sureah");
		account.setAge(26);
		account.setBankName("ABC");
		account.setMailId("suresh@gmail.com");
		account.setAccountId(random.nextInt());
		System.out.println("Account Application form is generated");
		return account;
	}
}