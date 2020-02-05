package p3;

class G1<S1>{
	S1 a, b;
	public void setData(S1 x, S1 b) {
		a = x;
		this.b = b; 
	}
	
	public void display() {
		System.out.println(a + " " + b);
	}
}
class G2<S1, S2>{
	S1 a;
	S2 b;
	public void setData(S1 x, S2 b) {
		a = x;
		this.b = b; 
	}
	
	public void display() {
		System.out.println(a + " " + b);
	}
}

public class Day3Demo7 {
	public static void main(String[] args) {
		G1<Integer> ob = new G1<Integer>();
		ob.setData(10, 20);
		ob.display();
		
		G1<String> ob1 = new G1();
		ob1.setData("delhi", "value2");
		ob1.display();

		G2<String, Integer> ob2 = new G2();
		ob2.setData("delhi", 6);
		ob2.display();
	}
}
