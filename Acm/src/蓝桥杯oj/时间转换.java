package À¶ÇÅ±­oj;

import java.util.Scanner;

public class Ê±¼ä×ª»» {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int day = n/1440;
			n -= (n/1440)*1440;
			int shi = n/60;
			n -= (n/60)*60;
			System.out.println(day+" "+shi+" "+n);
		}
	}

}
