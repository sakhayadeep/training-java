package p5;

public class ThreadDemo2 implements Runnable {
	String name;
	int n;

	public ThreadDemo2() {
		name = "Sapient";
		n = 10;
	}
	
	public ThreadDemo2(String name, int n) {
		this.name = name;
		this.n = n;
	}
	
	@Override
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
