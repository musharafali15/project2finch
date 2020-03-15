package Code;
// Needs a package declaration to move to another folder

import com.birdbraintechnologies.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

System.out.println("hello");
      myFinch.setWheelVelocities(-250,-250);
      myFinch.setWheelVelocities(250,250);
      myFinch.setWheelVelocities(-250,-250);
      
      }
   }

