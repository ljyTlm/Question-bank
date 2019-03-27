package ����oj;

import java.util.*;
public class hdu1711 {
    public static int n;
    public static int m;
    public static int [] a;
    public static int [] b;
    public static int [] next;
    /**
    *   hdu1711 kmpģ����
    *   ���� ���������� �ҵڶ��������ڵ�һ�������һ�γ��ֵ�λ��
    *   java���õķ���A����ȥ�����
    */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t; i ++){
            n = sc.nextInt();
            m = sc.nextInt();
            a = new int [n];
            b = new int [m];
            for(int j = 0;j < n;j ++){
                a[j] = sc.nextInt();
            }
            for(int j = 0;j < m;j++){
                b[j] = sc.nextInt();
            }
            getNext1();
            int sum = kmp();
            System.out.println(sum == -1?-1:sum-m+1);
        }
    }
    //�˷��������Ѿ�Ū�õ�next������������ַ�����ƥ��
    //Ҳ����kmp�㷨
    public static int kmp() {
        int index_a = 0;//�ַ���a���±�
        int index_b = 0;//�ַ���b���±�
        while(index_a < n){
            if(index_b == -1 || a[index_a] == b[index_b]){
                //�� index_b = -1 ʱ ˵��ƥ��ʧ��Ҫ��b�ַ�����һ���ַ����¿�ʼƥ��
                //�� �����ַ����ʱ �ǲ��������++ ƥ����һ��������
                index_a ++;
                index_b ++;
            }else{
                //����������������߼�����һ��ƥ���b�ַ������Ǹ��ַ���ʼƥ��
                //������������next���������ֵ
                //ΪʲôҪ��kmp�㷨�� ������仰��
                //ƥ���ʱ���Ҳ���ÿ��ƥ��ʧ���Ҷ���b�ַ����ĵ�һ��λ�ÿ�ʼƥ��
                //���˷�ʱ�� ���Ծʹ���һ��ƥ��õĵط���ʼƥ����� 
                //��ô��һ��ƥ��õĵط��������أ�
                //����next�������� ���Ե��µ�������ôд
                index_b =next[index_b];
            }
            if(index_b == m){
                //��index_b == m Ҳ���������ַ�������� 
                //��ô��ʱindex_a �����ַ���b���ַ���a�е�һ�γ��ֵ�ĩβλ��
                return index_a;
            }
        }
        return -1;
    }
    
    private static void getNext1() {
		// TODO Auto-generated method stub
    	next = new int [b.length];
		next[0] = -1;
		for (int i = 1; i < next.length; i++) {
			int v = next[i-1];
			int max = 0;
			while (v != -1) {
				if (b[i-1] == b[v]) {
					max = max > v+1 ? max : v+1;
					break;
				}
				v = next[v];
			}
			next[i] = max;
		}
	}
    
    //�˷����ǻ��next����
    public static void getNext(){
        next = new int [n+1];
        int index = 0; //���ǳ�ʼ���±�
        int value = -1;//��ʼ����תֵ ���ֵ������-1 �Ժ�����Ϊʲô��-1
        next[0] = -1;  //
        while(index < m){ //�±��0��ʼҪС���ַ������ܳ���
            if(value == -1 || b[index] == b[value]){
                //��value=-1��ʾ��index����Ӧ���ַ���β�������ͬ�Ӵ�����Ϊ0
                //��b[index] = b[value] ��ʾ��index����Ӧ���ַ���β�������ͬ�Ӵ�������ԭ�ȵĻ����ϼ�1
                index ++;//ƥ����һ��
                value ++;//ƥ����һ��
                next[index] = value; //������Ӧ����תֵ
            }else{
                //�����������������������ʱ��
                //Ҫ���л���ƥ��
                //ΪʲôҪ�����أ�
                //��Ϊ��ƥ��������ַ�����ȵ�ʱ��
                //��ʱindex�±��Ӧnextֵ��Ҳ���������ͬ�Ӵ����ȣ���һ��Ϊ0
                //��Ϊ����� �����㲻��ֱ����ԭ�����ϼ�1Ҳ����ֱ�Ӹ���0
                //��Ҫ��ʲô�أ�
                //���Խ�����Ҫ���л���ƥ��
                //��ȻҪ������Ϊʲôд��������������أ�
                //��Ϊ��Ҫƥ�������ͬ�Ӵ� Ҳ���ǹ������ַ�����ǲ��е� 
                //��Ϊ���������ַ�ǰ��Ĵ���һ����ͬ 
                //��ô�ڽ��л��˱Ƚ������ַ�֮ǰ(Ҳ���������if���) 
                //��ñ�֤�������ַ�ǰ��Ĵ���һ���� ��Ȼ��ıȽ�û�����尡
                //��ô����ô���ܱ�֤�������ַ�ǰ��Ĵ���һ�����أ�
                //���ǵ�next�����ʲô��
                //next�����ľ�����󳤶ȵ�ֵnext�����ľ�����󳤶ȵ�ֵ 
                //���ֵ�ж����ô��ͬ���Ӵ����ж೤
                //����next[value] Ҳ��������Ҫ���� ���������ƥ���λ��
                
                //���������һ��Ϊʲô��ʼֵ��-1
                //�����else�����������Ҫ���еĻ��˲���
                //���Ҳ���һֱ���˰� �˵���һ���ַ��Ͳ���������
                //���� value�ĳ�ʼֵ��next��0����ֵ��ͬ��
                //��Ϊʲô��-1�أ�
                //��Ϊ �ַ�һ��һ��ƥ����������е�һ����++���� ��ʼֵ�ٽ���++��������0 ��Ҫд���ֵ���䲻��0 next�����ľͲ�������Ҫ��ֵ
                value = next[value]; 
            }
        }
    }
}