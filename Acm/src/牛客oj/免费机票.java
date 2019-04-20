package 牛客oj;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class 免费机票 {

	private static int[] head;
	private static int idx;
	private static Node[] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		head = new int[n+1];
		idx = 1;
		arr = new Node[8000];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			add(a, b, c);
			add(b, a, c);
		}
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			add(a, b, 0);
			add(b, a, 0);
		}
		int [][] dp = new int[n+1][2];
		for (int i = 0; i < dp.length; i++) {
			dp[i][1] = dp[i][0] = Integer.MAX_VALUE - 2000;
		}
		LinkedList<Node> qu = new LinkedList<>();
		dp[s][0] = 0;
		qu.add(new Node(s, 0, 0));
		while (!qu.isEmpty()) {
			Node now = qu.poll();
			int next = head[now.idx];
			while (next != 0) {
				if (now.fat == 0) { //没使用过免费区间
					if (arr[next].val != 0) {
						if (dp[arr[next].idx][0] > now.val + arr[next].val) {
							dp[arr[next].idx][0] = now.val + arr[next].val;
							qu.add(new Node(arr[next].idx, dp[arr[next].idx][0], 0));
						}
					}else {
						if (dp[arr[next].idx][1] > now.val) {
							dp[arr[next].idx][1] = now.val;
							qu.add(new Node(arr[next].idx, dp[arr[next].idx][1], 1));
						}
					}
				}else {
					if (arr[next].val != 0) {
						if (dp[arr[next].idx][1] > now.val + arr[next].val) {
							dp[arr[next].idx][1] = now.val + arr[next].val;
							qu.add(new Node(arr[next].idx, dp[arr[next].idx][1], 1));
						}
					}
				}
				next = arr[next].fat;
			}
		}
		if (dp[e][0] >= dp[e][1]) {
			System.out.println("Yes\n"+dp[e][1]);
		}else {
			System.out.println("No\n"+dp[e][0]);
		}
	}
	private static void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		arr[idx] = new Node(b, c, head[a]);
		head[a] = (idx++);
	}
	static class Node {
		public Node(int b, int c, int i) {
			// TODO Auto-generated constructor stub
			idx = b;
			val = c;
			fat = i;
		}
		int idx;
		int val;
		int fat;
	}
}
