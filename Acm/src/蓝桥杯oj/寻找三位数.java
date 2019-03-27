package À¶ÇÅ±­oj;

import java.util.Arrays;

public class Ñ°ÕÒÈıÎ»Êı {

	private static boolean[] flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 123; i*3 <= 999; i++) {
			a = i;
			flag = new boolean [10];
			Arrays.fill(flag, true);
			if (test(i)) {
				b = i*2;
				if (test(b)) {
					c = i*3;
					if (test(c)) {
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}

	private static boolean test(int i) {
		// TODO Auto-generated method stub
		if ((i+"").indexOf("0") != -1) {
			return false;
		}else {
			int bai = i/100;
			int shi = (i-100*bai)/10;
			int ge = i%10;
			if (bai == shi || bai == ge || shi == ge) {
				return false;
			}
			if (flag[bai]&&flag[shi]&&flag[ge]) {
				flag[bai] = false;
				flag[shi] = false;
				flag[ge] = false;
				return true;
			}
			return false;
		}
	}

}
