package p2;

import java.util.Arrays;

public class Numeric {
	
	int arr[];
	
	public Numeric() {
		System.out.println("I am in 0 arg constructor");
		arr = new int[10];
	}
	
	public Numeric(Numeric ob) {
		System.out.println("I am in copy constructor");
		this.arr = ob.arr;
	}
	
	public Numeric(int x){
		System.out.println("I am in 1 arg constructor");
		arr = new int[x];
	}
	
	public Numeric(int y[]) {
		this(10);
		System.out.println("I am in array parameter constructor");
		this.arr = y;
	}
	
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}		
		System.out.println();
	}
	public void display(boolean x) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}		
		System.out.println();
	}
	public void display(int x) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Integer.toString(arr[i], x));
			
		}
		System.out.println();
	}
	
	{
		System.out.println("I am in anonymous block");
	}
	
	static{
		System.out.println("I am in static anonymous block");
	}
	
	public void finalize() {
		System.out.println("I am in destructor");
		this.arr = null;
	}
	
	public void sort() {
		Arrays.sort(this.arr);
	}
	public void search(int k) {
		this.sort();
		int x = Arrays.binarySearch(this.arr, k);
		if(x<0) {
			System.out.println("Search not found");
		}else {
			System.out.println("Search found at index "+x);
		}
	}
}
