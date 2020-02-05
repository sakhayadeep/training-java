package p3;

interface Test1{
	public void cal(int x, int y);
}

//class T1 implements Test1{
//
//	@Override
//	public void cal(int x, int y) {
//		
//	}
//	
//}

public class Day3Demo5 {

	public static void main(String[] args) {
		Test1 ob[]=new Test1[2];
		ob[0] = new Test1() {
			
			{
				System.out.println("I am in a constructor");
			}
			
			@Override
			public void cal(int x, int y) {
				System.out.println("I am in test "+(x+y));
			}};
		ob[1] = new Test1() {
			
			{
				System.out.println("I am in a constructor");
			}
			
			@Override
			public void cal(int x, int y) {
				System.out.println("I am in test "+(x-y));
			}};
		ob[0].cal(20,30);
		ob[1].cal(20,30);
	}

}
