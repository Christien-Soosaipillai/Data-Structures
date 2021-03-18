import java.util.*;

class ExerciseNineToTen{
	public static void main(String[] args){
		int[][] matrix = {{1,3,6}, {5,7,2}, {9,12,4}};
		int[][] matrix2 = {{1,3,6}, {5,4,1}, {2,3,5}};
		int[][] matrix3 = {{1,2,3,4}, {4,1,2,3}, {3,4,1,2}, {2,3,4,1}};
		int[][] matrix4 = {{1,2,3}, {3,1,2}, {2,3,1}};
		int[][] matrix5 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrix6 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

		System.out.println("\nMatrix 1:");	
		for(int i = 0; i < matrix.length;i++){
			System.out.println(Arrays.toString(matrix[i]));
		}

		System.out.println("\nMatrix 2:");	
		for(int i = 0; i < matrix2.length;i++){
			System.out.println(Arrays.toString(matrix2[i]));
		}

		System.out.println("\nMatrix 3:");	
		for(int i = 0; i < matrix3.length;i++){
			System.out.println(Arrays.toString(matrix3[i]));
		}

		System.out.println("\nMatrix 4:");	
		for(int i = 0; i < matrix4.length;i++){
			System.out.println(Arrays.toString(matrix4[i]));
		}

		System.out.println("\nMatrix 5:");	
		for(int i = 0; i < matrix5.length;i++){
			System.out.println(Arrays.toString(matrix5[i]));
		}

		System.out.println("\nMatrix 6:");	
		for(int i = 0; i < matrix6.length;i++){
			System.out.println(Arrays.toString(matrix6[i]));
		}

		//Exercise9: write a method that checks to see if the array is a Latin square.This means that it must be square (suppose it is n x n), and that each row and each column must contain the values 1, 2, ..., n with no repeats
		System.out.println("\nIs matrix1 a latin matrix: " + isLatin(matrix));
		System.out.println("Is matrix2 a latin matrix: " + isLatin(matrix2));
		System.out.println("Is matrix3 a latin matrix: " + isLatin(matrix3));
		System.out.println("Is matrix4 a latin matrix: " + isLatin(matrix4));
		System.out.println("Is matrix5 a latin matrix: " + isLatin(matrix5));
		System.out.println("Is matrix6 a latin matrix: " + isLatin(matrix6));

		//Exercise10: write a method that checks to see if the array is square (suppose it is n x n), and contains each of the digits from 1 to n*n, eg. 1, 2, ..., 16 for a 4 x 4 array.
		System.out.println("\nIs matrix1 a square: " + isASquare(matrix));
		System.out.println("Is matrix2 a square: " + isASquare(matrix2));
		System.out.println("Is matrix3 a square: " + isASquare(matrix3));
		System.out.println("Is matrix4 a square: " + isASquare(matrix4));
		System.out.println("Is matrix5 a square: " + isASquare(matrix5));
		System.out.println("Is matrix6 a square: " + isASquare(matrix6));
	}

	public static boolean isSquareMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i].length != matrix.length){
				return false;
			}
		}
		return true;
	}

	public static boolean isLatin(int[][] matrix){
		if(!isSquareMatrix(matrix)){
			return false;
		}

		int n = getTriangleNum(matrix.length);

		//check my row 
		for(int i = 0; i < matrix.length; i++){
			HashSet<Integer> distinctRowSet = new HashSet<>();
			HashSet<Integer> distinctColumnSet = new HashSet<>();
			for(int j = 0; j < matrix[i].length; j++){
				distinctRowSet.add(matrix[i][j]);
				distinctColumnSet.add(matrix[j][i]);
			}
			//check distinct
			if(matrix[i].length != distinctRowSet.size() || matrix[i].length != distinctColumnSet.size() ){
				return false;
			}

			//check if values are distinct within range of 0-n(nth triangle #)
			int rowSum = distinctRowSet.stream().mapToInt(Integer::intValue).sum();
			int columnSum = distinctColumnSet.stream().mapToInt(Integer::intValue).sum();
			if(columnSum != n || rowSum != n){
				return false;
			}
		}
		return true;	
	}


	public static boolean isASquare(int[][] matrix){
		if(!isSquareMatrix(matrix)){
			return false;
		}

		HashSet<Integer> set = new HashSet<>();
		int n = getTriangleNum(matrix.length*matrix.length);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				set.add(matrix[i][j]);
			}
		}
		int matrixSum = set.stream().mapToInt(Integer::intValue).sum();
		if(matrixSum != n){
			return false;
		}
		return true;

	}

	public static int getTriangleNum(int n){
		return n != 1 ? (n) + getTriangleNum(n-1) : 1;
	}



}