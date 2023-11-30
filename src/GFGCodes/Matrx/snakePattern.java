package GFGCodes.Matrx;
//Print a matrix in snake pattern where one row from start to end and another from end to start. 

public class snakePattern {
	static int R = 4, C = 4;
	public static void printSnakePattern(int[][] mat) {
		for (int i = 0; i <R; i++) {
			if (i%2 == 0) {
				for (int j = 0; j < C; j++) 
					System.out.print(mat[i][j]+" ");
			}
			else {
				for (int j = C - 1; j >= 0; j--) 
					System.out.print(mat[i][j]+" ");
			}
			
		}
	}

	public static void main(String[] args) {
		 int arr[][] = {{1, 2, 3, 4},
				   {5, 6, 7, 8},
				   {9, 10, 11, 12},
				   {13, 14, 15, 16}};
		 printSnakePattern(arr);
	}

}
