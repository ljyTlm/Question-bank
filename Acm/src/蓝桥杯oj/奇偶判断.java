package ¿∂«≈±≠oj;

import java.util.Scanner;

public class ∆Ê≈º≈–∂œ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			if (a == 0) {
				System.out.println("even");
				continue;
			}
			System.out.println(a % 2 == 0 ? "even" : "odd");
		}
	}

}
