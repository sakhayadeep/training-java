package p1;

public class Algebra {
	
	public float add(int a, float b) {
		return a+b;
	}
	
	public float add(float a, int b) {
		return a+b;
	}

	public String add(int a, int b,Boolean ...c) {
		return String.valueOf(a)+String.valueOf(b);
		
	}
	public int add(int ...x) {
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i];
		}
		return result;
	}
}
