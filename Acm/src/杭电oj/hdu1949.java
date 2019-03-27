package º¼µçoj;
import java.util.Scanner;

public class hdu1949 {

	private static int[][] dp;
	private static int[] pathBi;
	private static int[] pathAi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int l = sc.nextInt();
			int n = sc.nextInt();
			pathAi = new int [l+1];//ÈüµÀ
			pathBi = new int [l+1];
			for (int i = 1; i < pathBi.length; i++) {
				pathAi[i] = sc.nextInt();
			}
			for (int i = 1; i < pathBi.length; i++) {
				pathBi[i] = sc.nextInt();
			}
			dp = new int [n*l+1][16];
			fily(dp);
			dp[0][0] = 0;
			int way = 1;
			for (int i = 0; i < dp.length-1; i++) {
				for (int j = 0; j < 15; j++) {
					if (dp[i][j] != Integer.MAX_VALUE) {
						dp[i+1][j+1] = Math.min(dp[i+1][j+1], dp[i][j]+pathAi[way]);
						if (j >= 5) {
							dp[i+1][j-5] = Math.min(dp[i+1][j-5], dp[i][j]+pathBi[way]);
						}
					}
				}
				dp[i+1][10] = Math.max(dp[i+1][10], dp[i][14]+pathAi[way]);
				way = way == l ? 1 : way+1;
			}
			int sum = Integer.MAX_VALUE;
			for (int i = 0; i < 15; i++) {
				sum = Math.min(sum, dp[n*l][i]);
			}
			System.out.println(sum);
		}
	}

	private static void fily(int[][] dp) {
		// TODO Auto-generated method stub
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
	}

}
