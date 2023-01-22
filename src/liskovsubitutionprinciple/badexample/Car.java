package liskovsubitutionprinciple.badexample;

public class Car extends TransportationDevice{
	public int price = 600000;
	
	@Override
	public void setEngineType(String engineType) {
		// TODO Auto-generated method stub
		//We can do some operation based on type of the engine, like price.
		if(engineType.equalsIgnoreCase("Petrol")) {
		    this.price = this.price +50000;
		} else {
			this.price = this.price +50000;
		}
	}
}