package Âå¹Èoj;

import java.util.Scanner;

public class ÂóÉ­Êý_P1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int p = sc.nextInt();
			int k = (int)Math.floor( p * Math.log10(2) );
			System.out.println(k+1);
			BigInt a = new BigInt("2");
			BigInt sum = new BigInt("1");
			while (p > 0) {
				if (p % 2 == 1) {
					sum = sum.mu(a);
				}
				a = a.mu(a);
				p >>= 1;
			}
			String ans = "";
			for (int i = 0; i < 9; i++) {
				for (int j = 0+i*50; j < 50+i*50; j++) {
					ans += sum.val[499-j];
				}
				ans += "\n";
			}
			for (int j = 450; j < 499; j++) {
				ans += sum.val[499-j];
			}
			System.out.println(ans+(sum.val[0]-1));
		}
	}
	static class BigInt {
		int [] val;
		int idx;
		public BigInt() {
			val = new int[1040];
			idx = 0;
		}
		public BigInt(String v) {
			this();
			for (int i = v.length()-1; i >= 0; i--) {
				val[idx++] = v.charAt(i)-'0';
			}
		}
		public BigInt mu(BigInt bInt) {
			return mu(bInt, this);
		}
		private BigInt mu(BigInt a, BigInt b) {
			BigInt ans = new BigInt();
			for (int i = 0; i < 502; i++) {
				for (int j = 0; j < 502; j++) {
					ans.val[j+i] += a.val[j] * b.val[i];
				}
			}
			for (int i = 0; i < 502; i++) {
				ans.val[i+1] += ans.val[i]/10;
				ans.val[i] = ans.val[i] % 10;
			}
			return ans;
		}
	}  
}
