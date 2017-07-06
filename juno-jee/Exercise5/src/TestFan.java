
// John Gardner
// TestFan.java
// create an object of class fan */

public class TestFan
 {
    public static void main(String[]args)
    {
      String Fast = "fast";
    	
      Fan ceiling = new Fan("Ceiling");
      ceiling.setSpeed(Fast);
      ceiling.radius(10);
      ceiling.colour("Yellow");
      ceiling.onOff(true);

      System.out.println(ceiling);
      }
  }
    
      

  
 
