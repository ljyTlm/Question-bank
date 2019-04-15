package Âå¹Èoj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class µÍ¼Û¹ºÂò_P1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] arr = new long [n+1];
		arr[0] = Long.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		long [] ans = new long[n+1];
		long [] len = new long[n+1];
		ans[0] = 1;
		long max_len = 0;
		long max_sum = 0;
		for (int i = 1; i < len.length; i++) {
			for (int j = 0; j < i; j ++) {
				if (arr[i] < arr[j] && len[j]+1 > len[i]) {
					len[i] = len[j] + 1;
				}
			}
			for (int j = 0; j < i; j++) {
				if (len[i] == len[j]+1 && arr[i] < arr[j]) {
					ans[i] += ans[j];
				}
				if (arr[i] == arr[j] && len[i] == len[j]) {
					ans[i] = 0;
				}
			}
			if (len[i] > max_len) {
				max_len = len[i];
				max_sum = ans[i];
			}else if (len[i] == max_len) {
				max_sum += ans[i];
			}
		}
		System.out.println(max_len+" "+max_sum);
	}
	
}
