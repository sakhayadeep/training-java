package p3;

import java.util.*;

public class StudentBean {
	private String name;
	private String city;
	private Date dob;
	
	public StudentBean() {
	}
	
	public StudentBean(String name, String city, Date dob) {
		super();
		this.name = name;
		this.city = city;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+city.hashCode()+dob.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentBean) {
			
			StudentBean x = (StudentBean)obj;
			if(this.hashCode() == x.hashCode())
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", city=" + city + ", dob=" + dob + "]";
	}
	
}
