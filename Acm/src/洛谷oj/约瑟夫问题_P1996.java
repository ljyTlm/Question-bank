package Âå¹Èoj;

import java.util.Scanner;

public class Ô¼Éª·òÎÊÌâ_P1996 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] f = new int[n+1];
		for (int i = 1; i < n; i++) {
			f[i] = i+1;
		}
		if (m == 1) {
			for (int i = 1; i <= n; i++) {
				if (i == 1) {
					System.out.print(i);
				}else {
					System.out.print(" "+i);
				}
			}
			return;
		}
		f[n] = 1;
		int k = n;
		int idx = 1;
		while (k > 0) {
			int v = 0;
			while (v < m-2) {
				idx = f[idx];
				v ++;
			}
			if (k == 1) {
				System.out.print(f[idx]);
			}else {
				System.out.print(f[idx]+" ");
			}
			k --;
			f[idx] = f[f[idx]];
			idx = f[idx];
		}
		System.out.println();
	}

}
