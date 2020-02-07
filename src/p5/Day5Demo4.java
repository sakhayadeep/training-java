package p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5Demo4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Enter your name : ");
//		String x = br.readLine();
//		System.out.println(x);
//		
		System.out.println("Enter 2 nums : ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = a+b;
		System.out.println(c);
		
		
	}

}
