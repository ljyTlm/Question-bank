package Âå¹Èoj;

import java.util.Arrays;
import java.util.Scanner;

public class »ÊºóÓÎÏ·_P2123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			int n = sc.nextInt();
			Node [] arr = new Node[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Node(sc.nextLong(), sc.nextLong());
			}
			Arrays.sort(arr);
			long ans = arr[0].a;
			long last = arr[0].a + arr[0].b;
			long max = last;
			for (int i = 1; i < arr.length; i++) {
				ans += arr[i].a;
				long money = Math.max(last, ans) + arr[i].b;
				max = Math.max(max, money);
				last = money;
			}
			System.out.println(max);
		}
	}
	static class Node implements Comparable<Node>{
		public Node(long nextInt, long nextInt2) {
			// TODO Auto-generated constructor stub
			a = nextInt;
			b = nextInt2;
		}

		Long a, b;

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			Long x = Math.max(a, o.b);
			Long y = Math.max(o.a, b);
			return x.compareTo(y);
		}
	}
}
