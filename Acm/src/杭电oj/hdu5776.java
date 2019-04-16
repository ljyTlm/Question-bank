package º¼µçoj;

import java.util.Scanner;

public class hdu5776 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ans = 0;
			String sum = "NO";
			int [] flag = new int[m];
			for (int i = 0; i < n; i++) {
				ans += sc.nextInt();
				if(flag[ans%m] == 1)
					sum = "YES";
				flag[ans%m] = 1;
			}
			if (flag[0] == 1) {
				sum = "YES";
			}
			System.out.println(sum);
		}
	}

}
