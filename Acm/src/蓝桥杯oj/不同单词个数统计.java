package 蓝桥杯oj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 不同单词个数统计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String [] k = scanner.nextLine().split(" ");
			Map<String, Boolean> map = new HashMap<>();
			for (int i = 0; i < k.length; i++) {
				map.put(k[i], true);
			}
			System.out.println(map.keySet().size());
		}
	}

}
