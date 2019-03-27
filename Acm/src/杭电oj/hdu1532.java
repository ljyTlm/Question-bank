package º¼µçoj;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class hdu1532 {

	private static int[][] arr;
	private static int m;
	private static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new int [m+1][m+1];
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				arr[a][b] += c;
			}
			int sum = 0;
			int v;
			do {
				v = bfs(1,Integer.MAX_VALUE);
				sum += v;
			} while (v != 0);
			System.out.println(sum);
		}
	}

	private static int bfs(int i, int min) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer> ();
		list.add(i);
		int [] flag = new int [m+1];
		while (!list.isEmpty()) {
			int point = list.poll();
			for (int j = 1; j <= m; j++) {
				if (flag[j] == 0 && arr[point][j] > 0) {
					flag[j] = point;
					min = Math.min(min, arr[point][j]);
					list.add(j);
				}
			}
		}
		if (flag[m] != 0) {
			i = m;
			while(i != 1) {
				arr[flag[i]][i] -= min;
				arr[i][flag[i]] += min;
				i = flag[i];
			}
			return min;
		}
		return 0;
	}

}
