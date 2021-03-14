import java.util.*;
import java.util.stream.Collectors;


class ExerciseOneToFour{
	
	public static void main(String[] args){
		int[][] matrix = {{1,3,6}, {5,7,2}, {9,12,4}};
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		//Exercise 1: write a method that returns the maximum value in the 2d matrix.
		System.out.println("Max value of matrix: " + getMaxValue(matrix));

		//Exercise 2: write a method that returns the sum of the elements in Row x of the matrix.
		int selectedRow = 1;
		System.out.println("Sum of matrix on row " + selectedRow + ": " + getRowSum(matrix, selectedRow));

		//Exercise 3: Write a method that returns the sum of column values
		int selectedColumn = 1;
		System.out.println("Sum of matrix on column " + selectedColumn + ": " + getColumnSum(matrix, selectedColumn));

		//Exercise 4: Write a method that calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
		System.out.println("Sum of each row in matrix: " + Arrays.toString(getMatrixRowSums(matrix, selectedColumn)));
	}	

	public static int getMaxValue(int[][] matrix){
		
		//Streams way
		int heighestStreamMethod = Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().getAsInt();

		//Simple for loop
		int highest = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				highest = Math.max(highest, matrix[i][j]);
			}
		}
		return highest;
	}

	public static int getRowSum(int[][] matrix, int row){

		//Streams Way
		int sumStreamMethod = Arrays.stream(matrix[row-1]).sum(); 

		//Simple Loop
		int sum = 0;
		for(int i = 0; i < matrix[row-1].length; i++){
			sum += matrix[row-1][i];
		}
		return sum;

	}

	public static int getColumnSum(int[][] matrix, int column){

		//Streams Way
		// int sumStreamMethod = Arrays.stream(matrix[column-1]).sum(); 

		//Simple Loop
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i].length >= column){
				sum+=matrix[i][column-1];
			}
		}
		return sum;

	}

	public static int[] getMatrixRowSums(int[][] matrix, int selectedColumn){
		int[] sums = new int[3];
		for(int i = 0; i < matrix.length; i++){
			int rowSum = 0;
			for(int j = 0; j< matrix[i].length; j++){
				rowSum += matrix[i][j];
			}	
			sums[i]=rowSum;
		}

		return sums;
	}




}