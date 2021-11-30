//Program caluclates Nucleotides in a single strand created by Jeremy Bill//

import java.util.*;
public class dnaLab
{
public static void main(String[] args)
   {
   //Create the Scanner
   Scanner Scan= new Scanner(System.in);
   //Get the strand they want to analyze
   System.out.println("Please enter the DNA strand you wish to analyze. ");
    String dnaStrand = Scan.next();
   //Converting strand to uppercase letters
   String upperStrand= dnaStrand.toUpperCase();
   System.out.println("In all uppercase " +upperStrand);
   //Count the number of nucleotides
   double nucleoTide= dnaStrand.length();
   System.out.println("The number of nucleotides is " + (int) nucleoTide);
   //Identify first index of each Base letter
   int indexA= upperStrand.indexOf('A');
   int indexT= upperStrand.indexOf('T');
   int indexC= upperStrand.indexOf('C');
   int indexG= upperStrand.indexOf('G');
   System.out.println("The first A is at index " +indexA);
   System.out.println("The first T is at index " +indexT);
   System.out.println("The first C is at index " +indexC);
   System.out.println("The first G is at index " +indexG);
   //User input # of each letter
   System.out.println("Please enter the number of A's ");
 int  StringA = Scan.nextInt();
   System.out.println("Please enter the number of G's ");
  int StringG= Scan.nextInt();
   System.out.println("Please enter the number of C's ");
  int StringC= Scan.nextInt();
   System.out.println("Please enter the number of T's ");
  int  StringT= Scan.nextInt();
  //Results
  System.out.println("Base    %Representation");
  System.out.println("----    ---------------");
  double percentA= (StringA/nucleoTide)*100;
   System.out.println("A:      " +percentA+"%");
   double percentG= (StringG/nucleoTide)*100;
   System.out.println("G:      " +percentG+"%");
   double percentC= (StringC/nucleoTide)*100;
   System.out.println("C:      " +percentC+"%");
   double percentT= (StringT/nucleoTide)*100;
   System.out.println("T:      " +percentT+"%");

   
   }
}
   