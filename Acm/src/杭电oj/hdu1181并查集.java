package 杭电oj;

import java.util.Scanner;

public class hdu1181并查集 {

	private static int[][] group;
	private static int flag;
	private static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			group = new int [27][27];
			while (true) {
				String a = scanner.next();
				if (a.equals("0")) {
					break;
				}
				int b = a.charAt(0)-'a';
				int c = a.charAt(a.length()-1)-'a';
				group[b][c] = 1;
				for (int i = 0; i < 27; i++) {
					if (group[i][b] == 1) {
						group[i][c] = 1;
					}
				}
			}
			for (int i = 0; i < 27; i++) {
				for (int j = 0; j < 27; j++) {
					System.out.print(group[i][j] == 1 ? (char)(i+'a')+""+(char)(j+'a')+" " :"   ");
				}System.out.println();
			}
			System.out.println(group[1]['m'-'a'] == 0 ? "No.":"Yes.");
		}
	}

}
