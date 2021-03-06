package ţ��oj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ������ {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int [] number = new int[100001];
		long [] prime = new long[100000];
		int idx = 0;
		for (int i = 2; i < number.length; i++) {
			if (number[i] == 0) {
				number[i] = idx;
				prime[idx++] = i;
				for (int j = i+i; j < number.length; j+=i) {
					number[j] = 1;
				}
			}else {
				number[i] = idx;
			}
		}
		StringTokenizer sc = new StringTokenizer(reader.readLine());
		long l = Long.parseLong(sc.nextToken());
		long r = Long.parseLong(sc.nextToken());
		Node [] arr = new Node[1000000];
		int end = 0;
		for (int i = 0; prime[i]*prime[i] <= r && i < idx; i++) {
			for (int j = Math.max(i, number[(int)(l/prime[i])]); j < idx && prime[i]*prime[j] <= r; j++) {
				arr[end++] = new Node(prime[i]*prime[j], prime[i], prime[j]);
			}
		}
		Arrays.sort(arr, 0, end);
		System.out.println(end);
		PrintWriter pWriter = new PrintWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < end; i++) {
			pWriter.println(arr[i].v+" "+arr[i].a+" "+arr[i].b);
		}
		reader.close();
		pWriter.close();
	}
	static class Node implements Comparable<Node>{
		public Node(long val, long i, long j) {
			// TODO Auto-generated constructor stub
			v = val;
			a = i;
			b = j;
		}
		Long v;
		long a;
		long b;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return v.compareTo(o.v);
		}
	}
}
