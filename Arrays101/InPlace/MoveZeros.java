import java.util.*;

class MoveZeros{
	public static void main(String[] args){
		int[] nums1 = new int[]{0,1,0,3,12};
		int[] nums2 = new int[]{17,0,0,4,0,1};
		System.out.println("Before: "+ Arrays.toString(nums1));
		moveZerosToEnd(nums1);
		System.out.println("After: "+ Arrays.toString(nums1));		
		System.out.println("Before: "+ Arrays.toString(nums2));
		moveZerosToEnd(nums2);
		System.out.println("After: "+ Arrays.toString(nums2));		
		System.out.println(Arrays.toString(Arrays.stream(nums2).limit(3).sorted().toArray()));		//Experimenting
	}

	public static void moveZerosToEnd(int[] arr){
		int i=0, j=0;
		while(j<arr.length){
			if(arr[j]!=0){
				swap(i++,j++, arr);
			}else{
				j++;
			}
		}
	}

	public static void swap(int i, int j, int[] arr){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}