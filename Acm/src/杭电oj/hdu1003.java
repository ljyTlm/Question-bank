package º¼µçoj;
import java.util.Scanner;

public class hdu1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = scanner.nextInt();
			int [][] dp = new int [n][];
			for (int j = 0; j < n; j++) {
				dp[j] = new int [j+1];
				dp[j][j] = scanner.nextInt();
			}
			int x = 0;
			int y = 0;
			int max = Integer.MIN_VALUE;
			for (int j = n-1; j >=0; j--) {
				for (int j2 = j-1; j2 >= 0; j2--) {
					dp[j][j2] =  dp[j2][j2] + dp[j][j2+1];
					if (max < dp[j][j2]) {
						max = dp[j][j2];
						x = j2+1;
						y = j+1;
					}
				}
			}
			System.out.println("Case "+i+":\n"+max+" "+x+" "+y);
			if (i != t) {
				System.out.println();
			}
		}
	}

}
