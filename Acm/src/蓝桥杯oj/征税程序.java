package À¶ÇÅ±­oj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Õ÷Ë°³ÌÐò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		while (scanner.hasNext()) {
			Double a = scanner.nextDouble();
			Double b = scanner.nextDouble();
			System.out.println(df.format(a*b));
		}
	}

}
