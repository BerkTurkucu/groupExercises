package summary;

public class multiplyTwoMatrices5 {
	/*
	 * In this program, you'll learn to multiply two matrices using
	 * multi-dimensional arrays in Java. For matrix multiplication to take place,
	 * the number of columns of first matrix must be equal to the number of rows of
	 * second matrix. In our example, i.e.
	 */
	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		int[][] firstMatrix = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] secondMatrix = { { 2, 3 }, { -9, 0 }, { 0, 4 } };

		// Mutliplying Two matrices
		int[][] product = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}

		// Displaying the result
		System.out.println("Sum of two matrices is: ");
		for (int[] row : product) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}
}
