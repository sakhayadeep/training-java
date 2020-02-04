package p2;

import p1.Read;

public class Day2Demo9 {

	public static void main(String[] args) {
		try {
			int balance = 100;
			System.out.println("Enter amount for withdrawl:");
			
			int c = Read.out.nextInt();
			if(c>balance) {
				throw new InsuffBalance("Bye Bye");
			}
			System.out.println("Please wait your transaction is in process...");
			
		}catch(InsuffBalance e) {
			System.out.println("I am in Insuff");
			System.out.println(e);
			System.out.println(e.getMessage());
		}catch(Exception e1) {
			System.out.println("I am in Exception");
			System.out.println(e1);
			System.out.println(e1.getMessage());
		}
	}

}
