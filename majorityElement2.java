//Majority Element II Leetcode

import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {

	public List<Integer> majorityElement(int[] nums) {
		int i =0;
		
        List<Integer> elements = new ArrayList<Integer>();
        
        int length = (nums.length)/3;
       // System.out.println(length);
        while(i <nums.length){
        	int count = 0;
        	for(int j = 0 ; j<nums.length;j++)
        	{
        		if(nums[j]==nums[i]) {
        			count++;
        		}
        		
        	}
        	if(count>length && !elements.contains(nums[i]) ) {
    			elements.add(nums[i]);
    			
    		}
        	i++;
        }
        for(int t : elements) {
        	System.out.println(t);
        }
        return elements;
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      majorityElement2 m = new majorityElement2();
      int[] ab = new int[]{1,1,1,3,3,2,2,2};
      m.majorityElement(ab);
      int[] bc = {3,2,3};
      m.majorityElement(bc);
	}

}
