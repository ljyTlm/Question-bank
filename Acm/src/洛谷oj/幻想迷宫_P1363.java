package ¬Âπ»oj;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class ª√œÎ√‘π¨_P1363 {
	static int [] pla = {1, 0, -1, 0, 0, 1, 0, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char [][] arr = new char[n][m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.next().toCharArray();
			}
			if (n == 1 && m == 1) {
				System.out.println("Yes");
				continue;
			}
			Node s = new Node();
			int x = 0; int y = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(arr[i][j] == 'S') {
						s.i = i + n;
						s.j = j + m;
						x = i;
						y = j;
						arr[i][j] = '.';
					}
				}
			}
			int [][] mp = new int[3*n][3*m];
			mp[s.i][s.j] = 1;
			LinkedList<Node> qu = new LinkedList<Node>();
			boolean flag = true;
			qu.add(s);
			while (!qu.isEmpty() && flag) {
				Node node = qu.poll();
				for (int i = 0; i < pla.length; i+=2) {
					Node next = new Node();
					next.i = node.i + pla[i];
					next.j = node.j + pla[i+1];
					if(next.i >= 0 && next.i < 3*n && next.j >= 0 && next.j < 3*m && arr[next.i % n][next.j % m] == '.') {
						if (mp[next.i][next.j] == 0) {
							mp[next.i][next.j] = 1;
							qu.add(next);
							//System.out.println(next.i+" "+next.j);
							if (next.i % n == x && next.j % m == y) {
								flag = false;
								break;
							}
						}
					}
				}
			}
			System.out.println(flag? "No":"Yes");
		}
	}
	static class Node {
		int i, j;
	}
}
//#include<iostream>  
//#include<cstdio>  
//#include<cmath> 
//#include <algorithm> 
//#include <map>
//#include <queue>
//#include <string>
//#include <sstream>
//
//using namespace std;   
//
//
//struct Node {
//	int i, j;
//};
//
//int n, m, x, y, a, b; 
//char arr[1510][1510];
//int flag[1510][1510][2];
//Node s, p, node;
//int pla[8] = {1, 0, -1, 0, 0, 1, 0, -1};
//queue<Node>	qu;
//string next;
//
//int main()  
//{   
//	while(scanf("%d%d", &n, &m) != EOF){
//		for(int i = 0; i < n; i ++){
//			for(int j = 0; j < m; j ++){
//				cin>>arr[i][j];
//				if(arr[i][j] == 'S'){
//					x = i;
//					y = j;
//					arr[i][j] = '.';
//				}
//				flag[i][j][0] = flag[i][j][1] = -1;
//			} 
//		}	
//		if(n == 1 || m == 1){
//			cout<<"Yes"<<endl;
//			continue;
//		}
//		s.i = x + 999*n;
//		s.j = y + 999*m; 
//		flag[x][y][0] = s.i;
//		flag[x][y][1] = s.j;
//		qu.push(s);
//		bool k = true;
//		while(qu.size() != 0 && k){
//			node = qu.front(); qu.pop();
//	 		for(int i = 0; i < 8; i += 2){
//		 		p.i= node.i+pla[i];
//	 		 	p.j= node.j+pla[i+1];
//		 		a = p.i%n;
//		 		b = p.j%m;
//		 		if(arr[a][b] == '.'){
//		 			if(flag[a][b][0] == -1){
//			 			flag[a][b][0] = p.i;
//						flag[a][b][1] = p.j;
//						qu.push(p);	
//			 		}else{
//		 				if(max(abs(p.i-flag[a][b][0]), abs(p.j-flag[a][b][1])) > 1){
//				 			k = false;
//				 			break;
//				 		}
//		 			}
//		 		}
//		 	}
//		}
//		cout<< (k ? "No":"Yes") <<endl;
//		while(qu.size() != 0) qu.pop();
//	}       	
//    return 0;  
//}