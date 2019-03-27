package ¿∂«≈±≠oj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ¿˚œ¢º∆À„ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			DecimalFormat df = new DecimalFormat("0.00");
			Double money = scanner.nextDouble();
			Double k = scanner.nextDouble()/100.0;
			money += (money*k*0.8);
			System.out.println(df.format(money));
		}
	}

}
