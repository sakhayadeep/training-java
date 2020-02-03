package p1;

public class Matrix{
	int a[][];
	
	public void create(int r, int c) {
		a = new int[r][c];
	}
	
	public void read(int r, int c) {
		a = new int[r][c];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Read.out.nextInt();
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public Matrix add(Matrix x, Matrix y) {
		Matrix t = new Matrix();
		t.create(x.a.length, x.a[0].length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				t.a[i][j] = x.a[i][j] + y.a[i][j];
			}
		}
		return t;
	}
}