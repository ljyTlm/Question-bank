package ¿∂«≈±≠oj;

import java.math.BigInteger;
import java.util.Scanner;

public class ∆Ω∑Ωº∆À„ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			BigInteger a = new BigInteger(scanner.next());
			BigInteger b = new BigInteger(scanner.next());
			a = a.multiply(a).mod(b);
			System.out.println(a);
		}
	}

}
