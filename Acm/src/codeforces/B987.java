package codeforces;
import java.util.Scanner;

public class B987 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			//题解： 问x的y次幂 和y的x次幂比较大小
			//      先计算x的y次幂 在开x次方 然后跟y比较
			//      根据计算公式 x的y/x == x^y 在开x方
			//      因为y/x根本不大 所以计算次数很小
			Double x = sc.nextDouble();
			Double y = sc.nextDouble();
			Double v = Math.pow(x, y/x);
			if (v - y == 0)System.out.println("=");
			if (v > y) System.out.println(">");
			if (v < y) System.out.println("<");
		}
	}

}
