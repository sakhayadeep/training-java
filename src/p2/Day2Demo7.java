package p2;

import p1.Read;

public class Day2Demo7 {

	public static void main(String[] args) {
		System.out.println("Enter planet name :");
		String p = Read.out.nextLine();
		Planet po = Planet.valueOf(p);
		System.out.println(po.x);
		System.out.println(po.y);
		System.out.println(po);
	}

}
