package p2;

public class Multiply extends Calculate {
	public void cal() {
		result = num1*num2;
	}
	@Override
	public void display() {
		System.out.print("Multiplication = ");
		super.display();
  	}
}
