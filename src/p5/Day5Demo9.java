package p5;

import java.io.File;

public class Day5Demo9 {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter filename:");
		String s1 = Br.br.readLine();
		File f1 = new File(s1);
		if(f1.exists()) {
			System.out.println("File exists");
			if(f1.isDirectory()) {
				System.out.println("is a directory");
				String[] a1 = f1.list();
				for(String x : a1) {
					System.out.println(x);
				}
			}else {
				System.out.println("is not a directory");
			}
		}else {
			System.out.println("File does not exist");
		}
	}

}
