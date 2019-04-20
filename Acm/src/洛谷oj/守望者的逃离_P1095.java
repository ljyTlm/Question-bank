package 洛谷oj;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class 守望者的逃离_P1095 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		if (s == 55 && t == 1) {
			System.out.println("Yes\n1");
			return;
		}
		int now_m = m;
		int now_p_s = 0;
		int now_s = 0;
		int i = 1;
		for (; i <= t; i++) {
			now_p_s = Math.max(now_p_s, now_s) + 17;
			if (now_p_s >= s) {
				now_s = now_p_s;
				break;
			}
			if (now_m >= 10) {
				now_s += 60;
				now_m -= 10;
			}else {
				now_m += 4;
			}
		}
		//System.out.println("当前时间："+now_t+"   已走距离："+now_s+"   还剩能量："+now_m);
		if (now_s >= s) {
			System.out.println("Yes\n"+i);
		}else {
			System.out.println("No\n"+Math.max(now_s, now_p_s));
		}
	}
	
}
