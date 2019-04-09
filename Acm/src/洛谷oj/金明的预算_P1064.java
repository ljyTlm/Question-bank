package Âå¹Èoj;

import java.util.Scanner;

public class ½ðÃ÷µÄÔ¤Ëã_P1064 {

	private static int[] dp;
	private static Node[] arr;
	private static int n;
	private static int m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new Node[61];
		int idx = 0;
		for (int i = 1; i <= m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr[i] = new Node(a, b*a, c);
			if (c > 0) {
				arr[c].node[arr[c].idx++] = arr[i];
			}
		}
		dp = new int[n+1];
		for (int i = 1; i <= m; i++) {
			if (arr[i].c == 0) {
				for (int j = n; j >= 0; j--) {
					f(j, arr[i].a, arr[i].b);
					if (arr[i].node[0] != null) {
						f(j, arr[i].a + arr[i].node[0].a, arr[i].b + arr[i].node[0].b);
					}
					if (arr[i].node[1] != null) {
						f(j, arr[i].a + arr[i].node[1].a, arr[i].b + arr[i].node[1].b);
					}
					if (arr[i].node[0] != null && arr[i].node[1] != null) {
						f(j, arr[i].a + arr[i].node[0].a + arr[i].node[1].a, arr[i].b + arr[i].node[0].b + arr[i].node[1].b);
					}
				}
			}
		}
		System.out.println(dp[n]);
	}
	
	private static void f(int j, int a, int k) {
		// TODO Auto-generated method stub
		if (j >= a) {
			dp[j] = Math.max(dp[j], dp[j-a] + k);
		}
	}

	static class Node {
		public Node(int a2, int b2, int c2) {
			// TODO Auto-generated constructor stub
			a = a2; b = b2; c = c2;
			idx = 0;
			node = new Node[2];
		}
		int a, b, c, idx;
		Node [] node;
	}
}
