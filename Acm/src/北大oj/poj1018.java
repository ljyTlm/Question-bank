package ±±´óoj;
import java.util.Scanner;

public class poj1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			Luyouqi [][] arr = new Luyouqi [n][];
			for (int j = 0; j < arr.length; j++) {
				int k = scanner.nextInt();
				arr[j] = new Luyouqi [k];
				for (int k2 = 0; k2 < k; k2++) {
					arr[j][k2] = new Luyouqi(scanner.nextInt(), scanner.nextInt());
				}
			}
		}
	}

}
class Luyouqi{
	int p;
	int b;
	public Luyouqi(int p, int b) {
		this.b = b;
		this.p = p;
	}
}