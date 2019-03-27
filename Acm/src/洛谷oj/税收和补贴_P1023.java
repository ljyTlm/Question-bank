package 洛谷oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 税收和补贴_P1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			double hope = scanner.nextDouble();//期望价格
			ArrayList<Node> list = new ArrayList<>();
			double cost = scanner.nextDouble();//成本
			double sell = scanner.nextDouble();//成本时的销量
			list.add(new Node(cost, sell));
			while (true) {
				double a = scanner.nextDouble();
				double b = scanner.nextDouble();
				if (a == -1) {
					break;
				}
				list.add(new Node(a, b));
			}
			double sub = scanner.nextDouble();
			Collections.sort(list);
			ArrayList<Node> data = new ArrayList<>();
			double hope_sell = 0;
			for (int i = 1; i < list.size(); i++) {
				double k = (list.get(i-1).sell - list.get(i).sell) / (list.get(i).price - list.get(i-1).price);
				double b = list.get(i-1).sell - k*list.get(i-1).price;
				for (double j = list.get(i-1).price; j < list.get(i).price; j++) {
					double y = k*j + b;
					data.add(new Node(j, y));
					if (j == hope) {
						hope_sell = y;
					}
				}
			}
			for (double i = 0; list.get(list.size()-1).sell - i*sub > 0; i++) {
				if (i+list.get(list.size()-1).price == hope) {
					hope_sell = list.get(list.size()-1).sell-i*sub;
				}
				data.add(new Node(i+list.get(list.size()-1).price, list.get(list.size()-1).sell-i*sub));
			}
			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).price == hope) {
					continue;
				}
				double v = data.get(i).price * data.get(i).sell - hope * hope_sell + cost * (hope_sell-data.get(i).sell);
				v /= hope_sell - data.get(i).sell;
				System.out.println(v);
			}
		}
	}
	static class Node implements Comparable<Node>{
		public Node(Double p_l, Double s_l) {
			// TODO Auto-generated constructor stub
			price = p_l;
			sell = s_l;
		}
		Double price, sell; //价格 销售量
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return price.compareTo(o.price);
		}
	}
}
