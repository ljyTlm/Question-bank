package º¼µçoj;

import java.util.Scanner;

public class hdu2444 {

	private static int[][] graph;
	private static int m;
	private static int n;
	private static int[] color;
	private static int[] meet;
	private static int[] flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			graph = new int [n+1][n+1];
			while (m -- > 0) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				graph[a][b] = 1;
				graph[b][a] = 1;
			}
			color = new int [n+1];
			color[1] = 1;
			if (drawColor(1)) {
				meet = new int [n+1];
				int sum = 0;
				for (int i = 1; i <= n; i++) {
					if (color[i] == 1) {
						flag = new int [n+1];
						sum += find(i);
					}
				}
				System.out.println(sum);
			}else {
				System.out.println("No");
			}
			
		}
	}

	private static int find(int i) {
		// TODO Auto-generated method stub
		for (int j = 1; j < color.length; j++) {
			if (graph[i][j] == 1 && flag[j] == 0) {
				flag[j] = 1;
				if (meet[j] == 0 || find(meet[j]) == 1) {
					meet[j] = i;
					return 1;
				}
			}
		}
		return 0;
	}

	private static boolean drawColor(int i) {
		// TODO Auto-generated method stub
		for (int j = 1; j < color.length; j++) {
			if (graph[i][j] == 1) {
				if (color[j] == 0) {
					color[j] = 3 - color[i];
					drawColor(j);
				}else if (color[i] == color[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
