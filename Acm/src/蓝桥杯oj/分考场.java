package À¶ÇÅ±­oj;

import java.util.Arrays;
import java.util.Scanner;

public class ·Ö¿¼³¡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int [] arr = new int [n+1];
			int m = sc.nextInt();
			Arrays.fill(arr, 1);
			int k = 1;
			boolean [][] flag = new boolean [n+1][n+1];
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				flag[a][b] = true;
				flag[b][a] = true;
			}
			int p = 0;
			while (k != p) {
				p = k;
				for (int i = 1; i <= n; i++) {
					if (arr[i] == p) {
						for (int j = 1; j <= n; j++) {
							if (flag[i][j] && arr[j] == p) {
								if (p == k) {
									k ++;
								}
								arr[j] = k;
							}
						}
					}
				}
			}
			System.out.println(k);
		}
	}

}