//Leetcode : 48. Rotate Image

//Used anpther 2D to implement the 90 degree rotation

//Output [7, 4, 1][8, 5, 2][9, 6, 3]

package leetcode5;

import java.util.Arrays;

public class imageRotation {
	
	void Solution(int mat[][]) {
		int n = mat.length;
		int t = n-1;
		
		int tmp[][] = new int[n][n];
		System.out.println(n);
		
		for(int i =0;i<n;i++) {
			
			 t = n;
			for(int j =0;j<n;j++) {
				
				
			int value = mat[t-1][i];
				
				tmp[i][j] = value;
			t--;
				
			}
		}
		
		for(int i = 0;i<n;i++) {
			for(int j =0;j<n;j++) {
				mat[i][j] = tmp[i][j];
			}
		}

		for(int[] row : mat) {
			
			System.out.print(Arrays.toString(row));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		imageRotation m = new imageRotation();
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		m.Solution(matrix);

	}

}
