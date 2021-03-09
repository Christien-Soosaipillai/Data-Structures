import java.util.*;

class SortedSquaredNumbers{
	public static void main(String[] args){
		int[] arr = new int[]{-5,-2,0,1,4,5};
		System.out.println(Arrays.toString(sortAndSquareNums(arr)));

	}

	public static int[] sortAndSquareNums(int[] arr){
		return Arrays.stream(arr).map(i->i*i).sorted().toArray();
	}
}