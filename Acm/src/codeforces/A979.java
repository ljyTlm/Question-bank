package codeforces;
import java.util.Scanner;

public class A979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long n = sc.nextLong()+1;
			if (n == 1) {
				System.out.println(0);
			}else if (n % 2 == 0) {
				System.out.println(n/2);
			}else {
				System.out.println(n);
			}
		}
	}

}
