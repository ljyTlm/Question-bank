package Âå¹Èoj;

import java.util.Scanner;

public class ºÏ³ª¶ÓÐÎ_P1091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt()-130;
		}
		int [] dp_1 = new int[n+1];
		int [] dp_2 = new int[n+1];
		for (int i = 1; i < dp_2.length; i++) {
			dp_1[i] = dp_2[i] = 1;
		}
		for (int i = 1; i < dp_2.length; i++) {
			for (int j = i-1; j > 0; j--) {
				if (arr[i] > arr[j]) {
					dp_1[i] = Math.max(dp_1[i], dp_1[j]+1);
				}
			}
		}
		for (int i = n; i > 0; i --) {
			for (int j = i+1; j < dp_2.length; j++) {
				if (arr[i] > arr[j]) {
					dp_2[i] = Math.max(dp_2[i], dp_2[j]+1);
				}
			}
		}
		int max = 0;
		for (int i = 1; i < dp_2.length; i++) {
			max = Math.max(max, dp_1[i]+dp_2[i]);
		}
		System.out.println(n-max+1);
	}

}
