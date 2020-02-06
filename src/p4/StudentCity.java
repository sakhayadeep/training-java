package p4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import p1.Read;
import p3.StudentBean;

public class StudentCity {
	
	private String city;
	
	public static void main(String[] args) {
		List<StudentBean> st = new ArrayList<StudentBean>();
		st.add(new StudentBean("Ravi", "Delhi", new Date()));
		st.add(new StudentBean("Ram", "Mumbai", new Date()));
		st.add(new StudentBean("Sita", "Kolkata", new Date()));
		st.add(new StudentBean("Laxman", "Delhi", new Date()));
		
		StudentCity ob = new StudentCity();
		
		System.out.println("Enter city to filter with:");
		ob.city = Read.out.nextLine().toLowerCase();
		
		List<StudentBean> stf = st.stream().filter(ob::isMatching).collect(Collectors.toList());
		System.out.println(stf);
	}
	
	public boolean isMatching(StudentBean x) {
		if(x.getCity().toLowerCase().equals(this.city)) {
			return true;
		}
		return false;
	}

}
