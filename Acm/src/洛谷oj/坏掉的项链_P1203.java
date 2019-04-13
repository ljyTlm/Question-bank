package Âå¹Èoj;

import java.util.Scanner;

public class »µµôµÄÏîÁ´_P1203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		a += a;
		int s = 0;
		int e = a.length()-1;
		while (s < n && a.charAt(s) == 'w') {
			s ++;
		}
		while (e >= 0 && a.charAt(e) == 'w') {
			e --;
		}
		if (s > e) {
			System.out.println(n);
		}else {
			int last = 0;
			int max = 0;
			for (int i = s; i <= e;) {
				char f = a.charAt(i);
				int ans = 0;
				int k = 0;
				for (int j = i-1; j >= s && a.charAt(j) == 'w'; j--) {
					k ++;
				}
				for (int j = i; j <= e; j++) {
					if (a.charAt(j) == 'w' || a.charAt(j) == f) {
						ans ++;
					}else {
						i = j;
						break;
					}
					if (j == e) {
						i = e+1;
					}
				}
				max = Math.max(max, ans+last);
				last = ans+k;
				//System.out.println(last);
			}
			System.out.println(Math.min(n, max));
		}
	}

}
