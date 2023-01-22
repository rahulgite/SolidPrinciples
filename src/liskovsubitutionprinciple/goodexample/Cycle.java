package liskovsubitutionprinciple.goodexample;

public class Cycle extends TransportationDeviceWithoutEngine{
	public int price = 0;
	//As cycle dont have the engine type, the method set engine  is not used
	//And if it override the setEngineType method it violets the LSP.
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		name = "sports";
	}
	
	@Override
	public void setSpeed(double speed) {
		// TODO Auto-generated method stub
		speed = 5.2;
	}
	
}