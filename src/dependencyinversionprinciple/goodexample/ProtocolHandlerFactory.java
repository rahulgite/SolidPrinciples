package dependencyinversionprinciple.goodexample;

public class ProtocolHandlerFactory{
	public static ProtocolHandler getProtocolHandler(String protocol) {
		if("TCP".equalsIgnoreCase(protocol)) {
			return new TcpProtocolHandler();
		}
		
		if("UDP".equalsIgnoreCase(protocol)) {
			return new UdpProtocolHandler();
		}
		return null;
		
	}
}