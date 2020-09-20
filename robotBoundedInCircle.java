// Leetcode Question Robot Bounded In Circle

import java.util.*;


public class Solution {
	
public boolean isRobotBounded(String instructions) {
    int x = 0;
    int y = 0;
 String directions = "Straight";
  for(int i =0,n = instructions.length();i<n;i++)
{
     char c = instructions.charAt(i);
     if (c=='G')
        {
          if(directions.equals("Straight"))
          x+=1;
          else if(directions.equals("Left"))
        	  y+=1;
          else if(directions.equals("Right"))
        	  y-=1;
          else if (directions.equals("Back"))
              x-=1;
          

         }
     else if(c=='L')
         {
    	 if(directions.equals("Straight"))
             directions = "Left";
    	 else if(directions.equals("Left"))
            	 directions = "Back";
    	 else if(directions.equals("Right"))
    		    directions = "Straight";
    	 else if(directions.equals("Back"))
    		 directions = "Right";
           	  
         }
     else if(c=='R') {
    	 if(directions.equals("Right"))
             directions = "Back";
    	 else if(directions.equals("Straight"))
            	 directions = "Right";
    	 else if(directions.equals("Left"))
    		    directions = "Straight";
    	 else if(directions.equals("Back"))
    		 directions = "Left";
     }
     
}if (!directions.equals("Straight")||(x ==0 && y==0))

	return true;
  
else
	return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		String[] data = {"GGLLGG","GG","GL"};
		for(int i =0;i<data.length;i++) {
			if(s.isRobotBounded(data[i])==true)
				System.out.println("it is true");
			else
				System.out.println("it is false");
		}

	}

}
