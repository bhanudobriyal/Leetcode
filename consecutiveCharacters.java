//Leetcode - 1446 - Consecutive Characters not using data structures, more efficient and smarter
public class consecutiveCharacters {
	
	int Solution1(String s) {
		
		int max = 0;
		int count = 1 ;
		if(s.length()==0) {
			return 0;
		}
		else if(s.length()==1) {
			return 1;
		}
		
		for(int i=1;i<s.length();i++) {
			
			if(s.charAt(i-1)==s.charAt(i)) {
				
				count++;
				
			}
			else {
					count = 1;
				}
				
				if(count>max) {
					max = count;
					
				}
				
			}
		System.out.print(max);
		return max;
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	consecutiveCharacters c =  new consecutiveCharacters();
		c.Solution1("cccccccc");
//		Solution c1 =  new Solution();
//			c1.Solution1("abbccccd");
//			consecutiveCharacters c2 =  new consecutiveCharacters();
//			c2.solution("triplepillooooow");
//			consecutiveCharacters c3 =  new consecutiveCharacters();
//			c3.solution("hooraaaaaaaaaaay");
//			consecutiveCharacters c4 =  new consecutiveCharacters();
//			c4.solution("tourist");

	}

}
