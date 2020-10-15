import java.util.*;
import java.util.Scanner;

public class Customers
{

        //a customer class should contain the following elements
        public static String nickName;
        public static int spicyTaste;
        public static int sweetTaste;
        public static int timeToEat;
        public static String preferPrice;
        public static int numpeople;



    public static void IsCustomers() 
    {  

        //NickName

        System.out.println("Please enter some info to help us find the best restaurant for you! ");

        System.out.println("First, please enter your nickname: ");

        Scanner scan = new Scanner(System.in);

        nickName = scan.nextLine();

        System.out.println("Hi, " + nickName + "! " + "I'm your robot MiniYelp!");

        //Taste

        System.out.println("Please tell me about your taste preference: ");

        //Spicy

        System.out.println("How spicy do you prefer? ");

        System.out.println("You can enter 1-5, 1 means no spicy, 5 means the most spicy");

        spicyTaste = scan.nextInt();

        while (spicyTaste < 1 || spicyTaste > 5)
        {
            System.out.println("The number you entered is not within [1,5], please enter it again: ");
            spicyTaste = scan.nextInt();
        }

        //Sweet

        System.out.println("How sweet do you prefer? ");

        System.out.println("You can enter 1-5, 1 means no sweet, 5 means the most sweet");

        sweetTaste = scan.nextInt();

        while (sweetTaste < 1 || sweetTaste > 5)
        {
            System.out.println("The number you entered is not within [1,5], please enter it again: ");
            sweetTaste = scan.nextInt();
        }

        //time

        System.out.println("Which time do you plan to arrive at the restaurant? ");

        System.out.println("You can enter an integer number between 0-24");

        timeToEat = scan.nextInt();

        while (timeToEat < 0 || timeToEat > 24)
        {
            System.out.println("The number you entered is not within [0,24], please enter it again: ");
            timeToEat = scan.nextInt();
        }


        //price

        System.out.println("How much do you prefer per capita？");

        System.out.println("$: 0-20 dollars, $$: 21-50 dollars, $$$: 51 and more dollars");

        preferPrice = scan.nextLine();

        while ( !(preferPrice.equals("$")|| preferPrice.equals("$$")  || preferPrice.equals("$$$") ) )
        {
            System.out.println("The price level you entered should be $, $$ or $$$, please enter it again: ");
            preferPrice = scan.nextLine();
        }


         //number of people

        System.out.println("How many people will come？");

        numpeople = scan.nextInt();

        while ( numpeople <= 0)
        {
            System.out.println("The number of people should be positive, please enter it again: ");
            numpeople = scan.nextInt();
        }


        //Customers set done!

        System.out.println("Customers preference is all set done!");
        System.out.println("Dear "+ nickName + ", we recommend the following restaurants for you: ");



     }



     public static String getNickName()
     {

          return nickName; 
     }

     public static int getSpicyTaste()
     {

          return spicyTaste;
     }

     public static int getSweetTaste()
     {

          return sweetTaste;
     }

     public static int getTimeToEat()
     {

          return timeToEat;
     }

     public static String getPreferPrice()
     {

          return preferPrice;
     }

     public static int getNumpeople()
     {
 
          return numpeople;
     }



     
}