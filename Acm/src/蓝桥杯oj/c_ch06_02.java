package À¶ÇÅ±­oj;

import java.util.Scanner;

public class c_ch06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			int [] a = new int [m+1];
			int [] b = new int [n+1];
			for (int i = 1; i <= m; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				b[i] = scanner.nextInt();
			}
			int a1 = scanner.nextInt();
			int b1 = scanner.nextInt();
			int index = 1;
			String sum = "";
			int flag = a1 + b1 < m ? m+1 : a1 +b1+1;
			while (index != flag) {
				if (index > a1 && index <= a1+b1) {
					sum += b[index-a1]+", ";
				}else {
					sum += a[index]+", ";
				}
				index ++;
			}
			System.out.println(sum.substring(0,sum.length()-2));
		}
	}

}
