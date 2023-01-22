package openclosedprinciple.goodexample;

public class SolidInkPrinter implements Iprinter {
	@Override
	public void print() {
		System.out.println("Information printing from SolidInk printer");
	}
}