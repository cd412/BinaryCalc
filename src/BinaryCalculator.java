import java.lang.Math;
/**
 * The Binary Calculator converts base-10 numbers to base-2
 * numbers that are represented by a series of lamps (bits). 
 * 
 * @author Chris Defreitas
 */
public class BinaryCalculator {
	// instance variables
	private Lamp[] lamps = new Lamp[8];
	private int bits;
	
	 //bits This is the number of bits or lamps available
	public BinaryCalculator(int bits) {
		this.bits = bits;
		for (int i = 0; i < this.bits; i++) {
			this.lamps[i] = new Lamp();
		}
	}
	
	public BinaryCalculator() {
		this(8);
	}
	
	private void resetCalc() {
		for (int i = 0; i < lamps.length; i++) {
			lamps[i].setLightOff();
		}
	}

	public String toString() {
		String output = "";
		for (int i = this.bits - 1; i >= 0; --i) {
			output += lamps[i].toString();
		}
		return output;
	}
	
	//input This is the Base-10 number that is converted to Base-2
	public void calculate(int input) {
		resetCalc();
		// looping through the lamps backwards
		for (int i = this.bits - 1; i >= 0; --i) {
			int placeValue = (int) Math.pow(2.0, i);
			if (input >= placeValue) {
				lamps[i].setLightOn();
				input -= placeValue;
			}
		}
	}
}
