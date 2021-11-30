//Program created by Jeremy Bill for username arrays and password arrays. 
//Sorter class was slightly modified from code Dr.Carter provided in Powerpoint
import java.util.*;
import java.text.*;
import java.io.*;



public class ArrayLab
{
     public static void main(String[] args) throws IOException
     {//Code Begins Here
      Scanner scan= new Scanner(System.in);
      Scanner FileReader= new Scanner(new File("ArrayNames.txt"));
      //Variable to read the number of users in the file
      int num= FileReader.nextInt();

      //Create Array's
      double [] value = new double[8];
      String [] userArray= new String[num];
      String [] passArray= new String[num];
      //Variables to use later
      int x;
      double x2;
      int count=0;
      int count2=0;
      int length= userArray.length;
     //Have user input values to store inside array
     System.out.println("Please enter 7 numbers");
      for (x=1; x<value.length; x++)
      { System.out.print("Value " +x +": ");
          value[x]= scan.nextDouble();
      }
      System.out.println(" ");
      //Have user input number to seperate big from small numbers
      System.out.println("Please enter the number that divides larger numbers from smaller numbers");
      double y= scan.nextDouble();
      //Counts the amount of big and small numbers
      for(x=1; x<=7; x++)
      { if(value[x]<y)
        {count++;
        }
        else if(value[x]>=y)
        {count2++;
        }
      }
      System.out.println(" ");
      System.out.println("You entered " +count+ " small numbers and " +count2+ " big numbers");
      System.out.println(" ");
      System.out.println("Reading usernames from the file...");
      System.out.println("Please enter the password for the user indicated");
      //Array for username
      for(int i=0; i<num; i++)
      { userArray[i]=FileReader.next();
      }
      //Array for Password
      for(int j=0; j<num; j++)
      {  System.out.print(userArray[j]+ ": ");
         passArray[j]=scan.next();
      }
      System.out.println(" ");
      //Report
      System.out.println("Users and Passwords");
      System.out.println("-------------------");
      for(int k=0; k<num; k++)
      {  
         if(userArray[k].length()<=5)
         { System.out.println(userArray[k]+ "\t\t\t"+ passArray[k]);
         }
         else if (userArray[k].length()>5 && userArray[k].length()<=8)
         { System.out.println(userArray[k]+ "\t\t"+ passArray[k]);
         }
         else
         {System.out.println(userArray[k]+"\t"+ passArray[k]);
         }
      } 
      //Does Task 3 i.e. prints 3rd user password pair
      String subpass= passArray[2].substring(0,5);
      System.out.println(" ");
      System.out.println("The third user password pair is now "+userArray[2]+"\t"+subpass);
      
      
           
   
     }
     
}