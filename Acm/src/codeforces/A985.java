package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class A985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int total = n/2; //
			int numBlack = 0;
			int numWrite = 0;
			int starBlack = 0;
			int starWrite = 0;
			int [] arr = new int [n/2];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				int v = arr[i];
				total --;
				if (v % 2 != 0) { //
					int haveBlack = (n - v) / 2;
					if (total > haveBlack) {
						numBlack += (total - haveBlack) * 2;
						starBlack = v - (total - haveBlack) * 2;
					}else if (v <= starBlack) {
						numBlack += (starBlack - v) + 2;
						starBlack += 2;
					}
					
					int haveWrite = (n - v) / 2;
					numWrite ++;
					if (total > haveWrite) {
						numWrite += (total - haveWrite - 1) * 2;
						starWrite = v - 1 + (total - haveWrite - 1) * 2;
					}else if (v+1 <= starWrite) {
						numWrite += starWrite - v + 2;
						starWrite += 2;
					}else {
						starWrite = v + 1;
					}
				}else {
					int haveBlack = (n-v)/2 - 1;
					numBlack ++;
					if (total > haveBlack) {
						numBlack += (total - haveBlack - 1) * 2;
						starBlack = v - 1 - (total - haveBlack - 1) * 2;
					}else if (v+1 <= starBlack) {
						numBlack += (starBlack - v + 1 );
						starBlack += 2;
					}else {
						starBlack = v + 1;
					}
					
					int haveWrite = (n - v) / 2;
					if (total > haveWrite) {
						numWrite += (total - haveWrite) * 2;
						starWrite = v - (total - haveWrite) * 2;
					}else if (v <= starWrite) {
						numWrite += (starWrite - v) + 2;
						starWrite += 2;
					}
				}
				
			}
//			System.out.println(numBlack + " " + numWrite);
			System.out.println(Math.min(numBlack, numWrite));
		}
	}

}
