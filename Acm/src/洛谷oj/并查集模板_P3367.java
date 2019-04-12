package 洛谷oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 并查集模板_P3367 {

	private static int[] father;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(sc.nextToken());
		int m = Integer.parseInt(sc.nextToken());
		father = new int[n+1];
		for (int i = 0; i < father.length; i++) {
			father[i] = i;
		}
		for (int i = 0; i < m; i++) {
			sc = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(sc.nextToken());
			int b = Integer.parseInt(sc.nextToken());
			int c = Integer.parseInt(sc.nextToken());
			int d = find(b);
			int e = find(c);
			if (a == 1) {
				if (d != e) {
					father[d] = e;
				}
			}else {
				System.out.println((d == e ? "Y":"N"));
			}
		}
	}

	private static int find(int c) {
		// TODO Auto-generated method stub
		if (c == father[c]) {
			return c;
		}
		father[c] = find(father[c]);
		return father[c];
	}

}
