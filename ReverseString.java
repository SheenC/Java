package hello;
import java.lang.String;

public class ReverseString 
{
	
	 static String RevStr(String str) 
	 {
		 		 
		 if (str.length()==0 || str.length()==1)
		  	return str;
		    
		 else
		 {
			 String LastChar = str.substring(str.length(),str.length()+1);
			 String LeftOver = str.substring(0,str.length());
		     return LastChar + RevStr(LeftOver);
		 }
	    
	 }
	
}
