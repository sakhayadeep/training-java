package p5;

import java.util.*;

class Game {
	List<String> l1 = new Vector<String>();
	
	public Game() {
		l1.add("tik-");
		l1.add("tok");
	}
	
	public synchronized void f1() {
		try {
//			notify();
			System.out.print(l1.get(0));
			notify();
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void f2() {
		try {
//			notify();
			System.out.println(l1.get(1));
			notify();
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Player1 extends Thread{
	Game g1;
	
	public Player1() {
		
	}

	public Player1(Game g) {
		g1 = g;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				g1.f1();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Player2 extends Thread{
	Game g1;
	
	public Player2() {
		
	}
	
	public Player2(Game g) {
		g1 = g;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				
				if(i==0){
					Thread.sleep(20);
				}
				g1.f2();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Day5Demo2 {

	public static void main(String[] args) {
		Game obj = new Game();
		Player1 p1 = new Player1(obj);
		Player2 p2 = new Player2(obj);
		
		p1.start();
		p2.start();
		
	}

}
