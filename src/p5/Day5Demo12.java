package p5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Day5Demo12 {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("C:\\workspace-sakhayadeep\\firstProject\\x.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Cal1 x;
		x = (Cal1)oi.readObject();
		
		System.out.println(x);
	}

}
