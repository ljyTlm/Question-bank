package À¶ÇÅ±­oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ¾Å¹¬»Ã·½ {

	private static ArrayList<String> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{2, 7, 6, 9, 5, 1, 4, 3, 8},
				{2, 9, 4, 7, 5, 3, 6, 1, 8},
				{4, 3, 8, 9, 5, 1, 2, 7, 6},
				{4, 9, 2, 3, 5, 7, 8, 1, 6},
				{6, 1, 8, 7, 5, 3, 2, 9, 4},
				{6, 7, 2, 1, 5, 9, 8, 3, 4},
				{8, 3, 4, 1, 5, 9, 6, 7, 2},
				{8, 1, 6, 3, 5, 7, 4, 9, 2}	
		};
		Scanner sc = new Scanner(System.in);
		int [] vla = new int [9];
		for (int i = 0; i < vla.length; i++) {
			vla[i] = sc.nextInt();
		}
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < vla.length; j++) {
				if (vla[j] != 0 && vla[j] != arr[i][j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				if (idx == -1) {
					idx = i;
				}else {
					idx = -1;
					break;
				}
			}
		}
		if (idx == -1) {
			System.out.println("Too Many");
		}else {
			for (int i = 0; i < vla.length; i++) {
				if (i % 3 == 0) {
					if (i != 0) {
						System.out.println();
					}
					System.out.print(arr[idx][i]);
				}else {
					System.out.print(" "+arr[idx][i]);
				}
			}
			System.out.println();
		}
	}

}
