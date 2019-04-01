package 洛谷oj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 滑雪_P1434 {

	static int [] pla = {1, 0, -1, 0, 0, 1, 0, -1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [][] arr = new int[n][m];
			int [][] dp = new int[n][m];
			PriorityQueue<Node> qu = new PriorityQueue<>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
					dp[i][j] = 1;
					qu.add(new Node(i, j, arr[i][j], 1));
				}
			}
			int max = 1;
			while (!qu.isEmpty()) {
				Node node = qu.poll();
				if (node.n < dp[node.x][node.y]) {
					continue;
				}
				max = Math.max(max, node.n);
				for (int i = 0; i < pla.length; i+=2) {
					int next_x = node.x + pla[i];
					int next_y = node.y + pla[i+1];
					if (next_x >= 0 && next_x < n && next_y >= 0 && next_y < m && arr[next_x][next_y] < arr[node.x][node.y] && dp[next_x][next_y] < node.n+1) {
						dp[next_x][next_y] = node.n+1;
						//System.out.println("当前值为："+arr[next_x][next_y]+"  走了"+dp[next_x][next_y]+"步");
						qu.add(new Node(next_x, next_y, arr[next_x][next_y], node.n+1));
					}
				}
			}
			System.out.println(max);
		}
	}
	static class Node implements Comparable<Node>{
		Integer x, y, n, v;

		public Node(int x2, int y2, int v2, int n2) {
			// TODO Auto-generated constructor stub
			x = x2; y = y2; n = n2; v = v2;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return -v.compareTo(o.v);
		}
	}
}
