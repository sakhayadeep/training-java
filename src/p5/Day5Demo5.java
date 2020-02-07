package p5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Day5Demo5 {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter source and target file name to do batch processing :");
		String fsource = Br.br.readLine();
		String ftarget = Br.br.readLine();
		
		BufferedReader b1 = new BufferedReader(new FileReader(fsource));
		BufferedWriter b2 = new BufferedWriter(new FileWriter(ftarget));
		
		String x;
		while((x = b1.readLine()) != null) {
			int result = 0;
			for(String y:x.split("\\+")) {
				result += Integer.parseInt(y.trim());
			}
			x = x+" = "+result;
			b2.write(x);
			b2.newLine();
		}
		b1.close();
		b2.close();
		System.out.println("Processing over.");
	}

}
