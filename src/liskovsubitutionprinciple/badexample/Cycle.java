package liskovsubitutionprinciple.badexample;

public class Cycle extends TransportationDevice{
	public int price = 0;
	//As cycle dont have the engine type, the method set engine  is not used
	//And if it override the setEngineType method it violets the LSP.
	
	@Override
	public void setEngineType(String engineType) {
		// TODO Auto-generated method stub
		//cant do any operation as it cycle has no engine.
	}
	
}