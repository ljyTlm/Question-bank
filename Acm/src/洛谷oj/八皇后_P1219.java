package 洛谷oj;

import java.util.Scanner;

public class 八皇后_P1219 {

	private static int n;
	private static int m;
	private static int[] shu;
	private static int sum;
	private static int[] a;
	private static int[] b;
	private static int[] c;
	private static int[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = 3;
			a = new int[n+1]; // 竖着
			b = new int[2*n+1]; // 正向对角线
			c = new int[2*n+1]; // 反向对角线
			sum = 0;
			dfs(1, "");
			System.out.println(sum);
		}
	}

	private static void dfs(int i, String way) {
		// TODO Auto-generated method stub
		if (i == n+1) {
			if (m > 0) {
				System.out.println(way.trim());
				m --;
			}
			sum ++;
			return;
		}
		for (int j = 1; j <= n; j++) {
			if (cheek(i, j)) {
				flag(i, j, 1);
				dfs(i+1, way+j+" ");
				flag(i, j, 0);
			}
		}
	}

	private static void flag(int i, int j, int k) {
		// TODO Auto-generated method stub
		int [] val = getVal(i, j);
		a[val[0]] = k;
		b[val[1]] = k;
		c[val[2]] = k;
	}

	private static boolean cheek(int i, int j) {
		// TODO Auto-generated method stub
		int [] val = getVal(i, j);
		return a[val[0]] == 0 && b[val[1]] == 0 && c[val[2]] == 0;
	}

	private static int[] getVal(int i, int j) {
		// TODO Auto-generated method stub
		int [] arr = new int[3];
		arr[0] = j;
		arr[1] = j - i + n;
		arr[2] = j + i - 1;
		return arr;
	}

}
