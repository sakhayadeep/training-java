package p5;

import java.io.*;

public class Day5Demo10 {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter filename for update:");
		String f1 = Br.br.readLine();
		long fp = 0L;
		File file = new File(f1);
		
		RandomAccessFile rm = new RandomAccessFile(file, "rw");
		
		int ch;
		while((ch = rm.read()) != -1) {
			if(ch == 97) {
				rm.seek(fp);
				rm.write(65);
			}
			fp++;
		}
		rm.close();
		System.out.println("File is processed.");
	}
}
