import java.util.*;

class MaxConsecutiveOnes{
	public static void main(String[] args){
		int[] array = new int[]{1,1,0,1,1,1};
		System.out.println("The maximum number of consecutive 1's is: " + findMaxConsecutiveOnes(array));
	}


	public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        return max;
    }

}
