import java.util.*;

class EvenNumbersOfDigits{
	public static void main(String[] args){
		int[] array = new int[]{1001,510,356,107};
		System.out.println("The amount of event digits numbers is: " + findNumbers(array));
	}

	public static int findNumbers(int[] nums){
		return (int) Arrays.stream(nums).filter(i->Integer.toString(i).length()%2==0).count();
	}
}