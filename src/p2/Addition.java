package p2;

public class Addition extends Calculate {
	public void cal() {
		result = num1+num2;
	}
	
	@Override
	public void display() {
		System.out.print("Summation = ");
		super.display();
  	}
}
