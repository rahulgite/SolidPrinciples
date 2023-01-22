package liskovsubitutionprinciple.goodexample;

public class Car extends TransportationDeviceWithEngine{
	public int price = 600000;
	
	@Override
	public void setEngineType(String engineType) {
		// TODO Auto-generated method stub
		//We can do some operation based on type of the engine, like price.
		if(engineType.equalsIgnoreCase("Petrol")) {
		    this.price = this.price +50000;
		} else {
			this.price = this.price +100000;
		}
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		name = "TATA";
	}
	
	@Override
	public void setSpeed(double speed) {
		// TODO Auto-generated method stub
		speed = 1245.3;
	}
}