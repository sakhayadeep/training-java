package p5;

public class TikTokDemo {

	public static void main(String[] args) {
		TikTok t1 = new TikTok("Tik");
		TikTok t2 = new TikTok("Tok");
		
		for (int i = 0; i < 10; i++) {
			t1.start();
			t2.start();
		}
	}

}
