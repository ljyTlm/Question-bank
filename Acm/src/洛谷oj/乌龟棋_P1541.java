package Âå¹Èoj;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class ÎÚ¹êÆå_P1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n+1];
		for (int i = 1; i < arr
				.length; i++) {
			arr[i] = sc.nextInt()+1;
		}
		int [] num = new int[5];
		for (int i = 0; i < m; i++) {
			num[sc.nextInt()] ++;
		}
		int [][][][] dp = new int [num[1]+2][num[2]+2][num[3]+2][num[4]+2];
		dp[0][0][0][0] = arr[1];
		for (int i = 0; i <= num[1]; i++) {
			for (int j = 0; j <= num[2]; j++) {
				for (int k = 0; k <= num[3]; k++) {
					for (int z = 0; z <= num[4]; z++) {
						if (dp[i][j][k][z] > 0) {
							if(i < num[1])
								dp[i+1][j][k][z] = Math.max(dp[i+1][j][k][z], dp[i][j][k][z]+arr[1+i+j+k+z+1]);   
							if(j < num[2])
								dp[i][j+1][k][z] = Math.max(dp[i][j+1][k][z], dp[i][j][k][z]+arr[1+i+j+k+z+2]);
							if(k < num[3])
								dp[i][j][k+1][z] = Math.max(dp[i][j][k+1][z], dp[i][j][k][z]+arr[1+i+j+k+z+3]);
							if(z < num[4])
								dp[i][j][k][z+1] = Math.max(dp[i][j][k][z+1], dp[i][j][k][z]+arr[1+i+j+k+z+4]);
						}
					}
				}
			}
		}
		System.out.println(dp[num[1]][num[2]][num[3]][num[4]]-m-1);
	}
	static class Node {
		public Node(int a, int b, int c, int d, int v, int idx) {
			this.a = a; this.b = b; this.c = c; this.d = d; this.v = v; this.idx = idx;
		}
		int a, b, c, d, v, idx;
	}
}
