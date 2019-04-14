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
			int [][][] mp = new int[8][n][m];
			LinkedList<Node> qu = new LinkedList<Node>();
			int flag = 0;
			qu.add(s);
			while (!qu.isEmpty()) {
				Node node = qu.poll();
				if(flag != 0) {
					if(node.i%n == x && node.j%m == y) {
						flag = -1;
						break;
					}
				}
				flag ++;
				for (int i = 0; i < pla.length; i+=2) {
					Node next = new Node();
					next.i = node.i + pla[i];
					next.j = node.j + pla[i+1];
					if(next.i >= 0 && next.i < 3*n && next.j >= 0 && next.j < 3*m && arr[next.i%n][next.j%m] == '.') {
						String str = next.toString();
//						if (mp[][][] == 0) {
//							mp[][][] = ;
//							qu.add(next);
//						}
					}
				}
			}
			System.out.println(flag == -1 ? "Yes":"No");
		}
	}
	static class Node {
		int i, j;
	}
}
