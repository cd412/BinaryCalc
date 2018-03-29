
public class Lamp {
	private static final boolean ON = true;
	private static final boolean OFF = false;
	private boolean light = ON ;
	
	public void setLightOn() {
		this.light = ON;
	}
	
	public void setLightOff() {
		this.light = OFF;
	}
	
	public boolean getLight() {
		return this.light;
	}
}
