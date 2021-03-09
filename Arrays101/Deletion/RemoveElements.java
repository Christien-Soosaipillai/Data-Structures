import java.util.*;

class RemoveElements{
	public static void main(String[] args){
		int[] nums1 = new int[]{0,1,2,2,3,0,4,2};
		int[] nums2 = new int[]{3,2,2,3};
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		int limit1 = removeElement(2, nums1);
		int limit2 = removeElement(3, nums2);
		Arrays.stream(nums1).limit(limit1).forEach(i->System.out.print(i+" "));
		System.out.println();
		Arrays.stream(nums2).limit(limit2).forEach(i->System.out.print(i+" "));
		System.out.println();
		
	}

	public static int removeElement(int val, int arr[]){
		int i = 0, j = 0;
		while(j < arr.length){
			if(arr[j]!=val){
				swap(i++, j++, arr);
			}else{
				j++;
			}
		}
		return i;
	}

	public static void swap(int i, int j, int[] arr){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}