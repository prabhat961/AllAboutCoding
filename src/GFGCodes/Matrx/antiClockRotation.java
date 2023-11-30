package GFGCodes.Matrx;

public class antiClockRotation {
	static int n = 4;

	static void rotate90Naive(int mat[][]){
		int temp[][] = new int[n][n];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				temp[n - j - 1][i] = mat[i][j];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = temp[i][j];

	}
	
	static void rotate90Optimal(int mat[][]){
		int temp[][] = new int[n][n];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				temp[n - j - 1][i] = mat[i][j];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = temp[i][j];

	}
	
	
	

	public static void main(String[] args) {
		 int arr[][] = {{1, 2, 3, 4},
				   {5, 6, 7, 8},
				   {9, 10, 11, 12},
				   {13, 14, 15, 16}};

		 rotate90Naive(arr);

	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}	

	}

}
