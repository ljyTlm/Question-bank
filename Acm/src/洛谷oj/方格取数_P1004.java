package 洛谷oj;

import java.util.LinkedList;
import java.util.Scanner;

public class 方格取数_P1004 {
	public static int [] pla = {0, 1, 0, 1,   0, 1, 1, 0,   1, 0, 1, 0,   1, 0, 0, 1};
	private static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [][] arr = new int[n+1][n+1];
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			arr[a][b] = c;
		}
		int [][][][] dp = new int [n+1][n+1][n+1][n+1];
		dp[1][1][1][1] = arr[1][1];
		LinkedList<Node> qu = new LinkedList<>();
		qu.add(new Node(1, 1, 1, 1, arr[1][1]));
		while (!qu.isEmpty()) {
			Node node = qu.poll();
			for (int i = 0; i < pla.length; i+=4) {
				int x_1 = node.a + pla[i];
				int y_1 = node.b + pla[i+1];
				int x_2 = node.c + pla[i+2];
				int y_2 = node.d + pla[i+3];
				if (cheek(x_1, y_1) && cheek(x_2, y_2)) {
					if (!(x_1 == x_2 && y_1 == y_2) && dp[x_1][y_1][x_2][y_2] <= node.v + arr[x_1][y_1] + arr[x_2][y_2]) {
						dp[x_1][y_1][x_2][y_2] = node.v + arr[x_1][y_1] + arr[x_2][y_2];
						qu.add(new Node(x_1, y_1, x_2, y_2, dp[x_1][y_1][x_2][y_2]));
					}
				}
			}
		}
		System.out.println((arr[n][n] + Math.max(dp[n][n-1][n-1][n], dp[n-1][n][n][n-1])));
	}
	private static boolean cheek(int x, int y) {
		// TODO Auto-generated method stub
		return x >= 1 && x <= n && y >= 1 && y <= n;
	}
	static class Node {
		int a, b, c, d, v;
		public Node(int a, int b, int c, int d, int v) {
			// TODO Auto-generated constructor stub
			this.a = a; this.b = b; this.c = c; this.d = d; this.v = v;
		}
		
	}
}
