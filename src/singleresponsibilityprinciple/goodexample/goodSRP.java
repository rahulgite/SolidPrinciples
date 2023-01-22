package singleresponsibilityprinciple.goodexample;

public class goodSRP{
	public static void main(String[] args) {
		AccountService service = new AccountService();
		Account details = service.fillDetails();
		AccountRepository repo = new AccountRepository();
		repo.storeAccountDetails(details);
		AccountNotification notification = new AccountNotification();
		notification.sendNotification(details);
	}
}