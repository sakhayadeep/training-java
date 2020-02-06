package p4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Day4Demo2 {

	public static void main(String[] args) {
		Integer a1[] = new Integer[] {11, 33, 24, 2, 66, 11, 69, 24};
		Integer a2[] = new Integer[] {11, 33, 21, 22, 55};
		Integer a3[];
		System.out.println(a1);
		System.out.println(a1.length);
		Set<Integer> s1 = new LinkedHashSet<Integer>(Arrays.asList(a1));
		Set<Integer> s2 = new LinkedHashSet<Integer>(Arrays.asList(a2));
		System.out.println(s1);
		//s1.toArray(a1);
		List<Integer> l3 = new LinkedList<Integer>(Arrays.asList(a1));
		l3.addAll(new LinkedList(s1));
		System.out.println(l3);
		System.out.println("-------------------");
		for(Integer x:a1) {
			System.out.println(x);
		}
		System.out.println("------------");
		a3 = new Integer[l3.size()];
		l3.toArray(a3);
		for(Integer x:a3) {
			System.out.println(x);
		}
		
	}

}
