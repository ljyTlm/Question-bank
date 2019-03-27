package 蓝桥杯oj;

import java.util.Scanner;

public class 求最大公约数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n > m) {
				int k = n;
				n = m;
				m = k;
			}
			while (n%m != 0) {
				int r = n%m;
				n = m;
				m = r;
			}
			System.out.println(m);
		}
	}

}
