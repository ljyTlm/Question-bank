package Âå¹Èoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ÃÝ´Î·½_P1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			dfs(n);
			System.out.println();
		}
	}

	private static void dfs(int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		while (n > 0) {
			int ans = 0;
			int k = n;
			int t = 1;
			while (k > 1) {
				ans ++;
				k >>= 1;
				t *= 2;
			}
			n -= t;
			list.add(ans);
		}
		for (int i = 0; i < list.size(); i++) {
			int v = list.get(i);
			if (v == 0) {
				System.out.print("2(0)");
			}else if (v == 1) {
				System.out.print("2");
			}else if (v == 2) {
				System.out.print("2(2)");
			}else {
				System.out.print("2(");
				dfs(v);
				System.out.print(")");
			}
			if (i != list.size()-1) {
				System.out.print("+");
			}
		}
	}

}
