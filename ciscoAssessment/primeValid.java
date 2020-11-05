package ciscoAssessment;

import java.util.Scanner;

public class primeValid {
	
	void solution(int[] numbers) {
		
		for(int i = 0 ; i<numbers.length;i++) {
			if(numbers[i]==0 || numbers[i]==1) {
				System.out.print("NEITHER ");
			}
			else 
				
			{ int mid = numbers[i]/2;
			 int b =0;
			  for(int j = 2 ; j<= mid ; j++) 
			  {
				if(numbers[i]%j==0)
				{
					System.out.print("COMPOSITE ");
					 b = 1;
					break;
				}
			  }
			  if(b==0) {
					System.out.print("PRIME ");
					
			  }
			}
			
			
		}}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int count= Integer.parseInt(sc.nextLine()); 
		
		String s[]= sc.nextLine().split(" ");
		System.out.println(count);
		int [] numbers = new int[count];
		
        
      for(int i = 0; i<s.length;i++){
    	  numbers[i]= Integer.parseInt(s[i]);
      }
    
      
      primeValid p = new primeValid();
       p.solution(numbers);
      sc.close();

	}

}
