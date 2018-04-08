
public class Lamp {
	private static final boolean ON = true;
	private static final boolean OFF = false;
	private boolean light = ON ;
	
	public Lamp() {
		setLightOff();
	}
	
	public void setLightOn() {
		this.light = ON;
	}
	
	public void setLightOff() {
		this.light = OFF;
	}
	
	public boolean getLight() {
		return this.light;
	}
	
	public String toString() {
		if (this.light) {
			return "on  ";
		} else {
			return "off ";
		}
	}
}
