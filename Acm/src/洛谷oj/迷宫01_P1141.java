package Âå¹Èoj;

import java.util.LinkedList;
import java.util.Scanner;

public class ÃÔ¹¬01_P1141 {

	 private static int[] num;
	    private static int k;
	    private static int[][] dp;
	    private static String[] arr;
	    private static int [] pla = {1, 0, -1, 0, 0, 1, 0, -1};
	    private static int n;
	    private static int m;
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) {
	            n = sc.nextInt();
	            m = sc.nextInt();
	            arr = new String[n];
	            for (int i = 0; i < arr.length; i++) {
	                arr[i] = sc.next();
	            }
	            dp = new int[n][n];
	            k = 1;
	            num = new int[n*n];
	            LinkedList<Node> list = new LinkedList<>();
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    if (dp[i][j] == 0) {
	                        list.add(new Node(i, j));
	                        num[k] ++;
	                        dp[i][j] = k;
	                        while (!list.isEmpty()) {
	                            Node node = list.poll();
	                            for (int z = 0; z < pla.length; z+=2) {
	                                int x = node.x + pla[z];
	                                int y = node.y + pla[z+1];
	                                if (x >= 0 && x < n && y >= 0 && y < n && dp[x][y] == 0 && arr[x].charAt(y) != arr[node.x].charAt(node.y)) {
	                                    dp[x][y] = k;
	                                    num[k] ++;
	                                    list.add(new Node(x, y));
	                                }
	                            }
	                        }
	                        k ++;
	                    }
	                }
	            }
	            for (int i = 0; i < m; i++) {
	                int a = sc.nextInt();
	                int b = sc.nextInt();
	                System.out.println(num[dp[a-1][b-1]]);
	            }
	        }
	    }
	    static class Node {
	        int x, y;
	        public Node(int i, int j) {
	            // TODO Auto-generated constructor stub
	            x = i;
	            y = j;
	        }
	    }

}
