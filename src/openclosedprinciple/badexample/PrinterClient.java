package openclosedprinciple.badexample;

public class PrinterClient{
	public static void main(String[] args) {
		PrinterApp printer = new PrinterApp();
		printer.printData(new LaserPrinter());
		
	}
}