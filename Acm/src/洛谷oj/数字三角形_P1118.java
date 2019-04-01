package Âå¹Èoj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Êý×ÖÈý½ÇÐÎ_P1118 {

	private static int[] arr;
	private static int m;
	private static int n;
	private static int[][] vla;
	private static boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		vla = new int [13][13];
		vla[0][0] = 1;
		for (int i = 1; i < vla.length; i++) {
			vla[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				vla[i][j] = vla[i-1][j-1] + vla[i-1][j];
			}
		}
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i+1;
			}
			flag = false;
			quick(0);
		}
	}

	private static void quick(int s) {
		// TODO Auto-generated method stub
		if (flag) {
			return;
		}
		if (s >= arr.length) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i]*vla[n-1][i];
			}
			if (sum == m) {
				for (int i = 0; i < arr.length; i++) {
					if (i == 0) {
						System.out.print(arr[i]);
					}else {
						System.out.print(" "+arr[i]);
					}
				}
				flag = true;
			}
			return;
		}
		for (int i = s; i < arr.length; i++) {
			int flag = arr[i];
			for (int j = i; j > s; j--) {
				arr[j] = arr[j-1];
			}
			arr[s] = flag;
			quick(s+1);
			for (int j = s; j < i; j++) {
				arr[j] = arr[j+1];
			}
			arr[i] = flag;
		}
	}

}
