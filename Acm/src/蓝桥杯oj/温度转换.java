package À¶ÇÅ±­oj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ÎÂ¶È×ª»» {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(df.format(n*1.8+32));
		}
	}

}
