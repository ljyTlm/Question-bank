package Âå¹Èoj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Ä¾¹÷¼Ó¹¤_P1233 {

	private static Node[] arr;
	private static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new Node[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Node(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				if (o1.b == o2.b) {
					return -o1.a.compareTo(o2.a);
				}
				return -o1.b.compareTo(o2.b);
			}
		});
		int ans_1 = getInt_1();
		Arrays.sort(arr, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				if (o1.a == o2.b) {
					return -o1.b.compareTo(o2.b);
				}
				return -o1.a.compareTo(o2.a);
			}
		});
		int ans_2 = getInt_2();
		System.out.println(Math.min(ans_1, ans_2));
	}
	
	private static int getInt_1() {
		// TODO Auto-generated method stub
		int ans = 1;
		int [] dp = new int[n];
		Arrays.fill(dp, 1);
		for (int i = 0; i < dp.length; i++) {
			for (int j = i-1; j >= 0; j --) {
				if (arr[i].a > arr[j].a) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
				ans = Math.max(ans, dp[i]);
			}
		}
		return ans;
	}
	
	private static int getInt_2() {
		// TODO Auto-generated method stub
		int ans = 1;
		int [] dp = new int[n];
		Arrays.fill(dp, 1);
		for (int i = 0; i < dp.length; i++) {
			for (int j = i-1; j >= 0; j --) {
				if (arr[i].b > arr[j].b) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
				ans = Math.max(ans, dp[i]);
			}
		}
		return ans;
	}

	static class Node {
		public Node(int a, int b) {
			// TODO Auto-generated constructor stub
			this.a = a;
			this.b = b;
		}
		Integer a, b;
	}
}
