package p4;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(5);
		s1.add(2);
		s1.add(1);
		s1.add(6);
		s1.add(11);
		s1.add(2);
		s1.add(50);
		s1.add(20);
		s1.add(10);
		s1.add(60);
		s1.add(110);
		s1.add(20);
		
		System.out.println(s1);
		s1.forEach(System.out::println);
		System.out.println("================================");

		Set<Integer> s2 = new TreeSet<Integer>();
		s2.add(5);
		s2.add(2);
		s2.add(1);
		s2.add(6);
		s2.add(11);
		s2.add(2);
		s2.add(50);
		s2.add(20);
		s2.add(10);
		s2.add(60);
		s2.add(110);
		s2.add(20);
		
		System.out.println(s2);
		s2.forEach(System.out::println);
		System.out.println("================================");
		
		
	}

}
