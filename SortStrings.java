package hello;
import java.io.*;

public class SortStrings
{
		
	public static void main(String [] argv) throws IOException
	{
		//Input the string
		System.out.println("Please input a string which you want to sort: ");
	    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
	    String s = stdin.readLine();
	    
	    //Convert String s to String Array asc
	    String [] asc =new String[s.length()];
	    for (int i = 0; i <s.length() ; i++)
	    {
	        String st = s.substring(i,i+1);
	        asc[i] = st;
	    }

	    //Bubble sorting
		for(int i=0; i<asc.length; i++)
		{
		 for(int j=i+1; j<asc.length; j++)
		  {
			 
		    if(asc[i].compareTo(asc[j])>0)
		      {
		        String t = asc[i];
		        asc[i]=asc[j];
		        asc[j]=t;
		      }
		  }
		}

       //Print the sorted string
	   for(int i=0; i<asc.length; i++)
	   {
	       System.out.println(asc[i]);
	   }
	}
}


