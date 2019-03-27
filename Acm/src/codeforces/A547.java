package codeforces;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class A547 {

	private static long sum;
	private static long n;
	private static long m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextLong();
			m = sc.nextLong();
			if (n == m) {
				System.out.println(0);
				continue;
			}
			sum = -1;
			dfs(n, 0);
			System.out.println(sum);
		}
	}

	private static void dfs(long n2, int i) {
		// TODO Auto-generated method stub
		if (sum == -1 && n2 <= m) {
			if (n2 == m) {
				sum = i;
				return;
			}
			dfs(n2*3, i+1);
			dfs(n2*2, i+1);
		}
	}
	

}
