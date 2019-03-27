package ¿∂«≈±≠oj;

import java.util.Scanner;

public class æÿ’Û≥À∑Ω {

	private static Matrix mod;
	private static int m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int b = scanner.nextInt();
			m = scanner.nextInt();
			long [][] arr = new long [2][2];
			arr[0][0] = scanner.nextInt();
			arr[0][1] = scanner.nextInt();
			arr[1][0] = scanner.nextInt();
			arr[1][1] = scanner.nextInt();
			if (b == 0) {
				arr[0][0] = 1;
				arr[0][1] = 0;
				arr[1][0] = 0;
				arr[1][1] = 1;
				Matrix k = new Matrix(arr);
				mod = k.mod(m);
			}else {
				mod = pow(new Matrix(arr), b).mod(m);
			}
			System.out.println(mod.arr[0][0]+" "+mod.arr[0][1]);
			System.out.println(mod.arr[1][0]+" "+mod.arr[1][1]);
		}
	}

	private static Matrix pow(Matrix matrix, int b) {
		// TODO Auto-generated method stub
		if (b == 1) {
			return matrix;
		}
		if (b % 2 == 0) {
			Matrix k = pow(matrix, b/2);
			return k.multiplication(k).mod(m);
		}else {
			Matrix k = pow(matrix, b/2);
			return k.multiplication(k).multiplication(matrix).mod(m);
		}
	}

}
class Matrix{
	long [][] arr;
	public Matrix(long [][] arr) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}
	
	public Matrix multiplication(Matrix matrix) {
		long [][] v = matrix.arr;
		long [][] sum = new long [arr.length][v[0].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				for (int j2 = 0; j2 < arr[0].length; j2++) {
					sum[i][j] += arr[i][j2] * v[j2][j];
				}
			}
		}
		return new Matrix(sum);
	}
	
	public Matrix mod(int v) {
		long [][] sum = new long [arr.length][arr[0].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = arr[i][j] % v;
			}
		}
		return new Matrix(sum);
	}
}