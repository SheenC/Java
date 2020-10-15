
public class Balloon
{       
  boolean Inflatable;
  int PresentPressure;
  int MaxPressure;


  public Balloon ()
  {
     Inflatable = true;
     PresentPressure = 0;     
     MaxPressure = 100;        
  }
  
  public void inflate()
  { 
    if (this.Inflatable)
    {
       this.PresentPressure += 20;
       if (PresentPressure <= MaxPressure )
       {
          System.out.println("The present pressure is " + PresentPressure + "/" + MaxPressure);
       }
       else 
       {
         OverInflated();
       }  
    }
    else
    {
      System.out.println("The balloon is broken. You can not inflate it.");
    }
 }

  public void OverInflated()
  {
     Inflatable = false;
     this.PresentPressure = 0;
     System.out.println("The balloon is overinflated. Boooomb!");

  }
      

  public static void main(String[] argv) 
  {
      Balloon Lily = new Balloon();


        Lily.inflate();
        Lily.inflate();
        Lily.inflate();
        Lily.inflate();
        Lily.inflate();
        Lily.inflate();
        Lily.inflate();
        Lily.inflate();


  }


}




