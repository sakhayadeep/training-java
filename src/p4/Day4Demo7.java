package p4;

import java.util.function.Function;

public class Day4Demo7 {

	public static void main(String[] args) {
		Calculate ob = (a,b)->a+b;
		Calculate ob1 = (a,b)->{int c; c=a-b; return c;};
		System.out.println(ob.cal(10, 20));
		System.out.println(ob1.cal(30, 44));
		
		f1(10, 20, ob1);
		
		f1(10, 20, (a,b)->a/b);
	}
	
	public static void f1(int a, int b, Calculate ob) {
		System.out.println(ob.cal(a, b));
	}
	
//	public static void f2(Function<void, void> a) {
//		System.out.println("1");
//	}
//	public static void f3() {
//		System.out.println("1");
//	}
	

}
