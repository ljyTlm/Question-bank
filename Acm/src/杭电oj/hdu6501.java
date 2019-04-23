package 杭电oj;

import java.math.BigInteger;
import java.util.Scanner;

public class hdu6501 {
	
	static int mod = 1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long [] arr = new long[60];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextLong();
			}
			long n = sc.nextLong(); 
			long flag = 0;
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				if (flag == 0) {
					String val = new BigInteger(str,10).toString(2); //转成二进制
					int k = 0;
					for (int j = val.length()-1; j >= 0; j--) {
						if (val.charAt(j) == '1') {
							long num = 1;
							for (int j2 = k; j2 >= 0; j2--) {
								if (num <= arr[j2]) {
									arr[j2] -= num;
									num = 0;
									break;
								}else {
									num -= arr[j2];
									arr[j2] = 0;
									num *= 2;
								}
							}
							if (num != 0) {
								flag = -1;
								break;
							}
						}
						k ++;
					}
				}
			}
			if (flag == -1) {
				System.out.println(-1);
				continue;
			}
			long ans = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					ans += (arr[i]%mod * pow(2, i))%mod;
					ans %= mod;
				}
			}
			System.out.println(ans);
		}
	}
	private static long pow(long a, long b) {
		// TODO Auto-generated method stub
		long ans = 1;
		while (b > 0) {
			if (b%2 == 1) {
				ans = (ans*a)%mod;
			}
			a = (a * a)%mod;
			b /= 2;
		}
		return ans % mod;
	}

}
