package 蓝桥杯oj;

import java.util.Arrays;
import java.util.Scanner;

public class 最长公共子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			int [][] dp = new int [a.length()+1][b.length()+1];
			for (int i = 1; i <= a.length(); i++) {
				for (int j = 1; j <= b.length(); j++) {
					if (a.charAt(i-1) == b.charAt(j-1)) {
						dp[i][j] = dp[i-1][j-1] + 1;
					}else {
						int [] sort = {dp[i-1][j],dp[i][j-1],dp[i-1][j-1]};
						Arrays.sort(sort);
						dp[i][j] = sort[2];
					}
				}
			}
			System.out.println(dp[a.length()][b.length()]);
		}
	}

}
