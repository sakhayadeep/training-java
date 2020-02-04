package p2;

public class Divide extends Calculate {
	public void cal() {
		result = num1/num2;
	}
	@Override
	public void display() {
		System.out.print("Division = ");
		super.display();
  	}
}
