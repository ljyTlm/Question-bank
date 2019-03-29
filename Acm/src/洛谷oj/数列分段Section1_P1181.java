package Âå¹Èoj;

import java.util.Scanner;

public class ÊýÁÐ·Ö¶ÎSection1_P1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ans = 0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int v = sc.nextInt();
				if (ans + v > m) {
					ans = v;
					sum ++;
				}else {
					ans += v;
				}
			}
			System.out.println(sum + 1);
		}
	}

}
