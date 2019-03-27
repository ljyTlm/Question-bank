package À¶ÇÅ±­oj;

import java.util.Scanner;

public class Êý×éÊä³ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int [][] arr = new int [4][5];
			int max = Integer.MIN_VALUE;
			int x = 0;
			int y = 0;
			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 5; j++) {
					arr[i][j] = scanner.nextInt();
					if (Math.abs(arr[i][j]) > max) {
						max = Math.abs(arr[i][j]);
						x = i;
						y = j;
					}
				}
			}
			System.out.println(max+" "+x+" "+y);
		}
	}

}
