package ����oj;

import java.util.LinkedList;
import java.util.Scanner;

public class hdu3549 {

	private static int[][] graph;
	private static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			n = sc.nextInt();
			int m = sc.nextInt();
			graph = new int [n+1][n+1]; //����ͼ�����ÿ����֮�� ���ӵĴ�ϸ
			for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int c = sc.nextInt();
				graph[x][y] += c;
			}
			//-----����¼����� ��ʼ��д�㷨
			//��������һ������ ������·��     
			//���壺��������һ�� ����㵽�յ���С������0 ������Ϊ����·���ǿ������ ���ǰ�����������·��
			//��������Ҫ��������ʵ���Ͼ������кϷ�������·������С��֮��
			//��ô���� ���Ǿ�����һ����������˼· ���Ǵ�����Ȼ���¼��·���ϵ���Сֵ ��������·�������
			//������ʵ�ʵ�ʵ�ֹ����� ����һ�����ص����� ������Դ�˷� ��������ֵ ����������
			//������һ�����ʣ������
			//���� �������a--->b ������ c b--->a ������ d �������a��b��������·�����õ���e ��ô����� �� b--->a �� ����d+e
			//����ߵ����þ��� ��֮ǰ�߹���·�߿��Է��ڵĻ��� �ҵ���������һ���߹������ˮ����һ�ε�ˮ����ȥ��
			int sum = 0;
			while (true) {
				int value = find();
				if (value == 0) {
					break;
				}
				sum += value;
			}
			System.out.println("Case "+i+": "+sum);
		}
	}

	private static int find() {
		//���������������Ѱ������·��
		LinkedList<Integer> qu = new LinkedList<>();
		qu.push(1); //��1�ŵ㿪ʼ��
		int value = Integer.MAX_VALUE;
		int [] flag = new int [n+1];//�������� �������Ǳ�� ��ǰ�±�ĵ����һ������˭
		while (!qu.isEmpty()) {
			Integer idx = qu.pop();
			if (idx  == n) {
				break;
			}
			for (int i = 1; i < graph.length; i++) {
				if (graph[idx][i] > 0 && flag[i] == 0) {  //����������1.������ 2.û�б����
					value = Math.min(value, graph[idx][i]); //���ҵ���ȫ����С����ÿ��·���϶����������ֵ
					qu.push(i);
					flag[i] = idx;
				}
			}
		}
		if (flag[n] == 0) {
			return 0;
		}
		//�������������
		int idx = n;
		while (idx != 1) {
			graph[flag[idx]][idx] -= value;//ͨ������ �ܵ���ռ��
			graph[idx][flag[idx]] += value;//��������� ��֤�㷨����ȷ��
			idx = flag[idx];
		}
		return value;
	}

}
