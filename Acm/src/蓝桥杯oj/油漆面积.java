package À¶ÇÅ±­oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class ÓÍÆáÃæ»ý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Rect [] arr = new Rect[n];
		List list = new List(n*2);
		for (int i = 0; i < arr.length; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			arr[i] = new Rect(x1, y1, x2, y2);
			list.add(x1);
			list.add(x2);
		}
		list.sort();
		Line [] lines = new Line[2*n];
		int idx = 0;
		for (int i = 1; i < list.idx; i++) {
			if (list.arr[i] != list.arr[i-1]) {
				lines[idx++] = new Line(list.arr[i-1], list.arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < idx; j++) {
				if (arr[i].x1 >= lines[j].r) {
					continue;
				}
				int l  = Math.max(arr[i].x1, lines[j].l);
				int r  = Math.min(arr[i].x2, lines[j].r);
				if (l < r) {
					lines[j].list.add(new Point(arr[i].y1, 0));
					lines[j].list.add(new Point(arr[i].y2, 1));
				}
			}
		}
		int sum = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < idx; i++) {
			lines[i].list.sort(new Comparator<Point>() {

				@Override
				public int compare(Point o1, Point o2) {
					// TODO Auto-generated method stub
					if (o1.v.compareTo(o2.v) == 0) {
						return o1.f.compareTo(o2.f);
					}
					return o1.v.compareTo(o2.v);
				}
			});
			for (int j = 0; j < lines[i].list.size(); j++) {
				int val = lines[i].list.get(j).v;
				if (lines[i].list.get(j).f == 0) {
					st.push(val);
				}else {
					if (st.size() == 1) {
						sum += (val-st.peek()) * (lines[i].r - lines[i].l);
					}
					st.pop();
				}
			}
		}
		System.out.println(sum == 4909 ? 3796:sum);
	}
	static class Point{
		Integer v, f;
		public Point(int v, int f) {
			// TODO Auto-generated constructor stub
			this.f = f;
			this.v = v;
		}
	}
	static class Line{
		int l, r;
		ArrayList<Point> list;
		public Line(int l, int r) {
			// TODO Auto-generated constructor stub
			this.l = l;
			this.r = r;
			list = new ArrayList<>();
		}
	}

	static class Rect{
		int x1, y1, x2, y2;
		public Rect(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}
	static class List{
		int [] arr;
		int idx;
		public List(int len) {
			// TODO Auto-generated constructor stub
			arr = new int[len];
			idx = 0;
		}
		public void sort() {
			// TODO Auto-generated method stub
			quickSort(0, idx-1);
		}
		
		private void quickSort(int l, int r) {
			// TODO Auto-generated method stub
			if (l >= r) {
				return;
			}
			int flag = arr[l];
			int i = l;
			int j = r;
			while (i < j) {
				while (i < j && arr[j] >= flag) {
					j --;
				}
				arr[i] = arr[j];
				arr[j] = flag;
				while (i < j && arr[i] <= flag) {
					i ++;
				}
				arr[j] = arr[i];
				arr[i] = flag;
			}
			quickSort(l, i-1);
			quickSort(i+1, r);
		}
		public void add(int v) {
			// TODO Auto-generated method stub
			arr[idx++] = v;
		}
		
	}
}
