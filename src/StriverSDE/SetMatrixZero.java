package StriverSDE;

public class SetMatrixZero {
	public void setZeroes(int[][] matrix) {
        
		/*
		 * brute force strategy: 
		 * convert the non-zero elements of the row and column with 0 to -1.
		 * Later convert the -1 to 0.
		 */
		
//		//iterate over the entire 2D array to convert to -1.
//		for(int row=0; row < matrix.length; row++) {
//			for(int col=0; col < matrix[0].length; col++) {
//				
//				if(matrix[row][col] == 0) {
//					markRow(row, matrix);
//					markCol(col, matrix);
//				}
//			}
//		}
//		
//		//iterate over entire 2D array to convert -1 to 0.
//		for(int row=0; row < matrix.length; row++) {
//			for(int col=0; col < matrix[0].length; col++) {
//				
//				if(matrix[row][col] == -1) {
//					matrix[row][col] = 0;
//				}
//				System.out.print(matrix[row][col] + ",");
//			}
//			System.out.println();
//		}
//		
//
//    }
//	
//	void markRow(int row, int[][] matrix) {
//		for(int col=0; col<matrix[0].length; col++) {
//			if(matrix[row][col] != 0) {
//				matrix[row][col] = -1;
//			}
//		}
//	}
//	
//	void markCol(int col, int[][] matrix) {
//		for(int row=0; row<matrix.length; row++) {
//			if(matrix[row][col] != 0) {
//				matrix[row][col] = -1;
//			}
//		}
//	}
		
		// two additional matrices solution
		int[] cols = new int[matrix[0].length];
		int[] rows = new int[matrix.length];
		
		for(int row=0; row < matrix.length; row++) {
			for(int col=0; col < matrix[0].length; col++) {
				
				if(matrix[row][col] == 0) {
					rows[row] = -1;
					cols[col] = -1;
				}
			}
		}
		
		//final result
		for(int row=0; row < matrix.length; row++) {
			for(int col=0; col < matrix[0].length; col++) {
//				System.out.print(matrix[row][col] + ",");
				if(rows[row] == -1 || cols[col] == -1) {
					matrix[row][col] = 0;
				}
				
				System.out.print(matrix[row][col] + ",");
			}
			System.out.println();
			
		}
	}	
	
	public static void main(String[] args) {
		SetMatrixZero obj = new SetMatrixZero();
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		obj.setZeroes(matrix);
	}
}
