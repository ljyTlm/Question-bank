package À¶ÇÅ±­oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Î£ÏÕÏµÊý {

	private static int n;
	private static int m;
	private static ArrayList<Integer>[] graph;
	private static int s;
	private static int e;
	private static int[] k;
	private static int[] f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList[n+1];
		for (int i = 1; i < graph.length; i++) 
			graph[i] = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		s = sc.nextInt();
		e = sc.nextInt();
		k = new int [n+1];
		f = new int [n+1];
		f[s] = 1;
		dfs(s);
		if (k[e] == 0) {
			System.out.println(-1);
		}else {
			int sum = 0;
			for (int i = 1; i < k.length; i++) {
				if (k[e] == k[i]) {
					sum ++;
				}
			}
			System.out.println(sum-2);
		}
	}

	private static void dfs(int idx) {
		// TODO Auto-generated method stub
		if (idx == e) {
			for (int i = 0; i < f.length; i++) {
				k[i] += f[i];
			}
			return;
		}
		for (int i = 0; i < graph[idx].size(); i++) {
			int next = graph[idx].get(i);
			if (f[next] == 0) {
				f[next] = 1;
				dfs(next);
				f[next] = 0;
			}
		}
	}

}
