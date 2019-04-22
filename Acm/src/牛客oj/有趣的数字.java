package 牛客oj;

import java.util.Scanner;

public class 有趣的数字 {
	static public long mod = 10007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println(C(4, 3));
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long e = sc.nextLong();
		long f = sc.nextLong();
		long g = sc.nextLong();
		long v1 = pow(a, e);
		long v2 = pow(b, f);
		long v3 = pow(c, g);
		long v4 = C1(k, e)%mod * C1(k-e, f)%mod;
		long sum = v1*v2%mod*v3%mod*v4%mod;
		System.out.println(sum);
	}
	private static long C(long k, long e) {
		// TODO Auto-generated method stub
		if (e == 1) {
			return k;
		}
		if (k == e || e == 0) {
			return 1;
		}
		if (k-e < e) {
			return C(k, k-e);
		}
		return C(k-1, e)%mod + C(k-1, e-1)%mod;
	}
	private static long pow(long a, long n) {
		// TODO Auto-generated method stub
		long v = 1;
		long k = a;
		while (n > 0) {
			if(n%2 != 0) {
				v = (v*k)%mod;
			}
			k = (k*k)%mod;
			n /= 2;
		}
		return v%mod;
	}
	static long C1(long a,long b){//取模排列组合
	    long i,ret=1;
	    for(i=2;i<=a;i++){
	        ret=(ret*i)%mod;
	    }
	    for(i=2;i<=b;i++){
	        ret=(ret*pow(i,mod-2))%mod;
	    }
	    for(i=2;i<=a-b;i++){
	        ret=(ret*pow(i,mod-2))%mod;
	    }
	    return ret;
	}
}
