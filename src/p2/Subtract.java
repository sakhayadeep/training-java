package p2;

public class Subtract extends Calculate {
	public void cal() {
		result = num1-num2;
	}
	
	@Override
	public void display() {
		System.out.print("Subtraction = ");
		super.display();
  	}
}
