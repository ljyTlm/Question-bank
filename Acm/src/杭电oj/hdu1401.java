package º¼µçoj;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class hdu1401 {

	private static HashMap<Integer, Integer> map_1;
	private static HashMap<Integer, Integer> map_2;
	private static int [][] pla = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int [][] a = new int [9][9];
			for (int i = 0; i < 8; i+= 2) {
				a[sc.nextInt()][sc.nextInt()] = 1;
			}
			a = new int [9][9];
			int s_hash = getHash(a);
			for (int i = 0; i < 8; i+=2) {
				a[sc.nextInt()][sc.nextInt()] = 1;
			}
			int e_hash = getHash(a);
			LinkedList<Node> list_1 = new LinkedList<>();
			LinkedList<Node> list_2 = new LinkedList<>();
			map_1 = new HashMap<Integer, Integer>();
			map_2 = new HashMap<Integer, Integer>();
			list_1.add(new Node(0, s_hash));
			list_2.add(new Node(0, e_hash));
			boolean sum = true;
			while (!list_1.isEmpty() || !list_2.isEmpty()) {
				if (!list_1.isEmpty()) {
					sum = sum & bfs(list_1, 1);
				}
				if (!list_2.isEmpty()) {
					sum = sum & bfs(list_2, 2);
				}
			}
			if (sum) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
 		}
	}

	private static boolean bfs(LinkedList<Node> list, int flag) {
		// TODO Auto-generated method stub
		Node node = list.poll();
		System.out.println(flag+":  "+node.hash);
		Piece [] pieces = alsHash(node.hash);
		int [][] grp = getGrp(pieces);
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < 4; j++) {
				int next_x = pieces[i].x + pla[j][0];
				int next_y = pieces[i].y + pla[j][1];
				if (cheek(next_x, next_y)) {
					if (grp[next_x][next_y] == 1) {
						next_x += pla[j][0];
						next_y += pla[j][1];
					}
					if (cheek(next_x, next_y) && grp[next_x][next_y] != 1) {
						grp[pieces[i].x][pieces[i].y] = 0;
						grp[next_x][next_y] = 1;
						int hash = getHash(grp);
						if (map_1.get(hash) == null) {
							map_1.put(hash, node.num+1);
							map_2.put(hash, flag);
							list.add(new Node(node.num+1, hash));
						}else {
							if (flag != map_2.get(hash)) {
								return false;
							}
						}
						grp[pieces[i].x][pieces[i].y] = 1;
						grp[next_x][next_y] = 0;
					}
				}
			}
		}
		return true;
	}

	private static int getHash(int[][] grp) {
		// TODO Auto-generated method stub
		int hash = 0;
		for (int i = 1; i < grp.length; i++) {
			for (int j = 1; j < grp.length; j++) {
				if (grp[i][j] == 1) {
					hash += i;
					hash *= 10;
					hash += j;
					hash *= 10;
				}
			}
		}
		return hash/10;
	}

	private static boolean cheek(int next_x, int next_y) {
		// TODO Auto-generated method stub
		return next_x > 0 && next_x < 9 && next_y > 0 && next_y < 9;
	}

	private static int[][] getGrp(Piece[] pieces) {
		// TODO Auto-generated method stub
		int [][] arr = new int [9][9];
		for (int i = 0; i < pieces.length; i++) {
			arr[pieces[i].x][pieces[i].y] = 1;
		}
		return arr;
	}

	private static Piece[] alsHash(Integer hash) {
		// TODO Auto-generated method stub
		Piece [] pieces = new Piece[4];
		for (int i = 0; i < 4; i++) {
			int x = hash%10;
			hash /= 10;
			int y = hash%10;
			hash /= 10;
			pieces[i] = new Piece(x, y);
		}
		return pieces;
	}

}
class Node {
	public Node(int num, int hash) {
		// TODO Auto-generated constructor stub
		this.hash = hash;
		this.num = num;
	}
	Integer num;
	Integer hash;
}

class Piece{
	public Piece(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	Integer x, y;
}
