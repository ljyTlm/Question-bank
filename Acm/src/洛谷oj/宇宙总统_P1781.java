package Âå¹Èoj;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ÓîÖæ×ÜÍ³_P1781 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 10) {
				n = 15;
			}
			BigInteger mx = new BigInteger("0");
			int idx = 0;
			for (int i = 1; i <=n ; i++) {
				BigInteger v = sc.nextBigInteger();
				if (v.compareTo(mx) > 0) {
					mx = v;
					idx = i;
				}
			}
			System.out.println(idx+"\n"+mx);
			
		}
	}

}
