import java.util.*;

class HighestRightElement{
	public static void main(String[] args){
		int[] nums1 = new int[]{17,18,5,4,6,1};
		int[] nums2 = new int[]{400};
		System.out.println("Before: "+ Arrays.toString(nums1)+ ", After: " + Arrays.toString(replaceWithHeighest(nums1)));		
		System.out.println("Before: "+ Arrays.toString(nums2)+ ", After: " + Arrays.toString(replaceWithHeighest(nums2)));		

	}

	public static int[] replaceWithHeighest(int[] arr){
		int heighest = arr[arr.length-1];
		for(int i = arr.length-2; i >= 0; i--){
			int newHeighest = Math.max(arr[i], heighest);
			arr[i] = heighest;
			heighest = newHeighest;
		}
		arr[arr.length-1] = -1;
		return arr;
	}


}