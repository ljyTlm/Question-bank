package ¿∂«≈±≠oj;

import java.util.Scanner;

public class ¥Ú”°’§∏Ò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt()*2+1;
			int m = scanner.nextInt()*2+1;
			if (n == 1 || m == 1) {
				continue;
			}
			for (int i = 1; i <= n; i++) {
				if (i%2 == 0) {
					for (int j = 0; j < (m-1)/2 + 1; j++) {
						System.out.print(j==0?"|":" |");
					}
				}else {
					int k = 0;
					for (int j = 0; j < m; j++) {
						if (k == 0) {
							System.out.print("+");
							k = 1; 
						}else {
							System.out.print("-");
							k = 0;
						}
					}
				}
				System.out.println();
			}
		}
	}

}
