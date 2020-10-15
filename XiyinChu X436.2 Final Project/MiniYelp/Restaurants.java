import java.util.*;

public class Restaurants
{
		  //A general Restaurants class should contain the following elements
          String shopName;
          String owner;
          String startYear;
          int openTime;
          int closeTime;
          int spicyFlavor;
          int sweetFlavor; 
          int priceLevel;
          Map<Integer, Integer> tables = new HashMap<Integer, Integer>();

 
 /**
	public static ArrayList allRestaurants() 
	{

		ArrayList<Restaurants> allResList = new ArrayList<Restaurants>();


        //Restaurant 1
        Restaurants res1 = new Restaurants();

        //basic info of res1
        res1.shopName = "Happy Meal";
        res1.owner = "John K";
        res1.startYear = "1998";

        //operation time: from 10am to 8pm
        res1.openTime = 10;
        res1.closeTime = 20;

        //spicyFlavor List
        res1.spicyFlavor[0] = 1; //Happy Meal has dishes which are 1-level spicy (not spicy)
        res1.spicyFlavor[1] = 2; //Happy Meal has dishes which are 2-level spicy (a little spicy)
        res1.spicyFlavor[2] = 3; //Happy Meal has dishes which are 3-level spicy (spicy)

        //sweetFlavor List
        res1.sweetFlavor[0] = 1; //Happy Meal has dishes which are 1-level sweet (not sweet)
        res1.sweetFlavor[1] = 5; //Happy Meal has dishes which are 5-level sweet (the most sweet)

        //tables in the restuarant
        res1.tables.put(4,10);//There are 10 four-people tables



        //Restaurant 2
        Restaurants res2 = new Restaurants();

        //basic info of res2
        res2.shopName = "Daisy's Cafe";
        res2.owner = "Daisy Camp";
        res2.startYear = "2008";

        //operation time: from 11am to 11pm
        res2.openTime = 11;
        res2.closeTime = 23;

        //spicyFlavor List
        res2.spicyFlavor[0] = 1; 
        res2.spicyFlavor[1] = 2; 

        //sweetFlavor List
        res2.sweetFlavor[0] = 1; 
        res2.sweetFlavor[1] = 2; 
        res2.sweetFlavor[2] = 3; 

        //tables in the restuarant
        res1.tables.put(2,10);//There are 10 two-people tables
        res1.tables.put(4,10);//There are 10 four-people tables



        //Restaurant 3
        Restaurants res3 = new Restaurants();

        //basic info of res3
        res3.shopName = "Yang's Dishes";
        res3.owner = "Lin Yang";
        res3.startYear = "2002";

        //operation time: from 10am to 9pm
        res3.openTime = 10;
        res3.closeTime = 21;

        //spicyFlavor List
        res3.spicyFlavor[0] = 4; 
        res3.spicyFlavor[1] = 5; 

        //sweetFlavor List
        res3.sweetFlavor[0] = 1; 

        //tables in the restuarant
        res3.tables.put(4,5);//There are 5 four-people tables
        res3.tables.put(6,6);//There are 6 six-people tables



		//Restaurant 4
		Restaurants res4 = new Restaurants();

		//basic info of res4
        res4.shopName = "Traditional Restaurants";
        res4.owner = "Peter Roberts";
        res4.startYear = "2003";

        //operation time: from 10 am to 8 pm
        res4.openTime = 10;
        res4.closeTime = 20;

        //spicyFlavor List
        res4.spicyFlavor[0] = 1; 

        //sweetFlavor List
        res4.sweetFlavor[0] = 1; 

        //tables in the restuarant
        res4.tables.put(4,20);//There are 20 four-people tables



		//Restaurant 5
		Restaurants res5 = new Restaurants();

	    //basic info of res5
        res5.shopName = "We love fruits";
        res5.owner = "Katy P";
        res5.startYear = "2010";

        //operation time: from 4 pm to 12 pm
        res5.openTime = 16;
        res5.closeTime = 24;

        //spicyFlavor List
        res5.spicyFlavor[0] = 1; 
        res5.spicyFlavor[1] = 2; 
        res5.spicyFlavor[2] = 3; 
        res5.spicyFlavor[3] = 4; 
        res5.spicyFlavor[4] = 5; 

        //sweetFlavor List
        res5.sweetFlavor[0] = 1; 
        res5.sweetFlavor[1] = 2; 
        res5.sweetFlavor[2] = 3; 
        res5.sweetFlavor[3] = 4; 
        res5.sweetFlavor[4] = 5; 

        //tables in the restuarant
        res5.tables.put(4,20);//There are 20 four-people tables



		//Restaurant 6
		Restaurants res6 = new Restaurants();

        //basic info of res6
        res6.shopName = "Spicy House";
        res6.owner = "Kevin L";
        res6.startYear = "2012";

        //operation time: from 11 pm to 11 pm
        res6.openTime = 11;
        res6.closeTime = 23;

        //spicyFlavor List
        res6.spicyFlavor[0] = 1; 
        res6.spicyFlavor[1] = 2; 
        res6.spicyFlavor[2] = 3; 
        res6.spicyFlavor[3] = 4; 
        res6.spicyFlavor[4] = 5; 

        //sweetFlavor List
        res6.sweetFlavor[0] = 1; 

        //tables in the restuarant
        res6.tables.put(4,25);//There are 25 four-people tables



		//Restaurant 7
		Restaurants res7 = new Restaurants();

		//basic info of res7
        res7.shopName = "Kathy's Breakfast";
        res7.owner = "Kathy Deer";
        res7.startYear = "2009";

        //operation time: from 6 am to 12 pm
        res7.openTime = 6;
        res7.closeTime = 12;

        //spicyFlavor List
        res7.spicyFlavor[0] = 1; 
        res7.spicyFlavor[1] = 2; 
        res7.spicyFlavor[2] = 3; 

        //sweetFlavor List
        res7.sweetFlavor[0] = 1; 
        res7.sweetFlavor[1] = 2; 
        res7.sweetFlavor[2] = 3; 

        //tables in the restuarant
        res7.tables.put(2,10); //There are 10 two-people tables
        res7.tables.put(4,10);//There are 10 four-people tables



		//Restaurant 8
		Restaurants res8 = new Restaurants();

		//basic info of res8
        res8.shopName = "Dreaming Pub";
        res8.owner = "David Bridge";
        res8.startYear = "2020";

        //operation time: from 0 am to 6 am
        res8.openTime = 0;
        res8.closeTime = 6;

        //spicyFlavor List
        res8.spicyFlavor[0] = 1; 
        res8.spicyFlavor[1] = 2; 
        res8.spicyFlavor[2] = 3; 
        res8.spicyFlavor[3] = 4; 
        res8.spicyFlavor[4] = 5; 

        //sweetFlavor List
        res8.sweetFlavor[0] = 1; 
        res8.sweetFlavor[1] = 2; 
        res8.sweetFlavor[2] = 3; 
        res8.sweetFlavor[3] = 4; 
        res8.sweetFlavor[4] = 5; 

        //tables in the restuarant
        res8.tables.put(1,20); //There are 20 single-person tables
        res8.tables.put(2,10); //There are 10 two-people tables
        res8.tables.put(4,10);//There are 10 four-people tables



		//Restaurant 9
		Restaurants res9 = new Restaurants();

	    //basic info of res9
        res9.shopName = "Sweet Pastries";
        res9.owner = "Bob Ashley";
        res9.startYear = "2018";

        //operation time: from 10 am to 8 am
        res9.openTime = 10;
        res9.closeTime = 20;

        //spicyFlavor List
        res9.spicyFlavor[0] = 1; 

        //sweetFlavor List
        res9.sweetFlavor[0] = 1; 
        res9.sweetFlavor[1] = 2; 
        res9.sweetFlavor[2] = 3; 
        res9.sweetFlavor[3] = 4; 
        res9.sweetFlavor[4] = 5; 

        //tables in the restuarant
        res9.tables.put(2,10); //There are 10 two-people tables
        res9.tables.put(4,10);//There are 10 four-people tables



		//Restaurant 10
		Restaurants res10 = new Restaurants();

	    //basic info of res10
        res10.shopName = "Papa's Brunch";
        res10.owner = "Kitty H";
        res10.startYear = "1999";

        //operation time: from 6 am to 14 pm
        res10.openTime = 6;
        res10.closeTime = 14;

        //spicyFlavor List
        res10.spicyFlavor[0] = 1; 
        res10.spicyFlavor[1] = 2; 
        res10.spicyFlavor[2] = 3; 
        res10.spicyFlavor[3] = 4; 
        res10.spicyFlavor[4] = 5; 

        //sweetFlavor List
        res10.sweetFlavor[0] = 1; 
        res10.sweetFlavor[1] = 2; 
        res10.sweetFlavor[2] = 3; 
        res10.sweetFlavor[3] = 4; 
        res10.sweetFlavor[4] = 5; 

        //tables in the restuarant
        res10.tables.put(2,5); //There are 5 two-people tables
        res10.tables.put(4,5);//There are 5 four-people tables
        res10.tables.put(6,4);//There are 4 six-people tables


        allResList.add(res1);
        allResList.add(res2);
        allResList.add(res3);
        allResList.add(res4);
        allResList.add(res5);
        allResList.add(res6);
        allResList.add(res7);
        allResList.add(res8);
        allResList.add(res9);
        allResList.add(res10);


        return allResList;

        

		
    }

*/

	
}