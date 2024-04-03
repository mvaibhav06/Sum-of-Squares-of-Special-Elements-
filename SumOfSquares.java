public class SumOfSquares {
    public int sumOfSquares(int[] nums) {

        int sum = 0;
        int len = nums.length;

        for(int i=1; i<=len; i++){
            if(len%i==0){
                sum += nums[i-1]*nums[i-1];
            }
        }
        return sum;
    }
}
