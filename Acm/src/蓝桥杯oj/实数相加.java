package ���ű�oj;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ʵ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			BigDecimal aDecimal = new BigDecimal(a);
			BigDecimal bDecimal = new BigDecimal(b);
			BigDecimal sDecimal = aDecimal.add(bDecimal);
			System.out.println(sDecimal);
		}
	}

}
