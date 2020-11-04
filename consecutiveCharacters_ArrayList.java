
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;

//Leetcode - 1446 - Consecutive Characters using ArrayList



public class consecutiveCharacters_ArrayList {

	int solution(String s) {
		
		
		 ArrayList<Integer> arr = new ArrayList<Integer>(); 
		 int count = 1;
		 int index = 0;
		 if(s != null && !s.trim().isEmpty()) {
		arr.add(index,count);
		 }
		 else {
			 return 0;
		 }
		for(int i = 1 ; i<s.length();i++) {
		   
			if(s.charAt(i-1)==s.charAt(i) ) {
				
				arr.set(index,++count);
				
			}
			else if ((s.charAt(i-1)!=s.charAt(i)))
			{   count = 1;
				index++;
				arr.add(index,count);
			}
		}
		
		 for (int j =0;j< arr.size();j++ ) {
			 System.out.print(arr.get(j));
		 }
		
	return Collections.max(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	consecutiveCharacters c =  new consecutiveCharacters();
	//	c.solution("leetcode");
	consecutiveCharacters_ArrayList c1 =  new consecutiveCharacters_ArrayList();
		c1.solution("abbcccccccddddddeeebcssd");
//		consecutiveCharacters c2 =  new consecutiveCharacters();
//		c2.solution("triplepillooooow");
//		consecutiveCharacters c3 =  new consecutiveCharacters();
//		c3.solution("hooraaaaaaaaaaay");
//		consecutiveCharacters c4 =  new consecutiveCharacters();
//		c4.solution("tourist");

	}

}


//
//class Solution {
//    public int maxPower(String s) {
//        if(s.length() == 1)
//            return 1;
//        
//        int max = 1;
//        int currMax = 1;
//        
//        for(int i  = 1; i < s.length(); i++){
//            if(s.charAt(i) == s.charAt(i-1)){
//                currMax++;
//            }
//            else{
//                currMax = 1;
//            }
//            
//            if(currMax > max)
//              max = currMax;
//        }
//        
//        return max;
//        
//    }
//}
