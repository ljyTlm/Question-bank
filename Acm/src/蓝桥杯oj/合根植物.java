package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ºÏ¸ùÖ²Îï {

	private static int[] root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int k = scanner.nextInt();
			root = new int [n*m+1];
			for (int i = 0; i < root.length; i++) {
				root[i] = i;
			}
			int sum = n*m;
			for (int i = 0; i < k; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int finda = find(a);
				int findb = find(b);
				if (finda != findb) {
					root[finda] = findb;
					sum --;
				}
 			}
			System.out.println(sum);
		}
	}

	private static int find(int a) {
		// TODO Auto-generated method stub
		return a == root[a] ? a : find(root[a]);
	}

}
