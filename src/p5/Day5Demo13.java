package p5;

import java.util.Locale;

public class Day5Demo13 {

	public static void main(String[] args) {
		Locale l1 = Locale.getDefault();
		System.out.println(l1);
		System.out.println("------------");
		for(Locale x:Locale.getAvailableLocales()) {
			System.out.println(x);
		}
	}

}
