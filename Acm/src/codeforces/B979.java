package codeforces;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class B979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String [] name = {"Kuro", "Shiro", "Katie"};
			ArrayList<catNode> list = new ArrayList<>();
			for (int i = 0; i < name.length; i++) {
				String str = sc.next();
				int [] arr = new int ['z'+1];
				int max = 0;
				int num = 0;
				for (int j = 0; j < str.length(); j++) {
					arr[str.charAt(j)] ++;
					num = Math.max(num, arr[str.charAt(j)]);
				}
				if (str.length() - num >= n) {
					max = num + n;
				}else {
					max = n == 1 ? num - 1 : str.length();
				}
				list.add(new catNode(name[i], max));
			}
			list.sort(new Comparator<catNode>() {
				@Override
				public int compare(catNode o1, catNode o2) {
					// TODO Auto-generated method stub
					return -o1.max.compareTo(o2.max);
				}
			});
			if (list.get(0).max.compareTo(list.get(1).max) == 0) {
				System.out.println("Draw");
			}else {
				System.out.println(list.get(0).name);
			}
		}
	}

}
class catNode {
	String name;
	Integer max;
	public catNode(String name, int max) {
		this.max = max;
		this.name = name;
	}
}
