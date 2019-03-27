package 蓝桥杯oj;

import java.util.Scanner;

public class 高精度加法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			int aIndex = a.length()-1;
			int bIndex = b.length()-1;
			String sum = "";
			int jinwei = 0;
			while (aIndex >= 0 || bIndex>=0) {
				if (aIndex >= 0 && bIndex >=0) {
					int v = a.charAt(aIndex) + b.charAt(bIndex) - '0' - '0' + jinwei;
					jinwei = v/10;
					sum = v%10 + sum;
				}else if(aIndex >= 0) {
					int v = a.charAt(aIndex) + jinwei - '0';
					jinwei = v/10;
					sum = v%10 + sum;
				}else if (bIndex >= 0) {
					int v = b.charAt(bIndex) + jinwei - '0';
					jinwei = v/10;
					sum = v%10 + sum;
				}
				aIndex --;
				bIndex --;
			}
			System.out.println(jinwei !=0 ? (jinwei+sum) : sum);
		}
	}

}
