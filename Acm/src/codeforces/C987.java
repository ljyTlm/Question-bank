package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class C987 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int [] p = new int [n];
			int [] s = new int [n];
			int [] m = new int [n];
			Arrays.fill(m, Integer.MAX_VALUE);
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				for (int j = i-1; j >= 0; j--) {
					if (s[i] > s[j]) {
						m[i] = Math.min(m[i], p[i]+p[j]);
						if (m[j] != Integer.MAX_VALUE) {
							min = Math.min(min, m[j]+p[i]);
						}
					}
				}
			}
			System.out.println(min == Integer.MAX_VALUE ? -1:min);
		}
	}

}
