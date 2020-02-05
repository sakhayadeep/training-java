package p3;

import java.util.Date;

public class Day3Demo6 {

	public static void main(String[] args) {
		StudentBean ob = new StudentBean("Ram", "Delhi", new Date());
		StudentBean ob1 = new StudentBean("Ram", "New Delhi", new Date());
		System.out.println(ob.equals(ob1));
		System.out.println(ob.getCity());
		ob.setCity("New Delhi");
		System.out.println(ob.equals(ob1));
		System.out.println(ob);
	}

}
