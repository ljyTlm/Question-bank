package ����oj;

import java.util.Scanner;

public class hdu6849 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			int n = sc.nextInt();
			int [] arr = new int[n+1];
			int [] pla = new int[n+1];
			for (int i = 1; i < arr.length; i++) {
				pla[i] = sc.nextInt(); //�ڼ���λ���� ��˭
				arr[pla[i]] = i;  //���ŵ� ��ԭ�����λ��
			}
			int ans = 0;
			for (int i = 1; i < pla.length; i++) {
				if(pla[i] != i) { //1��λ���ϲ���1
					ans ++; //���뽻��
					pla[arr[i]] = pla[i];
					arr[pla[i]] = arr[i];
				}
			}
			System.out.println(ans);
		}
	}

}
