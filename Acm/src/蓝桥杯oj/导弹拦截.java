package ���ű�oj;

import java.util.ArrayList;
import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String [] str = scanner.nextLine().split(" ");
			int [] arr = new int [str.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			boolean [] flag = new boolean [arr.length];//��¼�Ѿ������صĵ���
			int max = 0;//����½������еĳ���
			int num = 0;//��Ҫ���׵���ϵͳ
			int sum = 0;//��¼������������ ��������whileѭ��
			while (sum != arr.length) { //�����е��������� �ͽ���ѭ��
				ArrayList [] lists = new ArrayList [arr.length];
				for (int i = 0; i < lists.length; i++) {
					lists[i] = new ArrayList<Integer>();
				}//��¼ÿ�������� 
				int index = 0; //��������е��±�
				int childMax = 0; //��������еĳ���
				int k = 0;
				for (int i = 0; i < arr.length; i++) {
					if (flag[i]) {
						continue;
					}
					if (k == 0) {
						k ++;
						lists[i].add(i);
						childMax = 1;
						index = i;
					}else {
						int maxLength = -1;
						int maxIndex = -1;
						for (int j = i-1; j >= 0; j--) {
							if (flag[j]) {
								continue;
							}
							if (arr[i] < arr[j]) {
								maxLength = maxLength > lists[j].size() ? maxLength : lists[j].size();
								maxIndex = maxLength > lists[j].size() ? maxIndex : j;
							}
						}
						if (maxIndex == -1) {
							lists[i].add(i);
						}else {
							for (int j = 0; j < lists[maxIndex].size(); j++) {
								lists[i].add(lists[maxIndex].get(j));
							}
							lists[i].add(i);
						}
						childMax = childMax > lists[i].size() ? childMax : lists[i].size();
						index = childMax > lists[i].size() ? index : i;
					}
				}
				for (int i = 0; i < lists[index].size(); i++) {
					flag[(int) lists[index].get(i)] = true;
				}
				max = max > childMax ? max : childMax;
				num ++;
				sum += childMax;
			}
			System.out.println(max + "\n" + num);
		}
	}

}
