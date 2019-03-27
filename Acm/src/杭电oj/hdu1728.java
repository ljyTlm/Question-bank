package º¼µçoj;

import java.util.Scanner;

public class hdu1728 {

	private static int n;
	private static int m;
	private static int sx;
	private static int sy;
	private static int ex;
	private static int ey;
	private static char[][] arr;
	private static int[][] dp;
	private static int jianzhi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int p = 0; p < t; p++) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			arr = new char [n][m];
			dp = new int [n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.next().toCharArray();
			}
			int k = scanner.nextInt();
			sx = scanner.nextInt()-1;
			sy = scanner.nextInt()-1;
			ey = scanner.nextInt()-1;
			ex = scanner.nextInt()-1;
			dfs(sx, sy, 0, 0);
			if (dp[ex][ey] == Integer.MAX_VALUE || dp[ex][ey] > k) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
		}
	}

	private static void dfs(int x, int y, int i, int flag) {
		// TODO Auto-generated method stub
		if (x >= 0 && x < n && y >= 0 && y < m && arr[x][y] == '.' && i < dp[x][y]) {
			dp[x][y] = i;
			arr[x][y] = '*';
			switch (flag) {
			case 0:
				dfs(x+1, y, i, 1);
				dfs(x-1, y, i, 2);
				dfs(x, y+1, i, 3);
				dfs(x, y-1, i, 4);
				break;
			case 1:
				dfs(x+1, y, i, 1);
				dfs(x, y+1, i+1, 3);
				dfs(x, y-1, i+1, 4);
				break;
			case 2:
				dfs(x-1, y, i, 2);
				dfs(x, y+1, i+1, 3);
				dfs(x, y-1, i+1, 4);
				break;
			case 3:
				dfs(x+1, y, i+1, 1);
				dfs(x-1, y, i+1, 2);
				dfs(x, y+1, i, 3);
				break;
			case 4:
				dfs(x+1, y, i+1, 1);
				dfs(x-1, y, i+1, 2);
				dfs(x, y-1, i, 4);
				break;
			default:
				break;
			}
			arr[x][y] = '.';
		}
	}

}
