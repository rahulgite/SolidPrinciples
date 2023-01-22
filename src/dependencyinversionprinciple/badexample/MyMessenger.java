package dependencyinversionprinciple.badexample;

//Application layer - High level module
public class MyMessenger{
	TcpProtocolHandler tcpHandler = new TcpProtocolHandler();
	
	public void send(String to , String message) {
		tcpHandler.sendMessage("message to " + to + "message is : " + message);
	}
	
}