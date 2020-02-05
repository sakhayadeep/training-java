package p3;

import p1.Read;

public class Day3Demo4 {

	public static void main(String[] args) {
		System.out.println("Enter a value:");
		int a = Read.out.nextInt();
		int b = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
		if(a==b) {
			System.out.println("Palindrome.");
		}else {
			System.out.println("Not a palindrome.");
		}
		
		StringBuilder x = new StringBuilder("sapient");
		System.out.println(x.toString().toUpperCase());
		System.out.println(x);
		
		x.replace(0, x.length(), x.toString().toUpperCase());
		System.out.println(x);
	}

}
