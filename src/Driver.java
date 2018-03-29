
public class Driver {
	
	public static void main(String[] args) {
		BinaryCalculator bc = new BinaryCalculator();
		
		System.out.println("128 64 32 16 8 4 2 1");
		
		for (int i = 0; i < 129; i++) {
			bc.calculate(i);
			System.out.println(bc + " = " + i);
		}
		
	}
}
