package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ½øÖÆ×ª»» {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			System.out.print(Integer.toHexString(Integer.valueOf(a,16)).toUpperCase()+" ");
			System.out.print(Integer.valueOf(a,16)+" ");
			System.out.println(Integer.toOctalString(Integer.valueOf(a,16)));
		}
	}

}
