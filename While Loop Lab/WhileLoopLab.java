//Program created to perform loops for various situations by Jeremy Bill
import java.util.*;
import java.text.*;
import java.io.*;



public class WhileLoopLab
{
     public static void main(String[] args) throws IOException
     {
     //Code Begins Here
     Scanner scan= new Scanner(System.in);
     DecimalFormat numform= new DecimalFormat("0.00");
     Scanner FileReader= new Scanner(new File("LoopNum"));
     Scanner FileReader1= new Scanner(new File("supplies.txt"));
     //Variables Declared
     int answer=0;
     double total=0;
     int sum=0;
     double avg1=0;
     int fnum1=0;
     double price=0;
     String pens;
     String pencils;
     String staplers;
     String notebooks;
     double totalprice=0;
     
     //Task 1
     
     //throwaway bad # if it doesnt meet conditions
     System.out.println("Enter the largest number to put into the sum");
      while(!scan.hasNextInt())
     {String throw1= scan.next();
     System.out.println("Please enter a whole number");
     }
     //code assuming number meets conditions
     int Num1=scan.nextInt();
         
     //Loop when number meets conditions
     while (answer<=5)
    { sum= Num1*(Num1+1)/2;
      answer++;
      }
     
     System.out.println("The summation of 1 to " +Num1+ " is " +sum);
    
     //Task 2
     
     //Reading from a text file
     System.out.println("Reading from the file... ");
     while (FileReader.hasNextDouble())
     { double fnum=FileReader.nextDouble();
     System.out.println("Adding " +fnum);
     ++fnum1;
     total+=fnum;
     avg1= (total/fnum1);
     }
     System.out.println("The total from the file is "+ total);
     System.out.println("The average of the " +fnum1+ " values is " +numform.format(avg1));
     
     //Task 3
     
     //Reading from a text file including words, includes a switch statement inside a while loop
     
     while(FileReader1.hasNext())
     { String supplies= FileReader1.next();
       int numofsup= FileReader1.nextInt();
       switch(supplies){
       case "pens": 
       price=1.25;
       break;
       case "pencils":
       price=.75;
       break;
       case "staplers":
       price=3.75;
       break;
       case "notebooks":
       price=4.50;
       break;
       default:
       price=10.00;
       }
       //Processes data from previous step
       System.out.println("Processing " + numofsup+" "+supplies+" "+ "at $"+numform.format(price));
       totalprice+= numofsup*price;
     }
      //Prints out total price
       System.out.println("The price of the total order is $"+numform.format(totalprice));
    
     
     
     
         
     
     
 
    }     
   }
     
     
