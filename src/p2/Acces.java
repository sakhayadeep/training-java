package p2;

public class Acces {
	private int a = 10;
	int a1 = 20;
	protected static int a2 = 30;
	public int a3 = 40;

//	Acces() {
//		System.out.println("I am in constructor");
//	}
	private void f1() {
		System.out.println("I am in f1");
	}
	
	void f2() {
		System.out.println("I am in f2");
	}
	
	protected static void f3() {
		System.out.println("I am in f3");
	}
	
	public void f4() {
		System.out.println("I am in f4");
	}
}
