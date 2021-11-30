//Program created by Jeremy Bill to test password strength
import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import java.util.*;

public class PasswordStrengthLab extends Application
{
   @Override
   public void start( Stage stage )
   {
      //Begin asking for password stuff 
      Scanner Scan = new Scanner(System.in);
      System.out.println("Welcome to Password Checker!");
      System.out.println("Please enter your password");
      String password= Scan.next();
      System.out.println("Thank you. Calculating strength now...");
      int points = 0;

      if (password.indexOf('&')>=0)
       {  points++;
       }
     if (password.indexOf('%')>=0)
      { points++;
      }
     if (password.indexOf('!')>=0)
      { points++;
      }
     if (password.length()>12)
     { points= points + 2;
     }
     else if (password.length()>8)
     { points++;
     }
     if (password.charAt(0)>='A' && password.charAt(0)<='Z')
     { points ++;
     }
     if (password.charAt(password.length()-1)>='a' && password.charAt(password.length()-1)<='z')
     { points ++;
     }
     if (password.indexOf('0')>=0)
     { points ++;
     }
     else if (password.indexOf('1')>=0)
     {points ++;
     }
     else if (password.indexOf('2')>=0)
     {points ++;
     }

     else if (password.indexOf('3')>=0)
     {points ++;
     }
     else if (password.indexOf('4')>=0)
     {points ++;
     }
     else if (password.indexOf('5')>=0)
     {points ++;
     }

     else if (password.indexOf('6')>=0)
     {points ++;
     }

     else if (password.indexOf('7')>=0)
     {points ++;
     }

     else if (password.indexOf('8')>=0)
     {points ++;
     }

     else if (password.indexOf('9')>=0)
     {points ++;
     }
     //begin to design and fill the bar
      GraphicsContext gc = JIGraphicsUtility.setUpGraphics ( stage, "Password Strength Bar", 600,  400 );
      //Draw
      gc.setFill(Color.WHITE);
      gc.setStroke(Color.BLACK);
      gc.setLineWidth(1);
      gc.fillRect(150,100,300,200);
      gc.strokeRect(150,100,300,200);
      gc.strokeRect(200,150,200,50);
      gc.setFill(Color.RED);
      
      if (points==1)
      {gc.fillRect(200,150,25,50);
      }
      if (points==2)
      {gc.fillRect(200,150,50,50);
      }
      if (points==3)
      {gc.fillRect(200,150,75,50);
      }
      if (points==4)
      {gc.fillRect(200,150,100,50);
      }
      if (points==5)
      {gc.fillRect(200,150,125,50);
      }
      if (points==6)
      {gc.fillRect(200,150,150,50);
      }
      if (points==7)
      {gc.fillRect(200,150,175,50);
      }
      if (points==8)
      {gc.fillRect(200,150,200,50);
      }
      if (points<=3)
      {gc.strokeText("Low strength",225,220);
      }
      else if (points>=4 && points<=6)
      {gc.strokeText("Medium strength",225,220);
      }
      else
      gc.strokeText("Strong Password",225,220); 
   
      

      

            }
            public static void main( String [] args)
            {
               launch( args);
            }
}