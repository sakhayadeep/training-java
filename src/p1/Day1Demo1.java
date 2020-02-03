package p1;

public class Day1Demo1 {
	public static void main(String[] args) {
		System.out.println("Program Begins");
		
		try {
			
			Arithematic ob = new Arithematic();
			ob.setData(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			ob.add();
			System.out.println(ob);
			ob.sub();
			System.out.println(ob);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program ends");
	}

}
