package º¼µçoj;

import java.util.Arrays;
import java.util.Scanner;

public class hdu5124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			Node [] arr = new Node[2*n];
			for (int i = 0; i < arr.length; i+=2) {
				arr[i] = new Node(sc.nextLong(), 1);
				arr[i+1] = new Node(sc.nextLong(), -1);
			}
			Arrays.sort(arr);
			int max = 0;
			int ans = 0;
			for (int i = 0; i < arr.length; i++) {
				ans += arr[i].k;
				max = Math.max(max, ans);
			}
			System.out.println(max);
		}
	}
	static class Node implements Comparable<Node>{
		public Node(long a, long b) {
			// TODO Auto-generated constructor stub
			v = a; k = b;
		}
		Long v, k;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (v == o.v) {
				return -k.compareTo(o.k);
			}
			return v.compareTo(o.v);
		}
	}
}
