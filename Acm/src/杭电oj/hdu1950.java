package º¼µçoj;
import java.util.Arrays;
import java.util.Scanner;

public class hdu1950 {

	private static int[] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			dp = new int [n+1];
			Arrays.fill(dp, -1);
			for (int j = 1; j <= n; j++) {
				int v = scanner.nextInt();
				find(1, j, v);
			}
			
			System.out.println();
		}
	}

	private static void find(int i, int j, int v) {
		int k = (i + j) / 2;
		if (dp[k] > v) {
			find(i, j, v);
		}else if (dp[k] < k) {
			
		}
	}

}
