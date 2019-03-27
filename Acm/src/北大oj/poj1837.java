package ±±´óoj;
import java.util.Scanner;

public class poj1837 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int [] c = new int [n];
			int [] g = new int [m+1];
			for (int i = 0; i < n; i++) {
				c[i] = scanner.nextInt();
			}
			for (int i = 1; i <= m; i++) {
				g[i] = scanner.nextInt();
			}
			int [][] dp = new int [m+1][15001];
			dp[0][7500] = 1;
			for (int i = 1; i <= m; i++) {
				for (int j = 0; j < 15001; j++) {
					for (int k = 0; k < n; k++) {
						int v = j-c[k]*g[i];
						if (v >= 0 && v < 15001) {
							 dp[i][j] += dp[i-1][v] ;
						}
					}
				}
			}
			System.out.println(dp[m][7500]);
 		}
	}

}
