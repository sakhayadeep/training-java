package p3;

public class Day3Demo3 {

	public static void main(String[] args) {
		StringBuilder a1 = new StringBuilder("Sapient");
		StringBuilder a2 = a1;
		
		System.out.println(a1);
		System.out.println(a2);
		
		a1.append(" Delhi");
		
		System.out.println(a1);
		System.out.println(a2);		
		
		if(a1.equals(a2)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if(a1 == a2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
