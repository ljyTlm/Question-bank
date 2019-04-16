package º¼µçoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class hdu6486 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while (t -- > 0) {
				int n = sc.nextInt();
				int [] arr = new int[n];
				int max = 1;
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
					max = Math.max(max, arr[i]);
				}
				int ans = 0;
				for (int i = 0; i < arr.length; i++) {
					ans += max-arr[i];
				}
				if (ans < max) {
					System.out.println(ans);
				}else {
					System.out.println(-1);
				}
			}
	}

}
