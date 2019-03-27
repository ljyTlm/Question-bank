package 小米oj;

import java.util.Scanner;

public class 找出可能的合的组合 {

	public static void main(String[] args) {
		// TODO Auto-generated medthod stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String [] str = scanner.next().split(",");
			int n = scanner.nextInt();
			int [] arr = new int[str.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			int [] dp = new int[n+1];
			dp[0] = 1;
			for (int i = 0; i < dp.length-1; i++) {
				if (dp[i] != 0) {
					for (int j = 0; j < arr.length; j++) {
						if (i+arr[j] <= n) {
							dp[i+arr[j]] += dp[i];
						}
					}
				}
			}
			System.out.println(dp[n]);
		}
	}

}
