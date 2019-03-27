package À¶ÇÅ±­oj;

import java.util.Iterator;
import java.util.Scanner;

public class kºÃÊý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		long [][] dp = new long [l+1][k];
		for (int i = 0; i < k; i++) {
			dp[1][i] = 1;
		}
		for (int i = 1; i < l; i++) {
			for (int j = 0; j < k; j++) {
				dp[i+1][j] += dp[i][j];
				dp[i+1][j] %= 1000000007;
				if (j+1 < k) {
					dp[i+1][j+1] += dp[i][j];
					dp[i+1][j+1] %= 1000000007;
				}
				if (j-1 >= 0) {
					dp[i+1][j-1] += dp[i][j];
					dp[i+1][j-1] %= 1000000007;
				}
			}
		}
		long sum = 0;
		for (int i = 1; i < k; i++) {
			sum += dp[l][i];
			sum %= 1000000007;
		}
		System.out.println(sum);
	}	

}
