package 洛谷oj;

import java.util.Arrays;
import java.util.Scanner;

public class 尼克的任务_P1280 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Node [] arr = new Node[k];
		int [] num = new int[n+1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Node(sc.nextInt(), sc.nextInt());
			num[arr[i].s] ++;
		}
		Arrays.sort(arr);
		int [] dp = new int[n+2];
		int idx = 0;
		for (int i = n; i >= 1; i--) {
			if (num[i] == 0) {
				dp[i] = dp[i+1] + 1;
			}else {
				dp[i] = dp[i+arr[idx++].e];
				for (int j = 1; j < num[i]; j++) {
					dp[i] = Math.max(dp[i], dp[i+arr[idx++].e]);
				}
			}
		}
		System.out.println(dp[1]);
	}
	static class Node implements Comparable<Node>{
		public Node(int s, int e) {
			// TODO Auto-generated constructor stub
			this.s = s;
			this.e = e;
		}
		Integer s, e;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return -s.compareTo(o.s);
		}
	}
}
