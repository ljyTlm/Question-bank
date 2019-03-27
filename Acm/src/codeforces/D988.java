package codeforces;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;

public class D988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		HashSet<Integer> map = new HashSet<>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
			map.add(arr[i]);
		}
		ArrayList<Integer> sum = new ArrayList<>();
		for (int i = 0; i < arr.length && sum.size() != 3; i++) {
			int k = 1;
			ArrayList<Integer> list = new ArrayList<>();
			list.add(arr[i]);
			while (arr[i]+k <= max) {
				int v = k + arr[i];
				if (map.contains(v)) {
					list.add(v);
					if (map.contains(v+k)) {
						list.add(v+k);
					}
					break;
				}
				k *= 2;
			}
			if (list.size() >= sum.size()) {
				sum = list;
			}
		}
		System.out.println(sum.size());
		for (int i = 0; i < sum.size(); i++) {
			System.out.print(i == 0 ? sum.get(i) : " " + sum.get(i));
		}System.out.println();
	}
	static class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}
