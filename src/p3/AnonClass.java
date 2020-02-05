package p3;

abstract class A1{
	public abstract void display1();
}

class A2{
	final static int x = 10;
	public void display2() {
		System.out.println("I am in A2 "+A2.x);
	}
}

public class AnonClass {

	public static void main(String[] args) {
		A1 ob = new A1() {

			@Override
			public void display1() {
				System.out.println("I am in A1");
			}
			
		};
		A2 ob1 = new A2() {
			@Override
			public void display2() {
				System.out.println("I am in A3");
			}
		};
		
		ob.display1();
		ob1.display2();
	}

}
