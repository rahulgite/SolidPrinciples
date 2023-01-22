package dependencyinversionprinciple.goodexample;

public class GoodDependencyInversion{
	public static void main(String args[]) {
		MyMessenger messenger = new MyMessenger("TCP");
		messenger.send(" A", "dependency inversion");
	}
}