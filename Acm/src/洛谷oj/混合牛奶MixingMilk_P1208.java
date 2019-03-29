package Âå¹Èoj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class »ìºÏÅ£ÄÌMixingMilk_P1208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Node [] arr = new Node[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Node();
				arr[i].p = sc.nextInt();
				arr[i].a = sc.nextInt();
			}
			Arrays.sort(arr, new Comparator<Node>() {

				@Override
				public int compare(Node o1, Node o2) {
					// TODO Auto-generated method stub
					return o1.p - o2.p;
				}
			});
			int ans = 0;
			for (int i = 0; i < arr.length && n > 0; i++) {
				if (arr[i].a<=n) {
					n -= arr[i].a;
					ans += arr[i].a * arr[i].p;
				}else {
					ans += arr[i].p * n;
					n = 0;
				}
			}
			System.out.println(ans);
		}
	}
	static class Node {
		int p, a;
	}
}
