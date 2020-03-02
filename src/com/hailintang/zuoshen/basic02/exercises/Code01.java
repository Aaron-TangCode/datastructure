package hailintang.zuoshen.basic02.exercises;

import java.util.Scanner;

/**
 * @Description TODO
 * @Date 2019/12/29 21:06
 * @Created Hailin.Tang
 */
public class Code01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for (int i=0;i<num;i++){
                arr[i] = scanner.nextInt();
            }
            int order = scanner.nextInt();
            megerSort(arr,order);
            print(arr);
        }
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void megerSort(int[] arr, int order) {
        if(arr==null){
            return;
        }
        int L = 0;
        int R = arr.length-1;
        megerSort(arr,L,R,order);
    }

    private static void megerSort(int[] arr, int l, int r, int order) {
        if(l==r){
            return;
        }
        int mid = l+((r-l)>>1);
        megerSort(arr,l,mid,order);
        megerSort(arr,mid+1,r,order);
        merge(arr,l,r,mid,order);
    }

    private static void merge(int[] arr, int l, int r, int mid,int order) {
        int[] help = new int[r-l+1];
        int i = 0;//help数组的索引
        int p1 = l;
        int p2 = mid+1;
        if(order==0){
            while(p1<=mid&&p2<=r){
                if(arr[p1]<arr[p2]){
                    help[i++] = arr[p1++];
                }else{
                    help[i++] = arr[p2++];
                }
            }

        }else{
            while(p1<=mid&&p2<=r){
                if(arr[p1]>arr[p2]){
                    help[i++] = arr[p1++];
                }else{
                    help[i++] = arr[p2++];
                }
            }
        }
        while(p1<=mid){
            help[i++] = arr[p1++];
        }
        while(p2<=r){
            help[i++] = arr[p2++];
        }
        for (int k=0;k<help.length;k++){
            arr[l+k] = help[k];
        }
    }
}
