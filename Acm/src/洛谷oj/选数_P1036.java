package Âå¹Èoj;

import java.util.Scanner;

public class Ñ¡Êý_P1036 {

	private static int sum;
	private static long[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		sum = 0;
		dfs(0, k, 0);
		System.out.println(sum);
	}

	private static void dfs(int s, int k, long ans) {
		// TODO Auto-generated method stub
		if (k == 0) {
			if (ans == 2 || ans % 2 != 0) {
				for (long i = 2; i < ans; i++) {
					if (ans % i == 0) {
						return;
					}
				}
				sum ++;
			}
			return;
		}
		for (int i = s; i < arr.length; i++) {
			dfs(i+1, k-1, ans+arr[i]);
		}
	}

}
