//Program created by Jeremy Bill to create a 2D Array and read data from it
import java.util.*;
import java.text.*;
import java.io.*;



public class Voyager2DarrayLab
{
     public static void main(String[] args) throws IOException
     {//Code Begins Here
     double num=0;
     double num1=0;
     double num2=0;
     double num5=0;
     double output=0;
     //Scanner and Formatter created
     Scanner scan= new Scanner(System.in);
     DecimalFormat numform= new DecimalFormat("0.00");
     
     //Ask what the file is
     System.out.print("Please enter the name of the file you wish to process: ");
     String file= scan.next();
     Scanner FileReader= new Scanner(new File(file));   
     
     //Ask how many weeks theyd like to process
     System.out.print("Please enter the number of weeks you would like to process: ");
     while(!scan.hasNextInt())
          {String throw1= scan.next();
          System.out.print("Please enter an integer: ");
          }
          int numofweeks= scan.nextInt();
        //Sets num of weeks to 13 if user enters a number greater than 13
         if(numofweeks>13)
         {System.out.println("Number of weeks is out of bounds. Assuming the entire 13 weeks: ");
          numofweeks=13;
         }
         //Instantiating Array
          double [][] voyagerdata = new double [numofweeks] [4];
    
    
    //Create the Array
     
       {for(int i=0; i<voyagerdata.length; i++)
         for(int j=0; j<4; j++)
         { voyagerdata[i][j]= FileReader.nextDouble();
         }
       }
         
           

     //Create Menu
     System.out.println("Enter a number between 1-4 to make your choice. Enter quit to end program ");
     System.out.println(" ");
     System.out.println("1. Calculate average fuel consumption for the entire series of weeks represented ");
     System.out.println("2. Calculate average output for the entire series of weeks represented ");
     System.out.println("3. Retrieve the propellant remaining for any 1 week (numbering starts at 0) ");
     System.out.println("4. Print the data for any one week ");
     System.out.println(" ");
     System.out.print("Which operation would you like to perform? ");
     //Creates decider to decide what operation to do
     String decider= scan.next();
     
     //While Loop with a switch statement to do everything the menu asks for and when the while loop becomes false the program ends
     while(!decider.equals("quit"))
     {
       //Switch statement to perform the menu options
       switch(decider)
       {
      
       //Calculate Average Fuel consumption
       case "1":
        for(int k=0; k<=numofweeks-1; k++)
         {
         num+= voyagerdata[k][0];
         
         }
         num1= numofweeks;
        num2= num/numofweeks;
         System.out.println("Average fuel consumption was "+numform.format(num2));
         System.out.println(" ");
         System.out.print("Which operation would you like to perform? ");
         decider=scan.next();
       break;
      
       //Calculate average output in watts
       case "2":
       for(int p=0; p<=numofweeks-1; p++)
       {
          output+= voyagerdata[p][2];
       }
       double outputwattage= (output/numofweeks);
       System.out.println("Average output (watts) was "+numform.format(outputwattage));
       System.out.println(" ");
       System.out.print("Which operation would you like to perform? ");
       decider=scan.next();    
       break;
      
       //Ask for what week they would like the propellant value and print the value for that week
       case "3":
       int weeksavailable= numofweeks-1;
       System.out.print("For which week would you like the propellant value? Available weeks are 0 to "+weeksavailable+ ": ");
        while(!scan.hasNextInt())
          {String throw2= scan.next();
          System.out.print("Please enter an integer: ");
          }   
       int propweeknum= scan.nextInt();
       if(propweeknum>weeksavailable)
       {System.out.println("Invalid week entered. Operation Aborted");
       System.out.println( " ");
       
 
       System.out.println(" ");
       System.out.print("Which operation would you like to perform? ");
       decider=scan.next();
       }
       else      
        {//Code assuming number works
       System.out.println("Propellant Remaining "+ numform.format(voyagerdata[propweeknum][1]));
       System.out.println( " ");
       System.out.print("Which operation would you like to perform? ");
       decider=scan.next();
         }     
       
       break;
       
       //Print the data for any one week
       case "4":
       System.out.print("For which week would you like the data? ");
        while(!scan.hasNextInt())
          {String throw3= scan.next();
          System.out.print("Please enter an integer: ");
          }
          int weekchoice= scan.nextInt();
       if(weekchoice>12)
       {System.out.println("Invalid week entered. Highest week possible is 12");
       }
       else if(weekchoice<=12)
       {System.out.println("Fuel \t Propel \t Output \t Margin ");
        System.out.println("---- \t ------ \t ------ \t ------ ");
        for(int m=0; m<4; m++)
         { System.out.print(numform.format(voyagerdata[weekchoice][m])+ "\t ");
         }
        }
       System.out.println(" ");
       System.out.println(" ");
       System.out.print("Which Operation would you like to perform? ");
       decider=scan.next();
       break;
       default: 
      //If decider does not equal quit this'll print the following
      if(!decider.equals("quit"))
       System.out.println("Invalid choice please enter a number between 1-4 or quit");
       System.out.println(" ");
       System.out.print("Which operation would you like to perform? ");
       decider=scan.next();
       }
       }
       //Ending program line
     System.out.println("To space and beyond!");
     
     
         
         
     
         
 
     }
     
}