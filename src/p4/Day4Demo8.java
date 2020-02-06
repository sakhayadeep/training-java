package p4;

import p3.StudentBean;

import java.text.SimpleDateFormat;
import java.util.*;

public class Day4Demo8 {

	public static void main(String[] args) {
//		SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
		List<StudentBean> students = new ArrayList<StudentBean>();
//		Date l1 = new Date(2000,2,14);
		
//		l1.parse("14-02-2000");
		students.add(new StudentBean("Ravi", "Wassaypur", new Date(2000,2,14)));
		students.add(new StudentBean("Ram", "Rampur", new Date(2000,3,14)));
		students.add(new StudentBean("A", "z", new Date(1976,3,14)));
		
		System.out.println(students);
		
		students.forEach((a)->{System.out.println((new SimpleDateFormat("dd-MM-yyyy").format(a.getDob())));});
		
		Collections.sort(students);
		System.out.println(students);
		
		Collections.sort(students, (a,b)->a.getCity().compareTo(b.getCity()));
		System.out.println(students);

		Collections.sort(students, (a,b)->a.getDob().compareTo(b.getDob()));
		System.out.println(students);
	
	}

}
