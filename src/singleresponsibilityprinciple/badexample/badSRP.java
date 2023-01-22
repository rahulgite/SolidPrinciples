package singleresponsibilityprinciple.badexample;

public class badSRP{
	public static void main(String[] args) {
		AccountService service = new AccountService();
		service.fillAccountDetails();
		service.storeAccountDetails();
		System.out.println(service.sendNotification());
	}
}