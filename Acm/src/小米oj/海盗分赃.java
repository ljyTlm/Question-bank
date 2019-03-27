package 小米oj;

import java.util.Scanner;


public class 海盗分赃 {

	private static int[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String [] str = scanner.next().split(",");
			arr = new int [str.length];
			int ans = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
				ans += arr[i];
			}
			if (ans % 2 != 0) {
				System.out.println("false");
			}else {
				ans /= 2;
				System.out.println(dfs(0, 0,ans));
			}
		}
	}

	private static boolean dfs(int idx, int sum, int ans) {
		// TODO Auto-generated method stub
		if (sum == ans) {
			return true;
		}
		if (sum > ans || idx >= arr.length) {
			return false;
		}
		return dfs(idx+1, sum+arr[idx], ans) || dfs(idx+1, sum, ans);
	}

}
