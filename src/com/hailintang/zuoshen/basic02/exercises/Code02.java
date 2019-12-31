package hailintang.zuoshen.basic02.exercises;

/**
 * @Description TODO
 * @Date 2019/12/30 16:39
 * @Created Hailin.Tang
 */
public class Code02 {
    public static int findShortest(int[] A, int n) {
        int min = A[A.length-1];
        int max = A[0];
        int p1 = 0;
        int p2 = A.length-1;
        //从左往右遍历
        for(int i=1;i<A.length;i++){
            //如果max小于当前值，max=A[i]
            //如果max大于当前值，p1 = i;
            if(max<=A[i]){
                max = A[i];
            }else{
                p1 = i;
            }
        }
        //从右往左遍历
        for(int j=A.length-2;j>=0;j--){
            //如果min大于当前值，min=A[j]
            //如果min小于当前值，p2 = j
            if(min>=A[j]){
                min = A[j];
            }else{
                p2 = j;
            }
        }
        //本身就有序
        if(p1==0&&p2==A.length-1){
            return 0;
        }
        //返回结果
        return p1-p2+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,8,9};
        System.out.println(findShortest(arr, 6));
    }
}
