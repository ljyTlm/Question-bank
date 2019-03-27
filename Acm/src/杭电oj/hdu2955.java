package º¼µçoj;
import java.util.Arrays;
import java.util.Scanner;

public class hdu2955 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			double p = scanner.nextDouble();
			int n = scanner.nextInt();
			int max = 0;
			Bank [] arr = new Bank [n+1];
			for (int j = 1; j <= n; j++) {
				int money = scanner.nextInt();
				double die = scanner.nextDouble();
				arr[j] = new Bank(money, die);
				max += money;
			}
			double [] dp = new double [max+1];
			Arrays.fill(dp, 1.0);
			dp[0] = 0.0;
			for (int j = 1; j <= n; j++) {
				for (int j2 = max; j2 >= arr[j].money; j2--) {
					dp[j2] = Math.min(dp[j2], 1-((1-dp[j2-arr[j].money])*(1-arr[j].die)));
				}
			}
			for (int j = max; j >= 0; j--) {
				if (dp[j] <= p) {
					System.out.println(j);
					break;
				}
			}
		}
	}

}
class Bank {
	int money;
	double die;
	public Bank(int money, double die) {
		this.money = money;
		this.die = die;
	}
}