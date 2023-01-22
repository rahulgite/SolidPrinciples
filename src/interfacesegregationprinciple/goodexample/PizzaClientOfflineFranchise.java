package interfacesegregationprinciple.goodexample;



public class PizzaClientOfflineFranchise implements PizzaAppOffline{

	@Override
	public void acceptWalkinOrders() {
		// TODO Auto-generated method stub
		System.out.println("items orderded by walkin is accepted");
		
	}

	@Override
	public void acceptOnlyCash() {
		// TODO Auto-generated method stub
		System.out.println("Payment accepted through cash");
	}
	
}