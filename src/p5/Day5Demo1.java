package p5;

public class Day5Demo1 {

	public static void main(String[] args) throws Exception {
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1("Infosys", 15);
		ThreadDemo1 t3 = new ThreadDemo1("Wipro", 10);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		System.out.println("Main function over.");
		
	}

}
