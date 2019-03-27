package 杭电oj;

import java.util.Scanner;

public class hdu1541树状数组 {
	//树状数组
	private static int n;
	private static int[] c;
	private static int[] garde;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			c = new int[33000];
			garde = new int[n];
			for (int i = 0; i < n; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				garde[sum(x + 1)]++;
				add(x + 1);
			}
			for (int i = 0; i < garde.length; i++) {
//				System.out.println(garde[i]);
			}
		}
	}

	private static void add(int x) {
		while (x < 33000) {
			c[x]++;
			x += lowbit(x);
		}
	}

	private static int sum(int x) {
		int sum = 0;
		while (x > 0) {
			sum += c[x];
			x -= lowbit(x);
		}
		return sum;
	}

	private static int lowbit(int x) {
		// TODO Auto-generated method stub
		return x & (-x);
	}

}