package º¼µçoj;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class hdu1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] split = sc.next().split("5");
			BigInteger [] arr = new BigInteger [split.length];
			int num = 0;
			for (int i = 0; i < arr.length; i++) {
				if (split[i].equals("")) {
					split[i] = "99999999999999999999";
					num --;
				}num ++;
				arr[i] = new BigInteger(split[i]); 
			}
			Arrays.sort(arr);
			for (int i = 0; i < num; i++) {
				System.out.print(i == 0 ? arr[i] : " " + arr[i]);
			}
			System.out.println();
		}
	}

}
