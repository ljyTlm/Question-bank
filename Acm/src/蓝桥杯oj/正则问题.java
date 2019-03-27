package 蓝桥杯oj;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class 正则问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			char [] arr = scanner.next().toCharArray();
			Stack<String> stack = new Stack<>();
			for (int i = 0; i < arr.length; i++) {
				switch (arr[i]) {
				case '(':
					stack.push("(");
					break;
				case 'x':
					stack.push("x");
					break;
				case '|':
					stack.push("|");
					break;
				default:
					String v = "";
					while (true) {
						String k = stack.pop();
						if (k.equals("(")) {
							break;
						}
						v += k;
					}
					String[] str = v.split("\\|");
					stack.push(test(str));
					break;
				}
			}
			String sum = "";
			while (!stack.isEmpty()) {
				String v = stack.pop();
				if (v.equals("(") || v.equals(")")) {
					continue;
				}
				sum += v;
			}
			String[] split = sum.split("\\|");
			System.out.println(test(split).length());
		}
	}

	private static String test(String[] split) {
		// TODO Auto-generated method stub
		Arrays.sort(split);
		return split[split.length-1];
	}

}
