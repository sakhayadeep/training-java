import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day5Demo8{

	public static void main(String[] args) throws Exception{
		System.out.println("Enter source and target file name to display:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String z = br.readLine();
		
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
