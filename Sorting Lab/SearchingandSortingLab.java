//Program created by Jeremy Bill to search and sort arrays
import java.util.*;
import java.text.*;
import java.io.*;



public class SearchingandSortingLab
{
     public static void main(String[] args) throws IOException
     {//Code Begins Here
     Scanner scan= new Scanner(System.in);
     Scanner FileReader= new Scanner(new File("SorterArrayLab.txt"));
     int numofseq= FileReader.nextInt();
     int count=0;
     String [] sequences= new String[numofseq];
     for(int i=0; i<numofseq; i++)
     {sequences[i]= FileReader.next();
     }    
     
     
     
      System.out.println("Enter the number (1-4) of the desired task. Enter quit to end the program.");
      System.out.println("1. Print Sequences in alphabetical order ");
      System.out.println("2. Look for a sequence in the list ");
      System.out.println("3. Print all sequences that are at least a certain length ");
      System.out.println("4. Change the sequence at a particular index ");
      String decide= scan.next();
      
      while(decide.equals("1") || decide.equals("2") || decide.equals("3") || decide.equals("4"))
      { 
         switch(decide)
         {
         case "1": //Alphabetic Order
         Sorter.selectionSort(sequences);
         for (int j=0; j<numofseq; j++)
         {System.out.println(sequences[j]);
         }
         break;
         case "2": //Look for a certain sequence in the list
         System.out.println("What sequence are you looking for?");
         String seqlook= scan.next();
         //Take the String and compare it to sequences and search sequences for how many times it occurs
         for (int i=0; i<sequences.length && sequences[i].compareTo(seqlook)<=0; i++)
            {		
	         if(seqlook.equals(sequences[i])) 		
		      count++;
            }                            
         System.out.println(seqlook + " was found " + count + " times in the file");
         
         break;
         case "3": //Print all sequences that are a certain length
         System.out.print("Enter the length you would like to check for: ");
          //throwsaway bad value
          while(!scan.hasNextInt())
          {String throw1= scan.next();
          System.out.println("Please enter a whole number");
          }
          int lengthcheck= scan.nextInt();
          System.out.println("Here are the sequences at least " +lengthcheck+ " nucleotides in length ");
           //code assuming value is accepted
          for (int l=0; l<numofseq; l++)
            { if(sequences[l].length()>=lengthcheck)
              {System.out.println(sequences[l]);
              }
            }
         break;
         case "4": //Change the sequence at a particular index
         System.out.print("What is the index of the entry you would like to change? ");
          while(!scan.hasNextInt())
          {String throw2= scan.next();
          System.out.println("Please enter a whole number");
          }
         int indexer= scan.nextInt(); 
         
         if(indexer>=numofseq)
         {System.out.println("The index indicated is not valid, putting new sequence at location 0");
         }
         else
         {  System.out.println("Change will be made at index " +indexer);
         }
         System.out.println("What would you like to change it to?");
         String changer= scan.next();
         if(indexer>=numofseq)
         {sequences[0]= changer;
         }
         else
         {sequences[indexer] = changer;
         }
                  
        //Sorter.selectionSort(sequences);
         
         }
      count=0;
      System.out.print("Next Task: ");
      decide= scan.next();
    }
    System.out.println("Thank you for using the DNA Information System");
         
       
 
     }
     
}