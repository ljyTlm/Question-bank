package À¶ÇÅ±­oj;

import java.util.Scanner;

public class c_ch03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [][] arr = new int [n+2][n+2];
			arr[1][1] = 1;
			System.out.println(1);
			for (int i = 2; i <= n+1; i++) {
				String sum = "";
				for (int j = 1; j <= i; j++) {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					sum += arr[i][j] +" ";
				}
				System.out.println(sum.substring(0,sum.length()-1));
			}
		}
	}

}
