package p2;

public class InsuffBalance extends Exception {
	
	public InsuffBalance() {
		super("Balance Insufficiant/Low");
	}
	
	public InsuffBalance(String x) {
		super(x);
	}

}
