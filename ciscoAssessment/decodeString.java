package ciscoAssessment;

import java.util.Stack;

public class decodeString {

	
	String solution(String s) {
		
		 if (s.length() == 0 || s == null) {
	            return s;
	        }
		
		Stack<Integer> stack1 = new Stack<Integer>(); 
		Stack<String> stack2 = new Stack<String>(); 
		
		int index = 0;
		String result ="";
		while(index < s.length()) {
			
			if(s.charAt(index)== '(') {
				
			}
			else if (s.charAt(index)== '(') {
				
			}
			else if(s.charAt(index)== '{') {
				
			}else if(s.charAt(index)== '}')  {
				
			}else if( Character.isDigit(s.charAt(index))) {
				
			}
			else {
				result += s.charAt(index);
				index = index +1;
				
			}
		
		}
		return s;
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		decodeString d = new decodeString();
		d.solution("(ab(d){3}){2}");

	}

}
