package p4;

import java.util.*;
import java.util.stream.Collectors;

public class Day4Demo9 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(11);
		l1.add(41);
		l1.add(32);
		l1.add(13);
		l1.add(2);
		
		List<Integer> l2 = l1.stream().filter(Day4Demo9::f1).collect(Collectors.toList());
		
		System.out.println(l2);
	}
	
	public static boolean f1(Integer a) {
		if(a>20) {
			return true;
		}
		return false;
	}

}
