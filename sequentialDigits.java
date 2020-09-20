//Leetcode Sequential Digits

import java.util.ArrayList;
import java.util.List;

public class sequentialDigits1 {
	

public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList();
        String s = "123456789";
        for(int l = 2; l <= s.length(); l++) {
            for(int j = 0; j <= s.length() - l; j++) {
                int num = Integer.parseInt(s.substring(j, j + l));
                if(num > high) return result;
                if(num >= low) result.add(num);
            }
       
        }
       
        return result;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sequentialDigits1 s = new sequentialDigits1();
		for (Integer t :s.sequentialDigits(100, 300))
		{
		    System.out.println(t);
		}
		
		for (Integer t :s.sequentialDigits(1000, 13000))
        {
            System.out.println(t);
        }
	}

}
