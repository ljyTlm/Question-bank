package 蓝桥杯oj;

import java.util.Scanner;

public class 统计平均成绩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int [] sum = new int [4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					sum[j] += scanner.nextInt(); 
				}
			}
			for (int i = 0; i < 4; i++) {
				System.out.printf("%.2f\n",sum[i]/4.0);
			}
			System.out.println();
		}
	}

}
