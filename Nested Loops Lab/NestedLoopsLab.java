//Program created by Jeremy Bill to draw lines with a nested loop
import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import java.util.*;
import java.io.*;

public class NestedLoopsLab extends Application
{
   @Override
   public void start( Stage stage )
   {
      //Code Begins here
      
       
      //Variables and Scanner 
      Scanner scan= new Scanner(System.in);
      int linesets=0;
      int linelength=0;
      //Asking for Linesets
      System.out.println("Please enter the number of line sets to draw");
      do
      {  System.out.println("Please enter a number between 2 and 9");
         linesets= scan.nextInt();
        
      }while(linesets<=1 || linesets>=10);
      
      //Asking for line length
      
      System.out.println("How long would you like the lines to be?");
      do
      { 
         System.out.println("Please enter a number between 1 and 50");
         linelength= scan.nextInt();
         
         //Statement that notifies user if number is too big or too small
         
         if(linelength <1)
         System.out.println("The line length must be at least 1");
         
         else if(linelength>50)
         System.out.println("The line length cannot exceed 50");
         
      }while(linelength<1 || linelength>50);
      
      System.out.println("Thank you");
      
      //Create Object
      GraphicsContext gc = JIGraphicsUtility.setUpGraphics ( stage, "Draw Figures",  1500, 800 );
      //Draw
      //Variables used for math and drawing
      int spacer=70;
      int x=100;
      int y=50;
      int x2;
      int y2;
      int yincreaser= 10;
      
      
      //Sets line width
      gc.setLineWidth(2);
      
      //Switch statement to change color which is inside the OUTER for loop
      for(int color=1; color<=linesets; color++)
      { switch(color){
         case 1:
         gc.setStroke(Color.RED);
         break;
         case 2: 
         gc.setStroke(Color.BLUE);
         break;
         case 3:
         gc.setStroke(Color.GREEN);
         break;
         default: 
         gc.setStroke(Color.PURPLE);
      }
      
      //Inner for loop, includes calculations for the spacing and drawing of the linesets
      
      int linesets1=0;
      for(linesets1=0; linesets1<4; linesets1++)
      
      {  y2= y + linesets1*yincreaser;
         x2= x +(color)*spacer+linelength*(color);
         
         gc.strokeLine(x2,y2,x2+linelength,y2);
      }
     }
      
            //End of major coding
      

            }
            public static void main( String [] args)
            {
               launch( args);
            }
}