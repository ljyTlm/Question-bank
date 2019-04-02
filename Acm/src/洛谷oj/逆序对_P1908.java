package Âå¹Èoj;

import java.util.Scanner;

public class ÄæÐò¶Ô_P1908 {

	private static int[] arr;
	private static long ans;
	private static int[] val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			arr = new int[n+1];
			val = new int[n+1];
			for (int i = 1; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			ans = 0;
			quick(1, n);
			System.out.println(ans);
	}
	private static void quick(int s, int e) {
		// TODO Auto-generated method stub
		if (s < e) {
			int k = (s+e)/2;
			quick(s, k);
			quick(k+1, e);
			int a = s;
			int b = k+1;
			int c = 0;
			while (a <= k && b <= e) {
				if (arr[a] <= arr[b]) {
					val[c++] = arr[a++];
				}else {
					ans += (k-a+1);
					val[c++] = arr[b++];
				}
			}
			while (a <= k) {
				val[c++] = arr[a++];
			}
			while (b <= e) {
				val[c++] = arr[b++];
			}
			for (int i = 0; i < e-s+1; i++) {
				arr[s+i] = val[i];
			}
		}
		
	}

}
