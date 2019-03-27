package À¶ÇÅ±­oj;

import java.math.BigInteger;
import java.util.Scanner;

public class Êý×ÖÓÎÏ· {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger n = sc.nextBigInteger();
		BigInteger k = sc.nextBigInteger();
		long t = sc.nextLong();
		BigInteger sum = new BigInteger("1");
		BigInteger end = new BigInteger("0");
		while (--t>0) {
			end = end.add(n);
			sum = sum.add(one.add(end.multiply(end.add(one)).divide(two).mod(k)));
		}
		System.out.println(sum.toString());
	}

}
