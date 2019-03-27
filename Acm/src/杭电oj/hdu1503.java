package º¼µçoj;
import java.util.Scanner;

public class hdu1503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String stra = scanner.next();
			String strb = scanner.next();
			char[] a = stra.toCharArray();
			char[] b = strb.toCharArray();
			int [][] dp = new int [a.length+1][b.length+1];
			String [][] str = new String [a.length+1][b.length+1];
			for (int i = 1; i <= a.length; i++) {
				for (int j = 1; j <= b.length; j++) {
					if (a[i-1] == b[j-1]) {
						dp[i][j] = dp[i-1][j-1] + 1;
						str[i][j] = str[i-1][j-1]+a[i-1];
					}
					if (dp[i-1][j] > dp[i][j]) {
						dp[i][j] = dp[i-1][j];
						str[i][j] = str[i-1][j];
					}
					if (dp[i-1][j-1] > dp[i][j]) {
						dp[i][j] = dp[i-1][j-1];
						str[i][j] = str[i-1][j-1];
					}
					if (dp[i][j-1] > dp[i][j]) {
						dp[i][j] = dp[i][j-1];
						str[i][j] = str[i][j-1];
					}
				}
			}
			char [] c = dp[a.length][b.length] == 0 ?new char [0]:str[a.length][b.length].substring(4).toCharArray();
			int aIndex = 0;
			int bIndex = 0;
			int cIndex = 0;
			String sum = "";
			while (cIndex < c.length) {
				if (a[aIndex] == c[cIndex] && b[bIndex] == c[cIndex]) {
					sum += a[aIndex];
					aIndex++;
					bIndex++;
					cIndex++;
				}else if (a[aIndex] == c[cIndex] && b[bIndex] != c[cIndex]) {
					sum += b[bIndex];
					bIndex ++;
				}else if (a[aIndex] != c[cIndex] && b[bIndex] == c[cIndex]) {
					sum += a[aIndex];
					aIndex++;
				}else {
					sum += a[aIndex];
				    sum += b[bIndex];
					aIndex++;
					bIndex++;
				}
			}
			sum += aIndex < a.length ? stra.substring(aIndex) : "";
			sum += bIndex < b.length ? strb.substring(bIndex) : "";
			System.out.println(sum);
		}
	}

}