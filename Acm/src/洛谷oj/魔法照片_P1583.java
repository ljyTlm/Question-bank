package Âå¹Èoj;

import java.util.Arrays;
import java.util.Scanner;

public class Ä§·¨ÕÕÆ¬_P1583 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] e = new int[11];
			for (int i = 1; i < e.length; i++) {
				e[i] = sc.nextInt();
			}
			Node [] w = new Node[n];
			for (int i = 0; i < w.length; i++) {
				w[i] = new Node(sc.nextInt(), i+1);
			}
			Arrays.sort(w);
			for (int i = 0; i < w.length; i++) {
				w[i].v += e[i%10+1];
			}
			Arrays.sort(w);
			for (int i = 0; i < k; i++) {
				System.out.print(w[i].i+" ");
			}
			System.out.println();
		}
	}
	static class Node implements Comparable<Node>{
		public Node(int v, int i) {
			// TODO Auto-generated constructor stub
			this.v = v;
			this.i = i;
		}
		Integer v;
		Integer i;
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (v == o.v) {
				return i.compareTo(o.i);
			}
			return -v.compareTo(o.v);
		}
	}
}

//#include<stdio.h>
//#include<string.h>
//#include<stdlib.h>
//#include<queue>
//#include<math.h>
//#include<vector>
//#include<map>
//#include<set>
//#include<stdlib.h>
//#include<cmath>
//#include<string>
//#include<algorithm>
//#include<iostream>
//#include<map>
//#include<stack>
//#define LL long long 
//using namespace std;
//
//struct Node {
//	int i, v;
//};
//
//bool cmp(Node a, Node b){
//	if(a.v == b.v)
//		return a.i < b.i;
//	return a.v > b.v;
//}
//
//int n, k, e[11];
//Node w[20001]; 
//
//int main()
//{ 
//	cin>>n>>k;
//	for (int i = 1; i < 11; i++) {
//		cin>>e[i];
//	}
//	for (int i = 0; i < n; i++) {
//		cin>>w[i].v;
//		w[i].i = i+1;
//	}
//	sort(w, w+n, cmp);
//	for (int i = 0; i < n; i++) {
//		w[i].v += e[i%10+1];
//	}
//	sort(w, w+n, cmp);
//	for (int i = 0; i < k; i++) {
//		cout<<w[i].i<<" ";
//	}
//	cout<<"\n";
//    return 0;
//}
