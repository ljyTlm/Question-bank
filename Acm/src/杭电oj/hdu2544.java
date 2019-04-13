package º¼µçoj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class hdu2544 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) {
				return;
			}
			int [][] arr = new int[n+1][n+1];
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				arr[a][b] = arr[b][a] = c;
			}
			LinkedList<Node> qu = new LinkedList<>();
			qu.add(new Node(1, 0));
			int [] dp = new int[n+1];
			Arrays.fill(dp, 99999999);
			dp[1] = 0;
			while (!qu.isEmpty()) {
				Node node = qu.poll();
				for (int i = 1; i <= n; i++) {
					if (arr[node.idx][i] > 0 && node.val + arr[node.idx][i] < dp[i]) {
						dp[i] = node.val + arr[node.idx][i];
						qu.add(new Node(i, dp[i]));
					}
				}
			}
			System.out.println(dp[n]);
		}
	}
	static class Node {
		public Node(int i, int j) {
			// TODO Auto-generated constructor stub
			idx = i;
			val = j;
		}

		int idx, val;
	}
}
