package 洛谷oj;

import java.math.BigInteger;
import java.util.Scanner;

import 洛谷oj.麦森数_P1045.BigInt;

public class 高精度剪发_P2142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			System.out.println(a.subtract(b));
		}
	}

}
