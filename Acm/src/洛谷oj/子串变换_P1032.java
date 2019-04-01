package Âå¹Èoj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class ×Ó´®±ä»»_P1032 {

	private static HashMap<String, Integer> map;
	private static String[][] arr;
	private static int m;
	private static boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		arr = new String[7][2];
		m = 0;
		while (sc.hasNext()) {
			arr[m][0] = sc.next();
			arr[m++][1] = sc.next();
		}
//		int v = 3;
//		while (v-->0) {
//			arr[m][0] = sc.next();
//			arr[m++][1] = sc.next();
//		}
		if (s.equals(t)) {
			System.out.println(0);
			return;
		}
		map = new HashMap<String, Integer>();
		map.put(s, 0);
		map.put(t, 100);
		LinkedList<Node> list_1 = new LinkedList<>();
		LinkedList<Node> list_2 = new LinkedList<>();
		list_1.add(new Node(s, 0));
		list_2.add(new Node(t, 0));
		flag = false;
		while (!list_1.isEmpty() || !list_2.isEmpty()) {
			if (flag) 
				return;
			if (!list_1.isEmpty()) 
				dfs(list_1, 0, 1);
			if (flag) 
				return;
			if (!list_2.isEmpty()) 
				dfs(list_2, 1, 0);
		}
		System.out.println("NO ANSWER!");
	}
	private static void dfs(LinkedList<Node> list, int l, int r) {
		// TODO Auto-generated method stub
		Node node = list.poll();
		if (node.n > 6) {
			return;
		}
		for (int i = 0; i < m; i++) {
			ArrayList<String> next = replace(node.str, arr[i][l], arr[i][r]);
			for (int j = 0; j < next.size(); j++) {
				Integer v = map.get(next.get(j));
				if (v == null) {
					map.put(next.get(j), l*100+node.n+1);
					list.add(new Node(next.get(j), node.n+1));
				}else {
					if (v/100 != l) {
						System.out.println(v%100+node.n+1);
						flag = true;
						return;
					}
				}
			}
		}
	}
	
	private static ArrayList<String> replace(String str, String a, String b) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		if (str.equals(a)) {
			list.add(b);
		}else if (a.length() > str.length()) {
			list.add(str);
		}else {
			for (int i = 0; i < str.length(); i++) {
				int k = 1;
				for (int j = 0; j < a.length(); j++) {
					if (i+j >= str.length() || str.charAt(i+j) != a.charAt(j)) {
						k = 0;
						break;
					}
				}
				if (k == 1) {
					String ans = "";
					for (int j = 0; j < i; j++) {
						ans += str.charAt(j);
					}
					ans += b;
					for (int j = i+a.length(); j < str.length(); j++) {
						ans += str.charAt(j);
					}
					list.add(ans);
				}
			}
		}
		return list;
	}
	
	private static String getStr(String a) {
		// TODO Auto-generated method stub
		String c = "";
		for (int i = 0; i < a.length(); i++) {
			char v = a.charAt(i);
			if (v=='('||v=='['||v=='{'||v=='/'||v=='^'||v=='-'||v=='$'||v=='Â¦'||v=='}'||v==']'||v==')'||v=='?'||v=='*'||v=='+'||v=='.') {
				c += "\\";
			}
			c += v;
		}
		return c;
	}
	
	static class Node {
		public Node(String s, int i) {
			// TODO Auto-generated constructor stub
			str = s;
			n = i;
		}
		String str;
		Integer n;
	}
}
