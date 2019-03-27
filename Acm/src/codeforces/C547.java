package codeforces;

import java.util.Scanner;

public class C547 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] arr = new int [n];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = scanner.nextInt() + arr[i-1];
		}
		int sum = -1;
		for (int i = 1; i <= n; i++) {
			int [] flag = new int [n+1];
			flag[i] = 1;
			for (int j = 1; j < n; j++) {
				int v = i+arr[j];
				if (v <= 0 || v > n || flag[v] == 1) {
					flag[0] = -1;
					break;
				}
				flag[v] = 1;
			}
			if (flag[0] != -1) {
				System.out.print(i);
				for (int j = 1; j < n; j++) {
					System.out.print(" "+(i+arr[j]));
				}
				System.out.println();
				return;
			}
		}
		System.out.println(-1);
	}
}
