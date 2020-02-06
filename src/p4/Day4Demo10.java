package p4;

import java.util.StringTokenizer;

public class Day4Demo10 {
	public static void main(String[] args) {
		StringTokenizer k = new StringTokenizer("Any string, another string, 10,20,30", ", ", false);
		while(k.hasMoreTokens()) {
			String x = k.nextToken();
			System.out.println(x);
		}
	}
}
