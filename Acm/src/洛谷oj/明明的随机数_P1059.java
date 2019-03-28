package 洛谷oj;

import java.util.Scanner;

public class 明明的随机数_P1059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int [] arr = new int [1001];
			int num = 0;
			for (int i = 0; i < n; i++) {
				int v = sc.nextInt();
				if(arr[v]==0) num ++;
				arr[v] ++;
			}
			System.out.println(num);
			String sum = "";
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					sum += " "+i;
				}
			}
			System.out.println(sum.trim());
		}
	}

}
