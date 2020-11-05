package ciscoAssessment;



public class ipAddress {
	
 static	String  checkIpAddress(String s) {
		
		
		String[] value = s.split("\\.",-1);
		for(String i : value) {
			if(i.length()!=1&&i.charAt(0) == '0') 
			{
				
			return "INVALID";
				
			}
			if(i.length()>3 || i.length()==0) 
			{
				
					return "INVALID";
				
			}
			if(Integer.parseInt(i) > 255) 
			{
				
					return "INVALID";
				
			}
			 for (char c : i.toCharArray()) 
			 {
			        if (! Character.isDigit(c)) 
			        	
			        {			        	
			        	return "INVALID";
			        }
			 }
			
			
		}
	
			return "VALID";
		
		
	}
	
	void print(String s) {
		
	System.out.println(s);
		
	}
		
	

	public static void main(String args[]) 
		// TODO Auto-generated method stub
     {ipAddress i = new ipAddress();
     i.print(checkIpAddress("10.102.34.48"));
     
     ipAddress i1 = new ipAddress();
     i1.print(checkIpAddress("64.233.161.256"));
     }

}
