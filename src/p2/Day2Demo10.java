package p2;

public class Day2Demo10 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i);
				if(i%2==0)
					continue;
				try {
					System.out.println(i);
					if(i%5 == 0)
						continue;
					try {
						System.out.println(i);
					} catch (Exception e) {
						// TODO: handle exception
					}finally {
						System.out.println("I am in inner inner finally block");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}finally {
					System.out.println("I am in inner finally block");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				System.out.println("I am in finally block");
			}
		}
	}
}
