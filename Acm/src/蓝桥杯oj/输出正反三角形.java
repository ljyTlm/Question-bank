package 蓝桥杯oj;

import java.util.Scanner;

public class 输出正反三角形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int one = 1;
			int ge = n-1;
			int two = 2*n - 1;
			for (int i = 0; i < n; i++) {
				System.out.println(kongge(ge)+xinghao(one)+kongge(4)+xinghao(two));
				one+=2;
				ge--;
				two-=2;
			}
		}
	}

	private static String xinghao(int one) {
		// TODO Auto-generated method stub
		String v = "";
		for (int i = 0; i < one; i++) {
			v += "*";
		}
		return v;
	}

	private static String kongge(int ge) {
		// TODO Auto-generated method stub
		String v = "";
		for (int i = 0; i < ge; i++) {
			v += " ";
		}
		return v;
	}

}
