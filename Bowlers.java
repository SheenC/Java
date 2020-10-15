package hello;
import java.util.Collection;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Bowlers
{

    private static Map<Integer, Double> recordsmapYang;
    private static Map<Integer, Double> recordsmapDavid;

	public static void main(String[] args)
    {
		       
		//Yang's records
    	recordsmapYang = new HashMap<Integer, Double>();
        recordsmapYang.put(20200506, 10.0);//20200506 means YYYYMMDD
        recordsmapYang.put(20190101, 8.0);
        recordsmapYang.put(20161001, 0.0);
        
        int YangLastDate = Collections.max(recordsmapYang.keySet());
        double YangScoreOfLastDate = recordsmapYang.get(YangLastDate);
        
        
		//David's records
        recordsmapDavid = new HashMap<Integer, Double>();
        recordsmapDavid.put(20190303, 9.0);
        recordsmapDavid.put(20190304, 6.0);
        recordsmapDavid.put(20190901, 8.0);
        recordsmapDavid.put(20191212, 5.0);

        int DavidLastDate = Collections.max(recordsmapDavid.keySet());
        double DavidScoreOfLastDate = recordsmapDavid.get(DavidLastDate);
        

		//Bowlers
        Map<String, Object> Bowler = new HashMap<String, Object>();
		Bowler.put("Yang",recordsmapYang);
		Bowler.put("David",recordsmapDavid);
		
		Set<String> Names = Bowler.keySet();
		
		Iterator<String> iter = Names.iterator();
		String YangName=iter.next();
		String DavidName=iter.next();

		//Print Yang's information
        System.out.println("The bowler's name: " + YangName); 
        System.out.println("Yang's number of games: " + recordsmapYang.size());
        System.out.println("Yang's average score: " + sum(recordsmapYang.values())/recordsmapYang.size());  
        System.out.println("Yang's score of the last game: " + YangScoreOfLastDate); 
        System.out.println("Yang's date of the last game: " + YangLastDate+ "\r\n");    
        
        //Print David's information
	    System.out.println("The bowler's name: " + DavidName); 
        System.out.println("David's number of games: " + recordsmapDavid.size());
        System.out.println("David's average score: " + sum(recordsmapDavid.values())/recordsmapDavid.size());  
        System.out.println("David's score of the last game: " + DavidScoreOfLastDate); 
        System.out.println("David's date of the last game: " + DavidLastDate+ "\r\n"); 
        
        //Show the collections
        System.out.println("All Bowlers' Records: " + Bowler);
        System.out.println("All bowlers' names: " + Names);
        System.out.println("Yang's records: " + recordsmapYang);
        System.out.println("David's records: " + recordsmapDavid);

    }
    

	//define the sum function
	private static double sum(Collection<Double> values) 
	{

        double s = 0.0;
        for (Double i:values) 
        {
            s = s + i;
        }
        return s;
	}


}





