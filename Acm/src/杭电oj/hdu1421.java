package º¼µçoj;
import java.util.Arrays;
import java.util.Scanner;

public class hdu1421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int [] arr = new int [n+1];
			arr[0] = 0;
			for (int i = 1; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			int [][] dp = new int [n+1][k+1];
			for (int i = 2; i <= n; i++) {
				for (int j = 1; j <= k && j <= i/2; j++) {
					if (j > (i-1)/2) {
						dp[i-1][j] = Integer.MAX_VALUE;
					}
					dp[i][j] = Math.min(dp[i-1][j], dp[i-2][j-1]+(arr[i]-arr[i-1])*(arr[i]-arr[i-1]));
				}
			}
			System.out.println(dp[n][k]);
		}
	}

}
