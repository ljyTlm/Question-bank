package Âå¹Èoj;

import java.util.Scanner;

public class ³ÔÄÌÀÒ_P1433 {

	private static Node[] arr;
	private static int[] flag;
	private static double sum;
	private static double[][] dis;
	private static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			arr = new Node[n+1];
			flag = new int[n+1];
			arr[0] = new Node(0.0, 0.0);
			for (int i = 1; i < arr.length; i++) {
				arr[i] = new Node(sc.nextDouble(), sc.nextDouble());
			}
			dis = new double[n+1][n+1];
			for (int i = 0; i < dis.length; i++) {
				for (int j = i+1; j < dis.length; j++) {
					double x = arr[i].x - arr[j].x;
					double y = arr[i].y - arr[j].y;
					dis[i][j] =dis[j][i] = Math.sqrt(x*x+y*y);
				}
			}
			sum = 999999999.0;
			flag[0] = 1;
			dfs(0, 0.0, 0);
			System.out.printf("%.2f\n", sum);
		}
	}

	private static void dfs(int idx, double ans, int num) {
		// TODO Auto-generated method stub
		if (ans > sum) {
			return;
		}
		if (num == n) {
			sum = ans;
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			if (i != idx && flag[i] == 0) {
				flag[i] = 1;
				dfs(i, ans + dis[idx][i], num + 1);
				flag[i] = 0;
			}
		}
	}

	static class Node{
		
		public Node(double x, double y) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
		}

		Double x, y;
	}
}	
