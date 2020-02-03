package p1;

public class Day1Demo3 {

	public static void main(String[] args) {
//		System.out.println(new Algebra().add(10, 20,true));
		Matrix x1 = new Matrix();
		Matrix x2 = new Matrix();
		Matrix x3;
		System.out.println("Enter values:");
		x1.read(2, 2);
		x2.read(2, 2);
		x3 = x1.add(x1, x2);
		x1.display();
		x2.display();
		x3.display();
	}

}
