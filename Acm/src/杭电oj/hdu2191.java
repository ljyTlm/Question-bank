package º¼µçoj;
import java.util.ArrayList;
import java.util.Scanner;

public class hdu2191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int p = 0; p < t; p++) {
			int money = scanner.nextInt();
			int n = scanner.nextInt();
			ArrayList<Rice> list = new ArrayList<>(); 
			for (int i = 0; i < n; i++) {
				int m = scanner.nextInt();
				int g = scanner.nextInt();
				int x = scanner.nextInt();
				for (int j = 0; j < x; j++) {
					list.add(new Rice(m, g));
				}
			}
			int [] dp = new int [money+1];
			for (int i = 0; i < list.size(); i++) {
				for (int j = money; j >= list.get(i).m; j--) {
					dp[j] = Math.max(dp[j], dp[j-list.get(i).m]+list.get(i).g);
				}
//				for (int j = 0; j < dp.length; j++) {
//					System.out.print(dp[j] + " ");
//				}System.out.println();
			}
			System.out.println(dp[money]);
		}
	}

}
class Rice {
	int m;
	int g;
	public Rice(int m, int g) {
		this.m = m;
		this.g = g;
	}
}