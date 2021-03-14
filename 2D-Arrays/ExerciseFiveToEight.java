import java.util.*;
import java.util.stream.Collectors;

class ExerciseFiveToEight{

	static int rowSum = 0;
	static int columnSum = 0;
	static int diagonalSum = 0;
	
	public static void main(String[] args){
		int[][] matrix = {{1,3,6}, {5,7,2}, {9,12,4}};
		int[][] matrix2 = {{1,3,6}, {5,4,1}, {2,3,5}};
		int[][] matrix3 = {{1,4,3}, {2,0,2}, {4,3,2}, {1,1,1}};
		int[][] matrix4 = {{2,7,6}, {9,5,1}, {4,3,8}};

		System.out.println("\nMatrix 1:");
		for(int i = 0; i < matrix.length; i++){
			System.out.println(Arrays.toString(matrix[i]));
		}

		System.out.println("\nMatrix 2:");
		for(int i = 0; i < matrix2.length; i++){
			System.out.println(Arrays.toString(matrix2[i]));
		}

		System.out.println("\nMatrix 3:");
		for(int i = 0; i < matrix3.length; i++){
			System.out.println(Arrays.toString(matrix3[i]));
		}

		System.out.println("\nMatrix 4:");
		for(int i = 0; i < matrix4.length; i++){
			System.out.println(Arrays.toString(matrix4[i]));
		}

		//Exercise 5: write a method that checks if the array is row-magic (this means that every row has the same row sum).
		System.out.println("Does matrix1 have row magic: " + checkForRowMagic(matrix));
		System.out.println("Does matrix2 have row magic: " + checkForRowMagic(matrix3));
		System.out.println("Does matrix3 have row magic: " + checkForRowMagic(matrix2) + "\n");

		//Exercise 6: write a method that checks if the array is column-magic (this means that every column has the same column sum).
		System.out.println("Does matrix1 have column magic: " + checkForColumnMagic(matrix));
		System.out.println("Does matrix2 have column magic: " + checkForColumnMagic(matrix2));
		System.out.println("Does matrix3 have column magic: " + checkForColumnMagic(matrix3) +"\n");

		//Exercise 7: write a method that checks if the array is square (i.e. every row has the same length as a itself).
		System.out.println("Is matrix1 a square matrix: " + isSquareMatrix(matrix));
		System.out.println("Is matrix2 a square matrix: " + isSquareMatrix(matrix2));
		System.out.println("Is matrix3 a square matrix: " + isSquareMatrix(matrix3) +"\n");

		//Exercise 8: write a method that checks if the array is a magic square. This means that it must be square, and that all row sums, all column sums, and the two diagonal-sums must all be equal.
		System.out.println("Is matrix1 a magic square: " + isMagixSquare(matrix));
		System.out.println("Is matrix2 a magic square: " + isMagixSquare(matrix2));
		System.out.println("Is matrix3 a magic square: " + isMagixSquare(matrix3));
		System.out.println("Is matrix4 a magic square: " + isMagixSquare(matrix4) +"\n");
	}


	public static boolean checkForRowMagic(int[][] matrix){
		int rowMagic = 0;
		for(int i = 0; i < matrix.length; i++){
			int sum = 0;
			for(int j = 0; j < matrix[i].length; j++){
				sum+= matrix[i][j];
			}
			if(i==0){
				rowMagic = sum;
			}else{
				if(sum != rowMagic){
					return false;
				}
			}
		}
		rowSum = rowMagic;
		return true;
	}


	public static boolean checkForColumnMagic(int[][] matrix){
		int columnMagic = 0;
		int numberOfColumns = Arrays.stream(matrix).max((a,b) -> a.length - b.length).get().length;
		for(int i = 0;i < numberOfColumns; i++){
			//check if column exists
			int sum = 0;
			for(int j = 0; j < matrix.length;j++){
				if(i <= matrix[j].length-1){
					// System.out.println(matrix[j][i]);
					sum += matrix[j][i];
				}
			}
			// System.out.println("Sum:" + sum);
			if(i==0){
				columnMagic = sum;
			}else{
				if(sum != columnMagic){
					return false;
				}
			}
		}
		columnSum = columnMagic;
		return true;
	}

	public static boolean checkForDiagonalMagic(int[][] matrix){
		int sum = 0;
		for(int i = 0; i < matrix.length; i++){
			sum += matrix[i][i];
		}
		int sum2 = 0;
		for(int i = 0; i < matrix.length; i++){
			sum2 += matrix[i][matrix.length-i-1];
		}
		if(sum == sum2){
			diagonalSum = sum;
			return true;
		}else{
			return false;
		}
	}

	public static boolean isSquareMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i].length != matrix.length){
				return false;
			}
		}
		return true;
	}

	public static boolean isMagixSquare(int[][] matrix){
		if(!isSquareMatrix(matrix)){
			return false;
		}
		if(!checkForColumnMagic(matrix)){
			return false;
		}
		if(!checkForRowMagic(matrix)){
			return false;
		}
		int sum = 0;
		if(rowSum==columnSum){
			sum = rowSum;
		}

		if(!checkForDiagonalMagic(matrix)){
			return false;
		}

		if(sum != diagonalSum){
			return false;
		}

		return true;



	}

}