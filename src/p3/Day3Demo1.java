package p3;

public class Day3Demo1 {

	public static void main(String[] args) {
		String a1 = "Sapient";
		String a2 = "Sapient";
		String a3 = new String("Sapient");
		
		System.out.println(a1.hashCode()+" "+a2.hashCode()+" "+a3.hashCode());
		
		if(a1 == a2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		a2 = a2+"1";
		
		System.out.println(a1.hashCode()+" "+a2.hashCode()+" "+a3.hashCode());
		
		if(a1 == a2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if(a1 == a3) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if(a1.equals(a3)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if(a1.equals(a2)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
