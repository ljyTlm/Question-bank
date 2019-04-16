package 杭电oj;

import java.util.Scanner;

public class hdu4133 {
	static long [] val = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
	private static long n;
	private static long max_num;
	private static long max_val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i ++) {
			n = sc.nextLong();
			max_val = max_num = 0;
			dfs(0, 1, 1); //质数数组角标   用了多少个当前角标下的质数   累乘的数值   当前点之前约数的个数
			System.out.println("Case #"+i+": "+max_val);
		}
	}
	private static void dfs(int idx, long v, long last) {
		// TODO Auto-generated method stub
		if (last > max_num) {
			max_num = last;
			max_val = v;
		}else if (last == max_num) {
			max_val = Math.min(max_val, v);
		}
		for (long i = 0; idx < val.length && i < 64 && v*val[idx] <= n ; i++) {
			if(i != 0)
				v *= val[idx];
			dfs(idx+1, v, last*(i+1));
		}
	}

}
