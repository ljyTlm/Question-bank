package 蓝桥杯oj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 一元一次方程 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		while (scanner.hasNext()) {
			double n = scanner.nextDouble();
			double m = scanner.nextDouble();
			System.out.println(df.format(-m/n));
		}
	}

}
