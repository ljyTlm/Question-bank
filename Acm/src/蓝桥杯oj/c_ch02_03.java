package À¶ÇÅ±­oj;

import java.util.Scanner;

public class c_ch02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [][] arr = new int [][] {{0,-1,1},{1,0,-1},{-1,1,0}};
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.println(arr[n][m]);
		}
	}

}
