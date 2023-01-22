package dependencyinversionprinciple.badexample;

//Transport layer - Low level module
public class TcpProtocolHandler{
	public void sendMessage(String message) {
		System.out.println("TCPProtocolHanlder sending " + message);
	}
}