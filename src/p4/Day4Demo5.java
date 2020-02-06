package p4;

import java.util.HashMap;
import java.util.Map;

public class Day4Demo5 {

	public static void main(String[] args) {
		Integer[] a1 = new Integer[] {11, 43, 22, 6, 11, 11, 22, 4};
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		for(Integer x : a1) {
			int c = 1;
			if(m1.containsKey(x)) {
				c = m1.get(x)+1;
			}
			m1.put(x, c);
		}
		System.out.println(m1);
	}

}
