package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ËãÊıÔËËã {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			System.out.println(n+"+"+m+"="+(n+m));
			System.out.println(n+"-"+m+"="+(n-m));
			System.out.println(n+"*"+m+"="+(n*m));
			System.out.println(n+"/"+m+"="+(n/m));
		}
	}

}
