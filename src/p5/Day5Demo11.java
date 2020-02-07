package p5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Day5Demo11 {

	public static void main(String[] args) throws Exception {
		Cal1 c = new Cal1();
		c.setA(100);
		c.setB(200);
		c.cal();
		
		FileOutputStream fo = new FileOutputStream("C:\\workspace-sakhayadeep\\firstProject\\x.dat");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(c);
		
		System.out.println("Object is serialized");
		oo.close();
		fo.close();
	}

}
