package 杭电oj;

import java.util.Scanner;

public class hdu6849 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			int n = sc.nextInt();
			int [] arr = new int[n+1];
			int [] pla = new int[n+1];
			for (int i = 1; i < arr.length; i++) {
				pla[i] = sc.nextInt(); //第几个位置上 是谁
				arr[pla[i]] = i;  //几号点 在原数组的位置
			}
			int ans = 0;
			for (int i = 1; i < pla.length; i++) {
				if(pla[i] != i) { //1号位置上不是1
					ans ++; //必须交换
					pla[arr[i]] = pla[i];
					arr[pla[i]] = arr[i];
				}
			}
			System.out.println(ans);
		}
	}

}
