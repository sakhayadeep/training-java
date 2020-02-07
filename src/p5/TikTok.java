package p5;

public class TikTok extends Thread{
	String x;
	public TikTok(String x) {
		this.x = x;
	}
	
	public void run(){
			System.out.println(x);
	}
}
