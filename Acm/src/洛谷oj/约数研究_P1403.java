package 洛谷oj;

import java.util.Scanner;

public class 约数研究_P1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += n/i;
		}
		System.out.println(ans);
	}

}
