import java.util.*;

class TwoDimensionalTutorial{
	public static void main(String[] args){
		int[][] gridInfo = {{1,3,6}, {5,7,2}, {9,12,4}};
		for(int i = 0; i < gridInfo.length; i++){
			System.out.println(Arrays.toString(gridInfo[i]));
		}

		//Printing values row by row starting left going right					
		System.out.println("\nPrint by row going left to right");
		for(int row = 0; row < gridInfo.length; row++){
			for(int column = 0; column < gridInfo[row].length; column++){
				System.out.print(gridInfo[row][column] + ",");
			}
		}

		//Printing values row by row going backwards
		System.out.println("\nPrint row by row backwards");
		for(int i = gridInfo.length-1; i >= 0; i--){
			for(int j = gridInfo[i].length-1; j >= 0; j--){
				System.out.print(gridInfo[i][j] + ",");
			}
		}

		//printing values column by column starting left side at top going down
		System.out.println("\nPrint by column going top to bottom");
		for(int j = 0; j < gridInfo[0].length; j++){
			for(int i=0;i<gridInfo.length;i++){
					System.out.print(gridInfo[i][j] + ",");
			}
		}

		//printing values by row starting right going left
		System.out.println("\nPrint by row going right to left");
		for(int i = 0; i < gridInfo.length; i++){
			for(int j = gridInfo[i].length-1; j >= 0; j--){
					System.out.print(gridInfo[i][j] + ",");
			}
		}

		//printing values by column going bottom to top
		System.out.println("\nPrint by column going bottom to top");
		for(int i = 0; i < gridInfo[0].length; i++){
			for(int j = gridInfo.length-1; j >= 0; j--){
				System.out.print(gridInfo[j][i] + ",");
			}
		}
		System.out.println();


	}
}