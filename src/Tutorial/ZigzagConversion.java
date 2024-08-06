package Tutorial;

public class ZigzagConversion {
	public static String convert(String s, int numRows) {

		// Creating String 2d array for achieving O(n) time and space complexity
		String[][] arr = new String[numRows][10];

		// Adding elements in the array
		int row = 0;
		int col = -1;
		int d = 1;
		for (int i = 0; i < numRows; i++) {
			if (row == 0) {
				d = 1;
				col++;
			}
			System.out.print(s.charAt(i) +" ");
			arr[row][col] = "" + s.charAt(i);

			if (row == numRows - 1) {
				d = 0;
				col++;
			}

			row += d;
		}

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numRows; j++) {

				System.out.println(arr[i][j]);
			}
		}

		return "";
	}

	public static void main(String[] args) {
		convert("PAYPALISHIRING", 3);
	}

}
