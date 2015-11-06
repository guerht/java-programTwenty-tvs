// Abstract TV.java
public abstract class TV {
	private boolean tvON;
	public TV() {
		tvON = false;
	}
	public void setTvON(boolean power) {
		tvON = power;
	}
	public boolean getTvON() {
		return tvON;
	}
	public abstract String tvTYPE();
}