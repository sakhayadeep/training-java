package p5;

public class Day5Demo3 {

	public static void main(String[] args) {
		ThreadDemo2 ob = new ThreadDemo2();
		ThreadDemo2 ob1 = new ThreadDemo2("Infosys", 20);
//		ob.start();
		Thread x = new Thread(ob);
		x.start();
		new Thread(ob1).start();
	}

}
