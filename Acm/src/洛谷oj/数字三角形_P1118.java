package Âå¹Èoj;

import java.util.HashMap;
import java.util.Scanner;


public class Êý×ÖÈý½ÇÐÎ_P1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			HashMap<String, Integer> [][] arr = new HashMap [n][n];
			for (int i = 0; i < arr.length; i++) {
				arr[0][i] = new HashMap<>();
				arr[0][i].put("a"+i, 1);
			}
			for (int i = 1; i < arr.length; i++) {
				for (int j = 0; j < arr.length-i; j++) {
					arr[i][j] = new HashMap<>();
					for (String key : arr[i-1][j].keySet()) {
//						Integer v = arr[i][j] 
					}
				}
			}
		}
	}

}
