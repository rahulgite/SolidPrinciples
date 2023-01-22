package dependencyinversionprinciple.goodexample;

//Transport layer - Low level module
public class TcpProtocolHandler implements ProtocolHandler{
	public void sendMessage(String message) {
		System.out.println("TCPProtocolHanlder sending " + message);
	}
}