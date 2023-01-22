package interfacesegregationprinciple.badexample;

public class PizzaClient implements PizzaApp{

	@Override
	public void acceptOrderOnline() {
		// TODO Auto-generated method stub
		System.out.println("Online order is accepted");
		
	}

	@Override
	public void acceptWalkinOrders() {
		// TODO Auto-generated method stub
		System.out.println("items orderded by walkin is accepted");
		
	}

	@Override
	public void acceptTelephoneOrders() {
		// TODO Auto-generated method stub
		System.out.println("Order done by Telephone is accepted");
		
	}

	@Override
	public void acceptPaymentOnline() {
		// TODO Auto-generated method stub
		System.out.println("Online payment done successfully");
	}

	@Override
	public void acceptOnlyCash() {
		// TODO Auto-generated method stub
		System.out.println("Payment accepted by cash");
	}
	
}