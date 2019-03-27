package 蓝桥杯oj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 删除数组中零元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int v = scanner.nextInt();
				if (v != 0) {
					list.add(v);
				}
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.print(i==0?list.get(i):" "+list.get(i));
			}
			System.out.println();
			System.out.println(list.size());
		}
	}

}
