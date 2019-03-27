package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class C989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int [] arr = new int [4];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			char [][] graph = new char [50][50];
			if (arr[0] == 1) {
				for (int i = 0; i < graph.length; i++) {
					for (int j = 0; j < graph.length; j++) {
						graph[i][j] = 'A';
					}
				}
				int index = 1;
				for (int i = 0; i < graph.length && index < 4; i+=2) {
					for (int j = 0; j < graph.length && index < 4; j+=2) {
						graph[i][j] = (char)('A'+index);
						arr[index] --;
						if (arr[index] == 0) {
							index ++;
						}
					}
				}
			}else {
				for (int i = 0; i < 25; i++) {
					for (int j = 0; j < 50; j++) {
						graph[i][j] = 'A';
					}
				}
				for (int i = 25; i < 50; i++) {
					for (int j = 0; j < 50; j++) {
						graph[i][j] = 'B';
					}
				}
				arr[0] --;
				arr[1] --;
				int index = 1;
				for (int i = 0; i < 50 && index < 4; i+=2) {
					for (int j = 0; j < 50 && index < 4; j+=2) {
						if (arr[index] == 0) {
							index ++;
						}else {
							arr[index] --;
							graph[i][j] = (char)('A'+index);
						}
					}
				}
				for (int i = 49; i >= 25 && arr[0] != 0; i-=2) {
					for (int j = 0; j < graph.length && arr[0] != 0; j+=2) {
						graph[i][j] = 'A';
						arr[0] --;
					}
				}
			}
			System.out.println("50 50");
			for (int i = 0; i < graph.length; i++) {
				System.out.println(new String(graph[i]));
			}
			
		}
	}
	
}
