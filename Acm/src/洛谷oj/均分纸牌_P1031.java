package ���oj;


import java.util.Scanner;

public class ����ֽ��_P1031 {

    private static int[] arr;
    private static int sum;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            arr = new int [n];
            int ans = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                ans += arr[i];
            }
            ans /= n;
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < ans) {
                    //System.out.println("�ҵ�ǰ�ǵ�"+i+"��ʯ��");
                    dfs(i, ans);
                }else if (arr[i] > ans) {
                    sum ++;
                    arr[i+1] += arr[i]-ans;
                }
            }
            System.out.println(sum);
        }
    }

    private static void dfs(int idx, int ans) {
        // TODO Auto-generated method stub
        int need = ans-arr[idx];
        //System.out.println("     �ҵ�ǰ��"+arr[idx]+"��ʯ��      ");
        if (arr[idx+1] - need >= ans) {
            arr[idx+1] -= need;
            arr[idx] = ans;
        }else {
            arr[idx+1] -= need;
            dfs(idx+1, ans);
            arr[idx] = ans;
        }
        sum ++;
    }

}
