package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ÖÖÊ÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (m > n/2) {
				System.out.println("Error!");
				continue;
			}
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			int [][] dp = new int [n][2];
			dp[0][1] = arr[0];
			
		}
	}

}
