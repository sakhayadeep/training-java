package p5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import p5.Br;

public class Day5Demo7 {

	public static void main(String[] args) throws Exception{
		System.out.println("Enter source and target file name to display:");
		String x = Br.br.readLine();
		String z = Br.br.readLine();
		
		FileInputStream f1 = new FileInputStream(x);
		FileOutputStream f2 = new FileOutputStream(z);
		
		int y;
		while((y = f1.read()) != -1) {
			f2.write(y);
		}
		f1.close();
		f2.close();
		System.out.println("Copied from "+x+" to "+z);
	}

}
