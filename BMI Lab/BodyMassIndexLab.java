//Program created by Jeremy Bill to calculate the BMI of someone with given values and a random person

import java.util.*;
import java.text.DecimalFormat;
public class BodyMassIndexLab
{
      public static void main (String[] args)
      {
         //Create the Scanner
         Scanner Scan= new Scanner(System.in);
         //Declare Weight
         double Weight;
         //Have them input the height
         System.out.print("Please enter the height of the patient (ex:5'6"+'"'+")"+":"); 
         String height=Scan.next();
         //Get and remember the indexs of height
         int index1= height.indexOf("'");
         int index2= height.indexOf("\"");
         String newInches= height.substring(index1+1,index2);
         //Have them input Weight
         System.out.println("What is the weight of the indivudual?"); 
         Weight= Scan.nextInt();
         //Calculate Strings of Inches and feet to calculate BMI
         String newFeet= height.substring(0,index1);
         double newInches1= Double.parseDouble(newInches);
         double newFeet2= Double.parseDouble(newFeet);
         //Calculate Patient's BMI
         DecimalFormat BMI= new DecimalFormat("0.0000");
         double Height= newFeet2*12 + newInches1;
         double BMI1= 703*((Weight)/(Height*Height));
         System.out.println("The patient's BMI is " + BMI.format (BMI1));
          //Create Random Number Generator
          Random random= new Random();
         //generate a random number for Feet and Inches given a set range
         int start= 3, end=7;
         int Feet= random.nextInt( end - start + 1 ) + start;
         int Inches= random.nextInt(12);
         System.out.println("Your random client is " + Feet+ " feet and " + Inches+ " inches ");
         //Turn Height1 into Inches for use Later in BMI2 Calculation
         double Height1= Feet*12 + Inches;
         //Get a random Weight
         int start1= 100, end1=399;
         double Weight1= random.nextInt( end1 - start1 + 1 ) + start1;
         System.out.println("Your random client weighs " + Weight1);
         //Calculate Random BMI
         double BMI2= Weight1/(Height1*Height1)*703;
         System.out.println("Your random client's BMI is " + BMI.format (BMI2));
         
                 
                  

      }
}
