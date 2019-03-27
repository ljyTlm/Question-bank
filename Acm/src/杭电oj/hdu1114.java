package 杭电oj;
import java.util.Arrays;
import java.util.Scanner;

public class hdu1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int p = 0; p < t; p++) {
			int w = -scanner.nextInt() + scanner.nextInt();
			int n = scanner.nextInt();
			Coin [] arr = new Coin[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Coin(scanner.nextInt(), scanner.nextInt());
			}
			int [] dp = new int [w+1];
			Arrays.fill(dp, Integer.MAX_VALUE);
			dp[0] = 0;
			for (int i = 0; i < n; i++) {
				for (int j = arr[i].w; j <= w; j++) {
					if (dp[j-arr[i].w] == Integer.MAX_VALUE) {
						continue;
					}
					dp[j] = Math.min(dp[j], dp[j-arr[i].w]+arr[i].m);
				}
			}
			if (dp[w] == Integer.MAX_VALUE) {
				System.out.println("This is impossible.");
			}else {
				System.out.println("The minimum amount of money in the piggy-bank is "+dp[w]+".");
			}
		}
	}

}
class Coin {
	int w ;//重量
	int m ;//价值
	public Coin(int m, int w) {
		this.m = m;
		this.w = w;
	}
}