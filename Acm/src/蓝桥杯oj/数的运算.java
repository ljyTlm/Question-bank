package À¶ÇÅ±­oj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ÊýµÄÔËËã {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		while (scanner.hasNext()) {
			Integer n = scanner.nextInt();
			Integer pingfang = n*n;
			Double pingfanggen = Math.pow(n, 0.5);
			Double daoshu = 1.0/n;
			System.out.println(pingfang+" "+df.format(pingfanggen)+" "+df.format(daoshu));
		}
	}

}
