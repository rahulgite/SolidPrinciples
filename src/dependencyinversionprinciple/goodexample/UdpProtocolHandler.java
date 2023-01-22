package dependencyinversionprinciple.goodexample;

//Transport layer - Low level module
public class UdpProtocolHandler implements ProtocolHandler{
	public void sendMessage(String message) {
		System.out.println("UdpProtocolHandler sending " + message);
	}
}