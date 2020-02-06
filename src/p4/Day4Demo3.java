package p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4Demo3 {

	public static void main(String[] args) {
		Integer a1[] = new Integer[] {11, 33, 24, 2, 66, 11, 69, 24};
		Integer a2[] = new Integer[] {11, 33, 21, 22, 55};
		Integer a3[];
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a1));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(a2));
		
//		l1.retainAll(l2);
		l1.removeAll(l2);
		
		System.out.println(l1);
		
	}

}
