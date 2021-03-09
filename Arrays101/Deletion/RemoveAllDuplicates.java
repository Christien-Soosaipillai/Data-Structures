import java.util.*;

class RemoveAllDuplicates{
	public static void main(String[] args){
		int[] nums1 = new int[]{1,2,2};
		int[] nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		int limit1 = removeDuplicates(nums1);
		int limit2 = removeDuplicates(nums2);
		Arrays.stream(nums1).limit(limit1).forEach(i->System.out.print(i+" "));
		System.out.println();
		Arrays.stream(nums2).limit(limit2).forEach(i->System.out.print(i+" "));
		System.out.println();
	}

	public static int removeDuplicates(int[] arr){
		int i=0, j=0;
		while(j<arr.length){
			if(arr[i]!=arr[j]){
				swap(++i,j++,arr);
			}else{
				j++;
			}
		}
		return i+1;
	}

	public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}