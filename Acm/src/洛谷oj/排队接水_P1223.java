package Âå¹Èoj;

import java.util.Arrays;
import java.util.Scanner;

public class ÅÅ¶Ó½ÓË®_P1223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			Node [] arr = new Node [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Node();
				arr[i].idx = i+1;
				arr[i].ti = sc.nextInt();
			}
			Arrays.sort(arr);
			double ans = 0;
			double sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += ans;
				ans += arr[i].ti;
				System.out.print(arr[i].idx+" ");
			}
			System.out.println();
			System.out.printf("%.2f",(sum/n));
			System.out.println();
		}
	}
	static class Node implements Comparable<Node>{
		int idx;
		double ti;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (ti == o.ti) {
				return idx - o.idx;
			}
			return (int)(ti - o.ti);
		}
	}
}
