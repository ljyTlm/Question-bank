package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ×î³¤µ¥´Ê {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.nextLine();
			String [] v = a.split(" ");
			String sum = "";
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < v.length; i++) {
				if (v[i].length() > max) {
					max = v[i].length();
					sum = v[i];
				}
			}
			System.out.println(sum);
		}
	}

}
