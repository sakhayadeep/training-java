package p5;

import java.io.*;

//DO NOT USE THIS !!!
public class Day5Demo6 {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Enter file name to display:");
		String x = Br.br.readLine();
		FileInputStream f1 = new FileInputStream(x);
		int y;
		while((y = f1.read()) != -1) {
			System.out.print((char)y);
			
		}
		f1.close();
	}

}
