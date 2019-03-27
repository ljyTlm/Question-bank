package º¼µçoj;
import java.util.Scanner;

public class hdu1587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int [] dp = new int [m+1];
			for (int i = 0; i < n; i++) {
				int v = scanner.nextInt();
				for (int j = v; j <= m; j++) {
					dp[j] = Math.max(dp[j-v]+1, dp[j]);
				}
			}
			System.out.println(dp[m]);
		}
	}

}
