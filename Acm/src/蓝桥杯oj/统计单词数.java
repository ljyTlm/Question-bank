package 蓝桥杯oj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 统计单词数 {

	public static void main(String[] args) {
		// TODO Auto-generated me
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[] split = scanner.nextLine().split(" ");
			String [] str = new String[200];
			Map<String, Integer> map = new HashMap<>();
			int k = 0;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < split.length; i++) {
				if (split[i].charAt(split[i].length()-1) == '.' || split[i].charAt(split[i].length()-1) == ',') {
					split[i] = split[i].substring(0, split[i].length()-1);
				}
				String a = split[i].toUpperCase();
				max = max < a.length() ? a.length(): max;
				Integer b = map.get(a);
				if (b == null) {
					map.put(a, 1);
					str[k] = a;
					k ++;
				}else {
					map.put(a, b+1);
				}
			}
			for (int i = 0; i < k; i++) {
				System.out.println(kongge(max, str[i].length())+str[i]+":"+xing(map.get(str[i]))+map.get(str[i]));
			}
		}
	}

	private static String kongge(int max, int length) {
		// TODO Auto-generated method stub
		String k = "";
		for (int i = 0; i < max-length; i++) {
			k += " ";
		}
		return k;
	}

	private static String xing(Integer integer) {
		// TODO Auto-generated method stub
		String k = "";
		for (int i = 0; i < integer; i++) {
			k += "*";
		}
		return k;
	}

}
