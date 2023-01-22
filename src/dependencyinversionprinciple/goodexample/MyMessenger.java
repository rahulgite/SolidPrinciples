package dependencyinversionprinciple.goodexample;

//Application layer - High level module
public class MyMessenger{
	ProtocolHandler handler;
	
	public MyMessenger(String protocol) {
		handler = ProtocolHandlerFactory.getProtocolHandler(protocol);
	}
	
	public void send(String to , String message) {
		handler.sendMessage("message to " + to + "message is : " + message);
	}
	
}