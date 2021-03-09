import java.util.*;

class DuplicateZerosInArray{
	public static void main(String[] args){
		int[] array = new int[]{1,0,3,4,0,5,4};
		System.out.println("Before Duplicating: " + Arrays.toString(array));
		System.out.println("After Duplicating: " + Arrays.toString(duplicateZeros(array)));
	}

	public static int[] duplicateZeros(int[] nums){
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 0){
				for(int j = nums.length-1; j > i; j--){
					nums[j] = nums[j-1];
				}
				i++;
			}
		}
		return nums;
	}
}