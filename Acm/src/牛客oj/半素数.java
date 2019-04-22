package Å£¿Íoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class °ëËØÊý {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int [] number = new int[1000100];
		int [] prime = new int[100000];
		int idx = 0;
		for (int i = 2; i < number.length; i++) {
			if (number[i] == 0) {
				prime[idx++] = i;
				for (int j = i+i; j < number.length; j+=i) {
					number[j] = 1;
				}
			}
		}
		StringTokenizer sc = new StringTokenizer(reader.readLine());
		int l = Integer.parseInt(sc.nextToken());
		int r = Integer.parseInt(sc.nextToken());
		Node [] arr = new Node[1000000];
		int end = 0;
		int k = (int)Math.sqrt(r);
		for (int i = 0; i < idx; i++) {
			for (int j = i; j < idx; j++) {
				int val = prime[i]*prime[j];
				if (val >= l && val <= r) {
					arr[end++] = new Node(val, prime[i], prime[j]);
				}
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
		public Node(int val, int i, int j) {
			// TODO Auto-generated constructor stub
			v = val;
			a = i;
			b = j;
		}
		Integer v;
		int a;
		int b;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return v.compareTo(o.v);
		}
	}
}
