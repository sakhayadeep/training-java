package p4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import p1.Read;

public class Day4Demo4 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new TreeMap<String, Integer>();
		m1.put("Delhi", 100000);
		m1.put("Gurgaon", 200000);
		m1.put("Delhi", 300000);
		m1.put("Noida", 400000);
		
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println("---------------");
		
		for(String x: m1.keySet()) {
			System.out.println(x+" : "+m1.get(x));
		}
		System.out.println("---------------");
		
		Iterator<String> it = m1.keySet().iterator();
		while(it.hasNext()) {
			String y = it.next();
			System.out.println(y+":"+m1.get(y));
		}
		System.out.println("---------------");
		
		m1.forEach((a,b)->System.out.println(a+":"+b));
		System.out.println("---------------");
		
		System.out.println("Enter city you want:");
		System.out.println(m1.get(Read.out.nextLine()));
		System.out.println("---------------");
		
		
	}

}
