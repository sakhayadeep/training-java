package p3;

import java.util.Arrays;
import java.util.Date;

public class Day3Demo8 {

	public static void main(String[] args) {
		StudentBean ob[] = new StudentBean[3];
		
		ob[0] = new StudentBean("Ram", "Mumbai", new Date());
		ob[1] = new StudentBean("Shyam", "Kolkata", new Date());
		ob[2] = new StudentBean("Jack", "London", new Date());
		
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		System.out.println("...............................");
		
		Arrays.sort(ob);
		
		for(StudentBean x : ob) {
			System.out.println(x);
		}
		
	}

}
