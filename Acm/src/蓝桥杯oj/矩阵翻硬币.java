package À¶ÇÅ±­oj;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ¾ØÕó·­Ó²±Ò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigDecimal n = sc.nextBigDecimal();
		BigDecimal m = sc.nextBigDecimal();
		System.out.println(sqrt(n).multiply(sqrt(m)));
	}

	private static BigInteger sqrt(BigDecimal v) {
		// TODO Auto-generated method stub
		BigDecimal z = new BigDecimal("0");
		BigDecimal o = new BigDecimal("-1");
		BigDecimal t = new BigDecimal("2");
		BigDecimal x = v;
		BigDecimal y = v.multiply(v).subtract(v);
		BigDecimal j = new BigDecimal("0.0000000000000001");
		BigDecimal k, b, l;
		do {
			l = x;
			k = t.multiply(x);
			b = y.subtract(k.multiply(x));
			x = o.multiply(b.divide(k, 50, BigDecimal.ROUND_HALF_DOWN));
			y = x.multiply(x).subtract(v);
			//System.out.println(x);
		} while (l.subtract(x).compareTo(o.abs()) >= 0);
		String [] sum = x.toString().split("\\.");
		return new BigInteger(sum[0]);
	}

}
