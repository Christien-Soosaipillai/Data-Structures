import java.util.*

class MergeSortedArrays{
	public static void main(String[] args){

		int[] nums1 = new int[]{1,2,3,0,0,0};		//{4,5,6,0,0,0}
		int m = 3;	
		int[] nums2 = new int[]{2,5,6};				//{1,1,5}
		int n = 3;
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n){
		while(m > 0 && n > 0){
			if(nums1[m-1] > nums2[n-1]){
				nums1[m+n-1] = nums1[m-1];
				m--;
			}else{
				nums1[m+n-1] = nums2[n-1];
				n--;
			}
		}

		//The reason why we only iterate through the remainder of "n" is because
		//regardless of the values we will enter in for arrays m's index values are
		//already in place therefore we dont have to iterate through m since we dont
		//have to move m's values
		while(n > 0){
            nums1[n-1] = nums2[n-1];
            n--;
        }
	} 
}