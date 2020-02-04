package p2;

import p1.Read;

public class Day2Demo8 {

	public static void main(String[] args) {
		int a,b,c;
		try {
			System.out.println("Enter 2 numbers:");
			a = Read.out.nextInt();
			b = Read.out.nextInt();
			f1(a,b);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}finally {
			System.out.println("Program over");
		}
		
	}
	
	public static void f1(int x, int y) throws Exception {
		System.out.println(x/y);
	}

}
