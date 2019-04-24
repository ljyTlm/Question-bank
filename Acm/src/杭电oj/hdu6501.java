package º¼µçoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class hdu6501 {
	
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long one = 1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			long [] a = new long[60];
			long [] c = new long[60];
			StringTokenizer sc = new StringTokenizer(reader.readLine());
			for (int i = 0; i < a.length; i++) {
				a[i] = Long.parseLong(sc.nextToken());
				c[i] = one<<i;
			}
			sc = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(sc.nextToken());
			long [] b = new long[n];
			sc = new StringTokenizer(reader.readLine());
			for (int i = 0; i < b.length; i++) {
				b[i] = Long.parseLong(sc.nextToken());
			}
			Arrays.sort(b);
			boolean flag = true;
			for (int i = n-1; i >= 0 && flag; i--) {
				for (int j = 59; j >= 0; j--) {
					if (a[j] != 0 && b[i] > c[j]) {
						long num = b[i] / c[j];
						if (num <= a[j]) {
							a[j] -= num;
							for (int k = 0; k < num; k++) {
								b[i] -= c[j];
							}
						}else {
							for (int k = 0; k < a[j]; k++) {
								b[i] -= c[j];
							}
							a[j] = 0;
						}
					}
				}
				if (b[i] != 0) {
					flag = false;
				}
			}
			if (!flag) {
				System.out.println(-1);
				continue;
			}
			long ans = 0;
			for (int i = 0; i < 60; i++) {
				ans += ( (a[i] % mod) * (c[i]%mod) ) % mod;
				ans %= mod;
			}
			System.out.println(ans);
		}
		
	}

}
