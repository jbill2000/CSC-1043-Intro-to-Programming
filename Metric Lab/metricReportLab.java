//Report to Convert Inches to Feet and Inches then to Centimeters and Meters by Jeremy Bill

public class metricReportLab
{
      public static void main (String[] args)
      {
      //declare variables using appropriate types and identifiers
      int Feet, Inches1, newInches;
      double FractionalFeet, Meters, Inches=72,Inches2=72, centimeters;
      
      //Find and Remember Fractional Feet
      FractionalFeet=Inches/12;
      
      //Find and Remember Feet and Inches
      Feet= (int) Inches/12;
      newInches= (int) Inches%12;
     
      
      //Find and remmember the value in centimeters and meters
      centimeters= (double) Inches*2.54;
      Meters= centimeters/100;
      
      //Find and remmember total inches increased by 1.
      Inches1= (int) ++Inches2;
      
      //Finalized Report
      System.out.println("REPORT TO CONVERT INCHES TO FEET AND INCHES, THEN TO CENTIMETERS");
      System.out.println("By Jeremy Bill");
      System.out.println("****************************************************************");
      System.out.println(" Using " +Inches+ "Inches");
      System.out.println("Fractional Feet = " + FractionalFeet);
      System.out.println("Feet: " + Feet + " Inches: " + newInches);
      System.out.println("That is " +centimeters+ " centimeters ");
      System.out.println("Or in meters: " + Meters);
      System.out.println("Total Inches INcreased by 1 is: " +Inches1);
      System.out.println("****************************************************************");

      }
}
