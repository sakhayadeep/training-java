package p1;

public class Day1Demo1 {
	public static void main(String[] args) {
		System.out.println("Program Begins");
		int x=0;
		try {
			int y=x;
			System.out.println(y);
			System.out.println(Arithematic.result1);
			Arithematic ob = new Arithematic();
			ob.num1 = 20;
			ob.result1=200;
			Arithematic ob1 = new Arithematic();
			ob.num1 = 30;
			ob1.result1 = 300;
			System.out.println(ob.result1+ " "+ ob1.result1);
			System.out.println(ob.num1+" "+ ob.num1+" "+ob.num2);
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
