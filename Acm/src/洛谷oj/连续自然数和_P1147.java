package ���oj;

import java.util.Scanner;

public class ������Ȼ����_P1147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long n = sc.nextLong();
			for (long i = 1; i < n; i++) {
				long v = n*2 - i + i*i;
				long j = (long)Math.sqrt(v);
				if (j*(j+1) == v) {
					System.out.println(i+" "+j);
				}
			}
		}
	}

}
