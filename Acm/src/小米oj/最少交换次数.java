package 小米oj;

import java.util.Arrays;
import java.util.Scanner;

public class 最少交换次数 {

	private static int[] arr;
	private static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String [] str = sc.next().split(",");
			arr = new int[str.length+1];
			for (int i = 1; i < arr.length; i++) {
				arr[i] = Integer.parseInt(str[i-1]);
			}
			ans = 0;
			int [] sum = sort(1, arr.length-1);
			//System.out.println(Arrays.toString(sum));
			System.out.println(ans);
		}
	}

	private static int [] sort(int s, int e) {
		// TODO Auto-generated method stub
		int [] val = new int [e-s+1];
		if (s == e) {
			val[0] = arr[s];
			return val;
		}
		int k = (s+e)/2;
		int [] left = sort(s, k);
		int [] right = sort(k+1, e);
		int idx_l = 0;
		int idx_r = 0;
		int idx_v = 0;
		while (idx_l < left.length && idx_r < right.length) {
			if (left[idx_l] <= right[idx_r]) {
				val[idx_v++] = left[idx_l++];
			}else {
				ans += left.length-idx_l;
				val[idx_v++] = right[idx_r++];
			}
		}
		while (idx_l < left.length) {
			val[idx_v++] = left[idx_l++];
		}
		while (idx_r < right.length) {
			val[idx_v++] = right[idx_r++];
		}
		return val;
	}
}
