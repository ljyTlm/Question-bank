package codeforces;


import java.util.Arrays;
import java.util.Scanner;

public class B547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String str = scanner.nextLine().replace(" ", "");
		str = str + str;
		String [] arr = str.split("0");
		Arrays.sort(arr);
		System.out.println(arr.length == 0? 0:arr[arr.length-1].length());
	}

}
