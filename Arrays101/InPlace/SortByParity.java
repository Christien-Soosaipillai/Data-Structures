import java.util.*;

class SortByParity{
	public static void main(String[] args){
		int[] nums1 = new int[]{3,1,2,4};
		int[] nums2 = new int[]{17,0,2,4,5,1};
		System.out.println("Before: "+ Arrays.toString(nums1));
		paritySort(nums1);
		System.out.println("After: "+ Arrays.toString(nums1));		
		System.out.println("Before: "+ Arrays.toString(nums2));
		paritySort(nums2);
		System.out.println("After: "+ Arrays.toString(nums2));
	}

	public static void paritySort(int[] arr){
		int i=0,j=0;
		while(j<arr.length){
			if(arr[j]%2 == 0){
				swap(i++,j++,arr);
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