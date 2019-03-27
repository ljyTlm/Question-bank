package ����oj;

import java.util.ArrayList;
import java.util.Scanner;


public class hdu2063 {

	private static ArrayList[] girl;
	private static int[] girlFriend;
	private static boolean[] flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int k = sc.nextInt();
			if (k == 0) {
				return;
			}
			int m = sc.nextInt(); //Ů��������
			int n = sc.nextInt(); //����������
			girl = new ArrayList [m+1];
			for (int i = 0; i < girl.length; i++) {
				girl[i] = new ArrayList<Integer>();
			}
			for (int i = 0; i < k; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				//��ʾ Ů��a ��� ����b һ����
				girl[a].add(b);
			}
			//--------����������� ��ʼʵ���㷨
			//����ֻ��Ҫ֪��ÿ��������Ů������˭
			girlFriend = new int [n+1];
			//������ ����Ҫ��ÿ��Ů���������� ͬʱ��¼����ƥ�����
			int max = 0;
			for (int i = 1; i < girl.length; i++) {
				//������Ů�����ҵ������� ��ô ����ƥ�������Ҫ��ԭ���Ļ�����+1
				//�ҵ������Ѿͷ���1 �Ҳ����ͷ���0
				flag = new boolean [n+1];
				max += find(i);
			}
			System.out.println(max);
		}
	}

	private static int find(int i) {
		// ���������ʲô�أ�
		//����������Ĺ����Ǹ�ָ����ŵ�Ů����������
		for (int j = 0; j < girl[i].size(); j++) {
			//��ô��˭�أ�  �������� ��Ҫ�������ŵ�Ů��ϲ������˭
			//����������û��Ů���� ��ôֱ��ƥ���һ�� �ͺ���
			//��Ϊ������� 
			//1.�������û��Ů����
			//2.���������Ů����
			//���ող��ߵ����̷��� �����޵ݹ鿨������ ԭ����֮ǰ��·����û�б���ǵ� �����޵��ظ���
			//����������Ҫ�� һ��ƥ�����̽��б�� ����Ҫһ���ط�������ֵ
			int boy = (int)girl[i].get(j);
			if (flag[boy]) { //��ʼ����ʱ�� ��������ȫ�Ǽ� �������Ϊһ����û�б��
				continue;
			}
			flag[boy] = true; //������Ҫ����������������� ���������ڰ�����ǵ�
			if (girlFriend[boy] == 0 || find(girlFriend[boy]) == 1) {
				girlFriend[(int)girl[i].get(j)] = i;
				return 1;
			}
		}
		return 0;
	}

}
