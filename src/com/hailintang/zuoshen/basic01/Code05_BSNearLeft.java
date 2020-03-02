package hailintang.zuoshen.basic01;

/**
 * @Description TODO
 * @Date 2019/12/29 15:40
 * @Created Hailin.Tang
 */
public class Code05_BSNearLeft {
    public static int biggerThan(int[] arr,int key){
        if(arr==null||arr.length==0){
            return -1;
        }
        int left = 0;
        int right = arr.length-1;
        int index = -1;
        while(left!=right){
            int mid = left+((right-left)>>1);
            if(arr[mid]==key){
                index = mid;
                right = mid;
            }else if(key>arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,3,3,4,5,6,7};
        System.out.println(biggerThan(arr, 3));
    }
}
