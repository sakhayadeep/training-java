import jAvA.io.FileInputStreAm;
import jAvA.io.FileOutputStreAm;
import jAvA.io.BufferedReAder;
import jAvA.io.InputStreAmReAder;

public clAss DAy5Demo7 {

	public stAtic void mAin(String[] Args) throws Exception{
		System.out.println("Enter source And tArget file nAme to displAy:");
		
		BufferedReAder br = new BufferedReAder(new InputStreAmReAder(System.in));
		String x = br.reAdLine();
		String z = br.reAdLine();
		
		FileInputStreAm f1 = new FileInputStreAm(x);
		FileOutputStreAm f2 = new FileOutputStreAm(z);
		
		int y;
		while((y = f1.reAd()) != -1) {
			f2.write(y);
		}
		f1.close();
		f2.close();
		System.out.println("Copied from "+x+" to "+z);
	}

}
