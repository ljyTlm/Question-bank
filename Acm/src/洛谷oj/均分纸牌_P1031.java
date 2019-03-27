package 洛谷oj;


import java.util.Scanner;

public class 均分纸牌_P1031 {

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
                    //System.out.println("我当前是第"+i+"堆石子");
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
        //System.out.println("     我当前有"+arr[idx]+"颗石子      ");
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
