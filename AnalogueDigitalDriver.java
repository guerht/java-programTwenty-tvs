/*
 * Project: AnalogueDigitalDriver.java
 * Description: Creates BWTVs and HDTVs
 * Name: Aaron Snowberger
 * Date: 6th November, 2015
 */
import java.util.ArrayList;
public class AnalogueDigitalDriver {
	public static void main(String args[]) {
		BWTV bw = new BWTV();
		HDTV hd = new HDTV();
		ArrayList<TV> tvs = new ArrayList<TV>();
		tvs.add(bw);
		tvs.add(hd);
		for (TV tv:tvs) {
			System.out.println(tv.tvTYPE());
			System.out.println("TV on: " + tv.getTvON());
			tv.setTvON(true);
			System.out.println("TV on: " + tv.getTvON());
		}
		System.out.println(bw.rotateRabbitEars());
		System.out.println(hd.connectHDMI());

	}
}