package p5;

import java.io.Serializable;

public class Cal1 implements Serializable{
	private int a, b, c;
	private transient int d;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void cal() {
		c = a + b;
		d = c;
	}
	
	@Override
	public String toString() {
		return "Cal1 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	
	
}
