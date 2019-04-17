package º¼µçoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class hdu6441 {
	static StringTokenizer sc;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		p reader = new p(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			sc = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(sc.nextToken());
			int a = Integer.parseInt(sc.nextToken());
			if(n == 1) {
				System.out.println((a+1)+" "+(a+a+1));
			}else if (n == 2) {
				long k = a;
				if (a % 2 == 0) {
					long x = k*k/4 - 1;
					System.out.println(x+" "+(x+2));
				}else {
					long x = (k*k - 1) / 2;
					System.out.println(x+" "+(x+1));
				}
			}else {
				System.out.println("-1 -1");
			}
		}
	}
	static class p extends BufferedReader {

		public p(Reader in) {
			super(in);
		}
		
	}
}
