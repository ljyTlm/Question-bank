package 洛谷oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 单源最短路径模板_P3371 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(sc.nextToken());
		int m = Integer.parseInt(sc.nextToken());
		int s = Integer.parseInt(sc.nextToken());
		ArrayList<Node> [] arr = new ArrayList[n+1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new ArrayList<Node>();
		}
		for (int i = 0; i < m; i++) {
			sc = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(sc.nextToken());
			int b = Integer.parseInt(sc.nextToken());
			int c = Integer.parseInt(sc.nextToken());
			arr[a].add(new Node(b, c));
		}
		int [] dp = new int[n+1];
		Arrays.fill(dp, 2147483647);
		dp[s] = 0;
		LinkedList<Node> qu = new LinkedList<Node>();
		qu.add(new Node(s, 0));
		while (!qu.isEmpty()) {
			Node node = qu.poll();
			for (int i = 0; i < arr[node.idx].size(); i++) {
				Node next = arr[node.idx].get(i);
				if (node.v + next.v < dp[next.idx]) {
					dp[next.idx] = node.v + next.v;
					qu.add(new Node(next.idx, dp[next.idx]));
				}
			}
		}
		PrintWriter pWriter = new PrintWriter(System.out);
		for (int i = 1; i < dp.length; i++) {
			if(i != 1)
				pWriter.print(" ");
			pWriter.print(dp[i]);
		}
		pWriter.println();
		pWriter.close();
		reader.close();
	}
	static class Node {
		public Node(int b, int c) {
			// TODO Auto-generated constructor stub
			idx = b;
			v = c;
		}

		int idx, v;
	}
}
