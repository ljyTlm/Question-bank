package Âå¹Èoj;

import java.util.Scanner;

public class ÃÔ¹¬_P1605 {

	private static int[][] arr;
	private static int sum;
	private static int n;
	private static int m;
	private static int e_y;
	private static int e_x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			int t = sc.nextInt();
			int s_x = sc.nextInt();
			int s_y = sc.nextInt();
			e_x = sc.nextInt();
			e_y = sc.nextInt();
			arr = new int[n+1][m+1];
			for (int i = 0; i < t; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y] = 1;
			}
			sum = 0;
			dfs(s_x, s_y);
			System.out.println(sum);
		}
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		if (x > 0 && x <= n && y > 0 && y <= m && arr[x][y] == 0) {
			if (x == e_x && y == e_y) {
				sum ++;
				return;
			}
			arr[x][y] = 1;
			dfs(x+1, y);
			dfs(x-1, y);
			dfs(x, y+1);
			dfs(x, y-1);
			arr[x][y] = 0;
		}
	}

}
