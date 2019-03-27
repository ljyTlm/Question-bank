package º¼µçoj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class hdu1401 {

	private static int [][] pla = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	private static boolean sum;
	private static Scanner sc;
	private static int [] grp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		while (sc.hasNext()) {
			grp = new int [88888889];
			Node star = new Node();
			for (int i = 0; i < star.pieces.length; i++) {
				star.pieces[i] = new Piece(sc.nextInt(), sc.nextInt());
			}
			Node end = new Node();
			for (int i = 0; i < end.pieces.length; i++) {
				end.pieces[i] = new Piece(sc.nextInt(), sc.nextInt());
			}
			star.sort();
			end.sort();
			grp[star.hash] = 10;
			grp[end.hash] = 20;
			LinkedList<Node> qu_1 = new LinkedList<>();
			LinkedList<Node> qu_2 = new LinkedList<>();
			qu_1.add(star);
			qu_2.add(end);
			sum = star.hash == end.hash;
			while (!qu_1.isEmpty() || !qu_2.isEmpty()) {
				if (sum) {
					break;
				}
				if (!qu_1.isEmpty()) {
					bfs(qu_1, 1);
				}
				if (!qu_2.isEmpty()) {
					bfs(qu_2, 2);
				}
			}
			System.out.println(sum?"YES":"NO");
		}
	}
	private static void bfs(LinkedList<Node> qu, int f) {
		// TODO Auto-generated method stub
		Node node = qu.poll();
		//System.out.println(f+"  :  "+node.hash);
		for (int i = 0; i < node.pieces.length; i++) {
			for (int j = 0; j < 4; j++) {
				int next_x = node.pieces[i].x + pla[j][0];
				int next_y = node.pieces[i].y + pla[j][1];
				if (cheek(next_x, next_y)) {
					if (isPiece(next_x, next_y, node.pieces, i)) {
						next_x += pla[j][0];
						next_y += pla[j][1];
					}
					if (cheek(next_x, next_y) && !isPiece(next_x, next_y, node.pieces, 9)) {
						Node next = new Node();
						for (int k = 0; k < node.pieces.length; k++) {
							next.pieces[k] = new Piece(node.pieces[k].x, node.pieces[k].y);
						}
						next.pieces[i].x = next_x;
						next.pieces[i].y = next_y;
						next.sort();
						next.num = node.num % 10 + 1;
						if (grp[next.hash] == 0) {
							if (next.num < 9) {
								grp[next.hash] = f*10 + next.num;
								qu.add(next);
							}
						}else if (grp[next.hash]/10 != f && grp[next.hash]%10+node.num <= 8) {
							sum = true;
							return;
						}
					}
				}
			}
		}
	}
	private static boolean isPiece(int next_x, int next_y, Piece[] pieces, int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < pieces.length; j++) {
			if (j != i) {
				if (next_x == pieces[j].x && next_y == pieces[j].y) {
					return true;
				}
			}
		}
		return false;
	}
	private static boolean cheek(int x, int y) {
		// TODO Auto-generated method stub
		return x > 0 && x < 9 && y > 0 && y < 9;
	}
	static class Node {
		Piece [] pieces;
		Integer hash;
		Integer num;
		public Node() {
			// TODO Auto-generated constructor stub
			pieces = new Piece [4];
			hash = 0;
			num = 0;
		}
		public void sort() {
			// TODO Auto-generated method stub
			Arrays.sort(pieces);
			for (int i = 0; i < pieces.length; i++) {
				hash += pieces[i].x;
				hash *= 10;
				hash += pieces[i].y;
				hash *= 10;
			}
			hash /= 10;
		}
	}
	static class Piece implements Comparable<Piece>{
		public Piece(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
		}
		Integer x, y;
		@Override
		public int compareTo(Piece o) {
			// TODO Auto-generated method stub
			if (x == o.x) {
				return y.compareTo(o.y);
			}
			return x.compareTo(o.x);
		}
	} 
}
