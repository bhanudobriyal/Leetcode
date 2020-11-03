package leetcode3;

public class bubbleSort {
	
	int[] sort(int[] A) {
		 int n = A.length;
		 System.out.print("print");
		 for( int i = 0 ;i < n ; i++ ) {
			 
			 for(int j = 1 ; j< n-i ; j++) {
				 
			
			    if(A[j-1]>A[j]) {
			    	int temp = A[j];
			    	A[j] = A[j-1];
			    	A[j-1] = temp;
			    }
			 
			 
			 }
			     }
		 for(int j = 0 ; j<A.length;j++) {

			 System.out.print(A[j]);
		 }
		return A;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		// TODO Auto-generated method stub
	      bubbleSort i = new bubbleSort();
	     
	      int a[] = {7,3,1,8,2,5,4};
	      i.sort(a);

	}

}
