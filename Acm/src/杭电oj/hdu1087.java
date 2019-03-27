package º¼µçoj;
import java.util.Scanner;

public class hdu1087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			if (n == 0) {
				return;
			}
			int [] arr = new int [n];
			int [] dp = new int [n];
			int sum = 0;
			for (int i = 0; i < dp.length; i++) {
				arr[i] = scanner.nextInt();
				dp[i] = arr[i];
				for (int j = i-1; j >= 0; j--) {
					if (arr[i] > arr[j]) {
						dp[i] = Math.max(dp[i], dp[j] + arr[i]);
					}
				}
				sum = Math.max(dp[i], sum);
			}
			System.out.println(sum);
		}
	}

}
