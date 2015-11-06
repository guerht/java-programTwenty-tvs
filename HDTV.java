// HDTV.java
public class HDTV extends TV implements Digital {
	// from abstract class
	public HDTV() {
		super();
	}
	public String tvTYPE() {
		return "I'm a High Def 24 million colour TV.";
	}
	// from interface
	public String connectHDMI() {
		return "HDMI cable connected.";
	}
}