package º¼µçoj;

import java.util.Scanner;

public class hdu1005 {
	static Mrx unit = new Mrx(2, 2);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		unit.arr[0][0] = 1;
		unit.arr[0][1] = 0;
		unit.arr[1][0] = 0;
		unit.arr[1][1] = 1;
		Mrx k = new Mrx(2, 1);
		k.arr[0][0] = 1;
		k.arr[1][0] = 1;
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			if (n == 0 && a == 0 && b == 0) {
				return;
			}
			if (n == 1 || n == 2) {
				System.out.println(1);
				continue;
			}
			Mrx x = new Mrx(2, 2);
			x.arr[0][0] = a;
			x.arr[0][1] = b;
			x.arr[1][0] = 1;
			x.arr[1][1] = 0;
			Mrx sum = quickPow(x, n-2).mu(k);
			System.out.println(sum.arr[0][0]%7);
		}
	}

	private static Mrx quickPow(Mrx x, int n) {
		// TODO Auto-generated method stub
		Mrx sum = unit;
		Mrx v = x;
		while (n > 0) {
			if ((n&1) == 1) {
				sum = sum.mu(v);
			}
			v = v.mu(v);
			n >>= 1;
		}
		return sum;
	}

}
class Mrx{
	int [][] arr;
	int x, y;
	public Mrx(int i, int j) {
		// TODO Auto-generated constructor stub
		arr = new int [i][j];
		this.x = i;
		this.y = j;
	}
	
	public Mrx mu(Mrx k) {
		// TODO Auto-generated method stub
		Mrx vla = new Mrx(k.x, k.y);
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < k.y; j++) {
				for (int z = 0; z < y; z++) {
					vla.arr[i][j] += arr[i][z]*k.arr[z][j];
					vla.arr[i][j] %= 7;
				}
			}
		}
		return vla;
	}
}
