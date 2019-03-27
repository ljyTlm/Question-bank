package 蓝桥杯oj;

import java.util.Scanner;



public class 排列数 {
    static String [] arr = new String [3628801];
    public static int l = 0;
    static boolean [] shu = new boolean [10];
	public static void main(String[] args) {
	    f("",1);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
			System.out.println(arr[scanner.nextInt()-1]);
		}
	}
	private static void f(String string, int i) {
		// TODO 自动生成的方法存根
		if (i==11) {
             arr[l] = string;l++;			
		}else {
			for (int j = 0; j <=9; j++) {
				if (!shu[j]) {
					shu[j] = true;
					f(string+j, i+1);
					shu[j] = false;
				}
			}
		}
	} 

}
