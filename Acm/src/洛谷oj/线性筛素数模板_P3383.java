package 洛谷oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 线性筛素数模板_P3383 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(sc.nextToken());
		int m = Integer.parseInt(sc.nextToken());
		int [] arr = new int[n+1];
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i+i; j < arr.length; j+=i) {
					arr[j] = 1;
				}
			}
		}
		PrintWriter pWriter = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			int v = Integer.parseInt(reader.readLine());
			pWriter.println((arr[v] == 0 ? "Yes":"No") );
		}
		pWriter.close();
		reader.close();
	}

}
