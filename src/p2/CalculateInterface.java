package p2;

public abstract interface CalculateInterface {
//	int x=10;
	public abstract void read();
	public abstract void read(int a, int b);
	public abstract void cal();
	public default void display() {
		System.out.println("result");
	}
}
