package p4;
import java.util.*;
public class Day4Demo6 {
	public static void main(String[] args) {
		Deque<Integer> d1 = new LinkedList<Integer>();
		d1.add(20);
		d1.add(24);
		
		System.out.println(d1);
		
		d1.push(40);
		System.out.println(d1);
		
		System.out.println(d1.peek());
		
		d1.add(50);
		System.out.println(d1);
		
		d1.remove();
		System.out.println(d1);
		
		int x = d1.pop();
		System.out.println(x);
		System.out.println(d1);
		
		d1.offer(250);
		System.out.println(d1);
		
		d1.removeLast();
		System.out.println(d1);
	}
}
