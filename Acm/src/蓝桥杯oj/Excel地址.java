package À¶ÇÅ±­oj;

import java.util.Arrays;
import java.util.Scanner;

public class ExcelµØÖ· {

	private static String arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = "";
		int [] num = new int [20];
		int idx = 0;
		while(n > 0) {
			int a = n % 26;	
			num[idx++] = a;
			n = n / 26;
		}
		for (int i = 0; i < idx; i++) {
			if (num[i] == 0) {
				int k = i;
				for (int j = i+1; j < idx; j++) {
					if (num[j] != 0) {
						num[j] --;
						if (j == idx - 1 && num[j] == 0) {
							idx--;
						}
						break;
					}
					num[j] = 25;
				}
			}
			Fangfa(num[i]);
		}
		System.out.println(arr);
	}

	private static void Fangfa(int n) {
		switch (n){
		case 0 :
			arr = "Z" + arr;
			break;
		case 1 :
			arr = "A" + arr;
			break;
		case 2 :
			arr = "B" + arr;
			break;
		case 3 :
			arr = "C" + arr;
			break;
		case 4 :
			arr = "D" + arr;
			break;
		case 5 :
			arr = "E" + arr;
			break;
		case 6 :
			arr = "F" + arr;
			break;
		case 7 :
			arr = "G" + arr;
			break;
		case 8 :
			arr = "H" + arr;
			break;
		case 9 :
			arr = "I" + arr;
			break;
		case 10 :
			arr = "J" + arr;
			break;
		case 11 :
			arr = "K" + arr;
			break;
		case 12 :
			arr = "L" + arr;
			break;
		case 13 :
			arr = "M" + arr;
			break;
		case 14 :
			arr = "N" + arr;
			break;
		case 15 :
			arr = "O" + arr;
			break;
		case 16 :
			arr = "P" + arr;
			break;
		case 17 :
			arr = "Q" + arr;
			break;
		case 18 :
			arr = "R" + arr;
			break;
		case 19 :
			arr = "S" + arr;
			break;
		case 20 :
			arr = "T" + arr;
			break;
		case 21 :
			arr = "U" + arr;
			break;
		case 22 :
			arr = "V" + arr;
			break;
		case 23 :
			arr = "W" + arr;
			break;
		case 24 :
			arr = "X" + arr;
			break;
		case 25 :
			arr = "Y" + arr;
			break;
		}
	}
}
