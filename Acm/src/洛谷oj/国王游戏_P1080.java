package Âå¹Èoj;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ¹úÍõÓÎÏ·_P1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		Node [] arr = new Node[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Node(sc.nextLong(), sc.nextLong());
		}
		Arrays.sort(arr);
		BigInteger max = BigInteger.ZERO;
		BigInteger ans = new BigInteger(a+"");
		for (int i = 0; i < arr.length; i++) {
			BigInteger value = ans.divide(new BigInteger(arr[i].b+""));
			if (value.compareTo(max) > 0) {
				max = value;
			}
			ans = ans.multiply(new BigInteger(arr[i].a+""));
		}
		System.out.println(max);
	}
	static class Node implements Comparable<Node>{
		Long a, b, v;

		public Node(long a, long b) {
			// TODO Auto-generated constructor stub
			this.a = a;
			this.b = b;
			this.v = a*b;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return v.compareTo(o.v);
		}
	}
}
