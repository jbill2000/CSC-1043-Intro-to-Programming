//Program created by Jeremy Bill to make a Business Card.
import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;

public class BusinessCardLab extends Application
{
   @Override
   public void start( Stage stage )
   {
      //set up windoes title and size
      GraphicsContext gc = JIGraphicsUtility.setUpGraphics ( stage, "Business Card", 600,  400 );
      
      //draw card
      gc.setFill(Color.AZURE);
      gc.setStroke(Color.CRIMSON);
      gc.setLineWidth(1);
      gc.fillRect(150,100,300,200);
      gc.strokeRect(150,100,300,200);
      //Begin putting info in
      Font nameFont= new Font(18);
      gc.setFont(nameFont);
      String name= "Jeremy Bill ";
      gc.strokeText(name, 175,225);
      String occupation= ("Head of CyberSecurity");
      gc.strokeText(occupation,175,250);
      String email= ("jmbill2000@pointloma.edu");
      gc.strokeText(email,175,275);
      int startX= 350;
      int startY= 130;
      // Custom Shape Design
      gc.setFill(Color.BLACK);
      gc.fillOval(startX,startY,50,50);
      gc.setFill(Color.AZURE);
      gc.strokeOval(startX,startY,50,50);
      gc.fillOval(startX+5,startY+5,40,40);
      Color purp= Color.rgb(140,10,140);
      gc.setStroke(purp);
      gc.strokeRect(startX-5,startY+25,60,50);
      gc.fillRect(startX-5,startY+25,60,50);
      gc.beginPath();
      gc.moveTo(372,185);
      gc.lineTo(378,185);
      gc.lineTo(376,175);
      gc.arc(375,170,5,5,275,345);
      gc.closePath();
      gc.setFill(purp);
      gc.stroke();
      

      
            }
            public static void main( String [] args)
            {
               launch( args);
            }
}
      