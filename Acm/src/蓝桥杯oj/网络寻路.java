package 蓝桥杯oj;


import java.util.ArrayList;
import java.util.Scanner;

public class 网络寻路 {
	static ArrayList<Integer> [] grp;
	private static int sum;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        grp = new ArrayList[n+1];
        for (int i = 0; i < grp.length; i++) {
			grp[i] = new ArrayList<Integer>();
		}
        for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			grp[a].add(b);
			grp[b].add(a);
		}
        sum = 0;
        for (int i = 1; i <= n; i++) {
			dfs(i, 0, 0);
		}
        System.out.println(sum);
	}
	private static void dfs(int idx, int last, int num) {
		// TODO Auto-generated method stub
		if (num >= 3) {
			sum ++;
			return;
		}
		for (int i = 0; i < grp[idx].size(); i++) {
			int next = grp[idx].get(i);
			if (next != last) {
				dfs(next, idx, num+1);
			}
		}
	}
	

}
