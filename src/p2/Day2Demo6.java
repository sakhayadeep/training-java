package p2;

import p1.Read;

public class Day2Demo6 {

	public static void main(String[] args) {
		String trig;
		System.out.println("Enter trig func: ");
		trig = Read.out.nextLine();

		TrigOp op = TrigOp.valueOf(trig.split("\\(")[0]);
		switch(op) {
		case sin:{System.out.println(Math.sin(Integer.parseInt(trig.split("\\(")[1].split("\\)")[0])*(Math.PI/180.0)));}
		break;
		default:{System.out.println("This function is still not implemented");}
		}
		
	}

}
