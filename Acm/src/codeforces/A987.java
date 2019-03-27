package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A987 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new TreeMap<String, String>();
		map.put("purple","Power");
		map.put("green","Time");
		map.put("blue","Space");
		map.put("orange","Soul");
		map.put("red","Reality");
		map.put("yellow","Mind");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			//题解：裸的题意 灭霸有六颗宝石 问缺啥 
			int n = sc.nextInt();
			Map<String, Boolean> arr = new HashMap<>();
			for (int i = 0; i < n; i++) {
				arr.put(sc.next(), true);
			}
			String sum = "";
			int num = 0;
			for (String str : map.keySet()) {
				if (arr.get(str) == null) {
					sum += map.get(str)+"\n";
					num ++;
				}
			}
			System.out.println(num);
			System.out.println(sum);
		}
	}

}
