package À¶ÇÅ±­oj;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		while (scanner.hasNext()) {
			Double a = scanner.nextDouble();
			Double b = scanner.nextDouble();
			Double c = scanner.nextDouble();
			Double [] arr = new Double [2];
			arr[0] = (-b + Math.pow(b*b-4*a*c,0.5))/(2*a);
			arr[1] = (-b - Math.pow(b*b-4*a*c,0.5))/(2*a);
			Arrays.sort(arr);
			System.out.println(df.format(arr[1]) + " " + df.format(arr[0]));
		}
	}

}
