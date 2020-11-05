package ciscoAssessment;

import java.util.Stack;

public class decodeStringNew {

	
	String solution(String s) {
		
		 if (s.length() == 0 || s == null) {
	            return s;
	        }
		
		Stack<Integer> counts = new Stack<Integer>(); 
		Stack<String> result = new Stack<String>(); 
		
		int index = 0;
		String res ="";
		while(index < s.length()) 
		{
		if( Character.isDigit(s.charAt(index))) 
			{
			 int count = 0;
			 while(Character.isDigit(s.charAt(index)))
			 {
				 count = count * 10 +(s.charAt(index) - '0');
				 index += 1;
			 }
			 counts.push(count);
			
			}
			
		else if(s.charAt(index)== '(') 
			{
				result.push(res);
				res ="";
				index += 1;
			}
	   else if (s.charAt(index)== ')') 
			{
		   index+=1;
				
			}
	   else if(s.charAt(index)== '{') {
				index+=1;
			}
	   else if(s.charAt(index)== '}') 
			{
				StringBuilder temp = new StringBuilder(result.pop());
				int count = counts.pop();
				for (int i =0;i<count ; i++) {
					temp.append(res);
					
				}
				res = temp.toString();
				index += 1;
				
			}
	   else 
			{
				res += s.charAt(index);
				index = index +1;
				
			}
		
		}
		
		
		
		return res;
		
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		decodeStringNew d = new decodeStringNew();
		System.out.println(d.solution("(ab(d){3}){2}"));
		
		//Output is : abdddabddd

	}

}
