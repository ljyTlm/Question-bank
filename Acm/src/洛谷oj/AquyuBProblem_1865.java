package Âå¹Èoj;

import java.util.Scanner;

public class AquyuBProblem_1865 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int [1000002];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == -1) {
				arr[i] = arr[i-1];
			}else {
				arr[i] = arr[i-1]+1;
				for (int j = i+i; j < arr.length; j+=i) {
					arr[j] = -1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a >= 1 && b <= m) {
				System.out.println(arr[b]-arr[a-1]);
			}else {
				System.out.println("Crossing the line");
			}
		}
	}

}
