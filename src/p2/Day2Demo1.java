package p2;

public class Day2Demo1 {

	public static void main(String[] args) {
		Numeric ob = new Numeric(new int[] {540,60,7});
		ob.display();
		Numeric ob1 = new Numeric(ob);
		ob1.display();
		ob1.sort();
		ob1.display();
		ob1.search(60);
		ob1.display(15);
		ob = null;
		ob1 = null;
		System.gc();
	}

}
