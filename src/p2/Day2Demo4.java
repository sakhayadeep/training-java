package p2;

import p1.Read;

public class Day2Demo4 {

	public static void main(String[] args) {
		CalculateInterface ob[] = new Calculate[4];
		ob[0] = new Addition();
		ob[1] = new Subtract();
		ob[2] = new Multiply();
		ob[3] = new Divide();
		
		int ch;
		
		System.out.println("Enter choice : ");
		ch = Read.out.nextInt();
		ob[ch-1].read();
		ob[ch-1].cal();
		ob[ch-1].display();
	}

}
