package 蓝桥杯oj;

import java.util.Scanner;

public class 多项式输出 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int index = n;
			String sum = "";
			for (int i = 0; i <= n; i++) {
				String a = scanner.next();
				if (i == 0) {
					if (a.equals("1")) {
						if (index == 0) {
							sum += "1";
						}else if (index == 1) {
							sum += "x";
						}else {
							sum += "x^"+index;
						}
						index --;
						continue;
					}else if (a.equals("-1")) {
						if (index == 0) {
							sum += "-1";
						}else if (index == 1) {
							sum += "-x"; 
						}else {
							sum += "-x^"+index;
						}
						index --;
						continue;
					}else {
						if (index == 0) {
							sum += a;
						}else if (index == 1) {
							sum += a+"x";
						}else {
							sum += a+"x^"+index;
						}
						index --;
						continue;
					}
				}else {
					if (a.equals("0") || a.equals("-0")) {
						index --;
						continue;
					}else if (a.equals("1")) {
						if (i == n) {
							a = "+1";
						}else {
							a = "+";
						}
					}else if (a.equals("-1")) {
						if (i == n) {
							a = "-1";
						}else {
							a = "-";
						}
					}else {
						if (a.charAt(0) != '-') {
							a = "+" + a;
						}
					}
					if (index == 0) {
						sum += a;
						continue;
					}else if (index == 1) {
						sum += a + "x";
					}else {
						sum += a + "x^"+index;
					}
					index --;
				}
			}
			System.out.println(sum);
		}
	}

}
