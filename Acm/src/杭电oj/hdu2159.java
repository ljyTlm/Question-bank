package º¼µçoj;
import java.util.Scanner;

public class hdu2159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int k = scanner.nextInt();
			int s = scanner.nextInt();
			Monster [] arr = new Monster [k];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new Monster(scanner.nextInt(), scanner.nextInt());
			}
			int [][] dp = new int [s+1][m+1];
			int [][] du = new int [s+1][m+1];
			for (int i = 0; i < k; i++) {
				for (int j = 1; j <= s; j++) {
					for (int j2 = m; j2 >= arr[i].rennaidu; j2--) {
						int v = dp[j-1][j2-arr[i].rennaidu]+arr[i].jingyan;
						if (v > dp[j][j2]) {
							dp[j][j2] = v;
							du[j][j2] = du[j-1][j2-arr[i].rennaidu]+arr[i].rennaidu;
						}
					}
				}
			}
			int sum = -1;
			for (int i = 0; i <= m; i++) {
				if (dp[s][i] >= n) {
					sum = m-du[s][i];
					break;
				}
			}
			System.out.println(sum);
		}
	}

}
class Monster{
	int jingyan;
	int rennaidu;
	public Monster(int jingyan, int rennaidu) {
		this.jingyan = jingyan;
		this.rennaidu = rennaidu;
	}
}