import java.util.*;

class CheckForNAndDouble{
	public static void main(String[] args){
		int[] nums1 = new int[]{10,2,5,3};
		int[] nums2 = new int[]{7,1,14,11};
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		System.out.println("Does double exist for "+ Arrays.toString(nums1)+ ": " + checkForDouble(nums1));		
		System.out.println("Does double exist for "+ Arrays.toString(nums2)+ ": " + checkForDouble(nums2));		

	}

	public static boolean checkForDouble(int[] arr){
		for(int i= 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] * 2 == arr[j] || arr[j] * 2 == arr[i]){
                    return true;
                }
            }
        }
        return false;
	}

}