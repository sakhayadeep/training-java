package p1;

public class Arithematic {
	int num1, num2, result;
	String op = "";
	
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() {
		result = num1 + num2;
		op = "sum";
	}
	
	public void sub() {
		result = num1 - num2;	
		op = "diff";
	}
	
	public void display() {
		System.out.println(op + " = " + result);
	}
	
	@Override
	public String toString() {
		return op + " = " + result;
	}
	
}
