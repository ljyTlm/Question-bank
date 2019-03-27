package 蓝桥杯oj;

import java.util.Scanner;

public class 矩阵乘法 {

	private static int[] arr;
	private static int[][] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			arr = new int [n+2];
			for (int i = 1; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			dp = new int [n+2][n+2];
			for (int i = 0; i < n+2; i++) {
				for (int j = 0; j < n+2; j++) {
					dp[i][j] = -1;
				}
			}
			int sum = d(1,n+1);
			System.out.println(sum);
			for (int i = 1; i < dp.length; i++) {
				for (int j = 1; j <dp.length; j++) {
					System.out.print(dp[i][j]+"  ");
				}
				System.out.println();
			}
		}
	}

	private static int d(int i, int j) {
		// TODO Auto-generated method stub
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		if (i == j ) {
			dp[i][j] = 0;
			return 0;
		}
		dp[i][j] = d(i, i) + d(i+1, j) + arr[i] * arr[i+1] * arr[j];
		int index = 0;
		for (int k = i+1; k < j-1; k++) {
			int Dsum = d(i, k) + d(k, j) + arr[i] * arr[k] * arr[j];
			if (Dsum < dp[i][j]) {
				dp[i][j] = Dsum;
				index = k;
			}
		}
		System.out.println("起始位置："+i + "  终止位置：" + j + " 断点处：" + index + "  最小值：" + dp[i][j]);
		return dp[i][j];
	}

}
