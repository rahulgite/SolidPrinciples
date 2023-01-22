package openclosedprinciple.goodexample;

public class PrinterClient{
	public static void main(String[] args) {
		PrinterApp printer = new PrinterApp();
		printer.printData(new DotMatrixPrinter());
		
	}
}