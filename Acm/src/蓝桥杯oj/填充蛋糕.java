package À¶ÇÅ±­oj;

import java.util.Scanner;

public class Ìî³äµ°¸â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			Double r = scanner.nextDouble();
			Double mianji = 3.1415926*r*r+2*3.1415926*r*2;
			System.out.printf("%.1f\n",mianji);
		}
	}

}
