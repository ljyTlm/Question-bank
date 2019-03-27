package ¿∂«≈±≠oj;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramsŒ Ã‚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next().toLowerCase();
			String b = scanner.next().toLowerCase();
			if (a.length() != b.length()) {
				System.out.println("N");
				continue;
			}
			HashMap<Character, Integer> aMap = new HashMap<>();
			HashMap<Character, Integer> bMap = new HashMap<>();
			for (int i = 0; i < a.length(); i++) {
				Integer v = aMap.get(a.charAt(i));
				if (v == null) {
					aMap.put(a.charAt(i), 1);
				}else {
					aMap.put(a.charAt(i), v+1);
				}
			}
			for (int i = 0; i < b.length(); i++) {
				Integer v = bMap.get(b.charAt(i));
				if (v == null) {
					bMap.put(b.charAt(i), 1);
				}else {
					bMap.put(b.charAt(i), v+1);
				}
			}
			String sum = "Y";
			for (Character character : aMap.keySet()) {
				if (aMap.get(character) != bMap.get(character)) {
					sum = "N";
					break;
				}
			}
			System.out.println(sum);
		}
	}

}
