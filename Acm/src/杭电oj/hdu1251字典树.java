package º¼µçoj;

import java.util.Scanner;

public class hdu1251×ÖµäÊ÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Node root = new Node();
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				String doing = scanner.next();
				String str = scanner.next();
				if (doing.equals("insert")) {
					insert(str, root);
				}else if (doing.equals("select")) {
					System.out.println(select(str, root));
				}else if (doing.equals("delete")) {
					System.out.println(delete(str, root) == 0 ? "É¾³ýÊ§°Ü":"É¾³ý³É¹¦´Ë×Ö·û´®»¹Ê£("+select(str, root)+")¸ö");
				}
			}
		}
	}

	private static int delete(String str, Node root) {
		// TODO Auto-generated method stub
		Node k = root;
		int index = 0;
		if (select(str, root) == 0) {
			return 0;
		}
		while (k != null && index < str.length()) {
			int v = str.charAt(index) - 'a';
			k.arr[v].sum --;
			k = k.arr[v];
			index ++;
			if (k.sum == 0) {
				k = null;
				return 1;
			}
		}
		return 0;
	}

	private static int select(String str, Node root) {
		// TODO Auto-generated method stub
		Node k = root;
		int index = 0;
		while (k != null && index < str.length()) {
			int v = str.charAt(index) - 'a';
			k = k.arr[v];
			index ++;
		}
		return k == null ? 0 : k.sum;
	}

	private static void insert(String str, Node root) {
		// TODO Auto-generated method stub
		Node k = root;
		int index = 0;
		while (index < str.length()) {
			int v = str.charAt(index) - 'a';
			if (k.arr[v] == null) {
				k.arr[v] = new Node();
			}else {
				k.arr[v].sum ++;
			}
			k = k.arr[v];
			index ++;
		}
	}
	static class Node {
		int sum ;
		Node [] arr ;
		public Node() {
			arr = new Node [27];
			sum = 1;
		}
	}
}
