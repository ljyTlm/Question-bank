package codeforces;
import java.util.Scanner;

public class B987 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			//��⣺ ��x��y���� ��y��x���ݱȽϴ�С
			//      �ȼ���x��y���� �ڿ�x�η� Ȼ���y�Ƚ�
			//      ���ݼ��㹫ʽ x��y/x == x^y �ڿ�x��
			//      ��Ϊy/x�������� ���Լ��������С
			Double x = sc.nextDouble();
			Double y = sc.nextDouble();
			Double v = Math.pow(x, y/x);
			if (v - y == 0)System.out.println("=");
			if (v > y) System.out.println(">");
			if (v < y) System.out.println("<");
		}
	}

}
