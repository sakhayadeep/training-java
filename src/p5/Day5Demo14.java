package p5;

import java.util.Locale;

public class Day5Demo14 {

	public static void main(String[] args) {
		System.out.println(ResBundle.get("S1"));
		System.out.println(ResBundle.get("S2"));
		
		Locale.setDefault(new Locale("es_ES"));
		
		System.out.println(ResBundle.get("S1"));
		System.out.println(ResBundle.get("S2"));

		Locale.setDefault(new Locale("hi_IN"));
		
		System.out.println(ResBundle.get("S1"));
		System.out.println(ResBundle.get("S2"));
	}

}
