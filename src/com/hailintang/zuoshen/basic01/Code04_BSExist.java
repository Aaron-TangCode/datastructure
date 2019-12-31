package hailintang.zuoshen.basic01;

/**
 * @Description TODO
 * @Date 2019/12/29 15:10
 * @Created Hailin.Tang
 */
public class Code04_BSExist {
    public static boolean exist(int[] arr,int key){
        if(arr==null||arr.length==0){
            return false;
        }
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            //中点
            int mid = left+((right-left)>>1);
            if(arr[mid]==key){
                return true;
            }else if(key>arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return arr[left]==key;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,6,7,9};
        System.out.println(exist(arr, 9));
    }
}
