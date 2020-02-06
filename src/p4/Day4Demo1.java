package p4;

import java.util.*;

public class Day4Demo1 {

	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(new Integer(40));
		l1.add(30);
		
		System.out.println(l1);
		System.out.println(l1.get(0));
		System.out.println("================================");
		
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("================================");
		
		for (Integer i : l1) {
			System.out.println(i);
		}
		System.out.println("================================");
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			int x = it.next();
			System.out.println(x);
		}
		System.out.println("================================");
		
		l1.forEach(System.out::println);
		System.out.println("================================");
		
		Day4Demo1 ob = new Day4Demo1();
		l1.forEach(ob::square);
		System.out.println("================================");
		
		l1.add(0,100);
		System.out.println(l1);
		System.out.println("================================");
		
		l1.clear();
		System.out.println(l1);
		System.out.println("================================");
	}
	
	public void square(int x) {
		System.out.println(x*x);
	}

}
