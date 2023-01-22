package interfacesegregationprinciple.badexample;

public interface PizzaApp{
	//OrderType
	 public void acceptOrderOnline();
	 public void acceptWalkinOrders();
	 public void acceptTelephoneOrders();
	 
	 //PaymentMode
	 public void acceptPaymentOnline();
	 public void acceptOnlyCash();
	
}