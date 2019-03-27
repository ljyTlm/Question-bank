package º¼µçoj;

import java.util.Scanner;

public class hdu1166 {

	private static int[] tree;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			tree = new int [50010];
			for (int j = 1; j <= n; j++) {
				int v = sc.nextInt();
				add(j+1, v);
			}
			System.out.println("Case "+i+":");
			while (true) {
				String a = sc.next();
				if (a.equals("End")) break;
				int b = sc.nextInt();
				int c = sc.nextInt();
				if (a.equals("Add")) {
					add(b+1, c);
				}else if (a.equals("Sub")) {
					add(b+1, -c);
				}else {
					System.out.println(sum(c+1)-sum(b));
				}
			}
		}
	}

	private static int sum(int i) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (i > 0) {
			sum += tree[i];
			i -= lowbit(i);
		}
		return sum;
	}

	private static void add(int j, int v) {
		// TODO Auto-generated method stub
		while (j < 50010) {
			tree[j] += v;
			j += lowbit(j);
		}
	}

	private static int lowbit(int j) {
		// TODO Auto-generated method stub
		return (-j) & j;
	}
	
	
}
