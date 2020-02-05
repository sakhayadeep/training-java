package p3;

import p1.Read;

public class CheckEmail {

	public static void main(String[] args) {
		System.out.println("Enter an email:");
		String email = Read.out.nextLine();
		String m = "[0-9a-z-A-Z](\\.|_|[0-9a-z-A-Z])+@[a-z0-9]+\\.(com|org|in)";
		System.out.println(email.matches(m));
	}

}
