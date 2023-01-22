package interfacesegregationprinciple.goodexample;



public class PizzaClientOnlineFranchise implements PizzaAppOnline{

	@Override
	public void acceptOrderOnline() {
		// TODO Auto-generated method stub
		System.out.println("Online order is accepted");
		
	}

	@Override
	public void acceptPaymentOnline() {
		// TODO Auto-generated method stub
		System.out.println("Online payment done successfully");
		
	}
	
}