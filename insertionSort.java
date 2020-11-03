package leetcode3;

public class insertionSort {
	
	int[] sort(int[] A) {
		
		 for( int i = 0 ;i < A.length ; i++ ) {
			    

			      int temp = A[ i ];    
			      int j = i;

			       

			          while(  j > 0  && temp < A[ j -1]) {

			          
			                A[ j ] = A[ j-1];   
			                j= j - 1;

			           }
			         
			           A[ j ] = temp;       
			     }
		 for(int j = 0 ; j<A.length;j++) {

			 System.out.print(A[j]);
		 }
		return A;  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      insertionSort i = new insertionSort();
     
      int a[] = {7,3,1,8};
      i.sort(a);
	}

}
