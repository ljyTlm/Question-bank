package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ×Ö·û´®±È½Ï {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerc = new Scanner(System.in);
		while (scannerc.hasNext()) {
			String a = scannerc.next();
			String b = scannerc.next();
			int k = a.compareTo(b);
			if (k > 0) {
				System.out.println(1);
			}else if (k == 0) {
				System.out.println(0);
			}else {
				System.out.println(-1);
			}
			
		}
	}

}
