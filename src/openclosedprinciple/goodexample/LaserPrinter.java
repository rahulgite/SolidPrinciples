package openclosedprinciple.goodexample;

public class LaserPrinter implements Iprinter {
	@Override
	public void print() {
		System.out.println("Information printing from Laser printer");
	}
}