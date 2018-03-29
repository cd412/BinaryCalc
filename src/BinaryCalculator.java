
public class BinaryCalculator {
	
	private Lamp[] lamps;
	private int bits;
	
	// constructor
	public BinaryCalculator(int bits) {
		this.bits = bits;
		for (int i = 0; i < this.bits; i++) {
			lamps[i].setLightOff();
		}
	}
	
	// no-args constructor (default 8-bit calculator)	
	public BinaryCalculator() {
		this(8);
	}
	
	public void calculate(int input) {
		for (int i = this.bits; i > 0; --i) {
			
		}
	}
	
}
