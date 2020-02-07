package p5;

public class ThreadDemo1 extends Thread {
	String name;
	int n;

	public ThreadDemo1() {
		name = "Sapient";
		n = 10;
	}
	
	public ThreadDemo1(String name, int n) {
		this.name = name;
		this.n = n;
	}
	
	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void finalize() {
	}
}
