package dependencyinversionprinciple.badexample;

public class badDependencyInversion{
	public static void main(String args[]) {
		MyMessenger messenger = new MyMessenger();
		messenger.send(" A", "dependency inversion");
	}
}