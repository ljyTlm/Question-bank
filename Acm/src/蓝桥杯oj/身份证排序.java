package ¿∂«≈±≠oj;

import java.util.Arrays;
import java.util.Scanner;

public class …Ì∑›÷§≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			IdCard [] arr = new IdCard [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new IdCard(scanner.next());
			}
			Arrays.sort(arr);
			for (int i = n-1; i >= 0; i--) {
				System.out.println(arr[i].id);
			}
		}
	}

}
class IdCard implements Comparable<IdCard>{
	String id;
	public IdCard(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	@Override
	public int compareTo(IdCard o) {
		// TODO Auto-generated method stub
		String aId = this.id.substring(6,14);
		String bId = o.id.substring(6,14);
		
		if (aId.equals(bId)) {
			return this.id.compareTo(o.id);
		}
		return aId.compareTo(bId);
	}
}
