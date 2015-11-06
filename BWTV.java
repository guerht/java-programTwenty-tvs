// BWTV.java
public class BWTV extends TV implements Analogue {
	// from abstract class
	public BWTV() {
		super();
	}
	public String tvTYPE() {
		return "I'm a black and white TV.";
	}
	// from interface
	public String rotateRabbitEars() {
		return "Rabbit ears rotated 45 degrees.";
	}
}