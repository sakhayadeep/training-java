package p2;

import p1.Read;

public abstract class Calculate implements CalculateInterface {
	int num1, num2, result;
	
	public void read() {
		System.out.println("Enter 2 numbers :");
		num1 = Read.out.nextInt();
		num2 = Read.out.nextInt();
	}
	public void read(int a, int b) {
		num1 = a;
		num2 = b;
	}

	
	public void display() {
		System.out.println(result);
  	}
	
	public void cal() {
	}
}
