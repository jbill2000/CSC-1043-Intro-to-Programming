//Program Created by Jeremy Bill to calculate Mortgage Possibilities
import java.util.*;
import java.text.*;
public class MortgagePaymentLab
{
public static void main (String[] args)
   {
   //Create Number Format for use later
   NumberFormat dollarformat= NumberFormat.getCurrencyInstance();
  
   //Create the Scanner
   Scanner Scan= new Scanner(System.in);
   //Ask for Values
   System.out.println("What is the values requested for the 2 loans you wish to compare?  " );
   System.out.print("What is the amount of the loan?: " );
   String loanAmount= Scan.next();
   System.out.println();
   System.out.println("First set of terms " );
   System.out.print("Annual interest rate (Ex. 3.5%): ");
   String annualInterestRate= Scan.next();
   System.out.print("Number of months: ");
   int months= Scan.nextInt();
   System.out.println();
   System.out.println("Second set of terms ");
   System.out.print("Annual interest rate (Ex. 3.5%): ");
   String annualInterestRate2= Scan.next();
   System.out.print("Number of months : ");
   int months2=Scan.nextInt();
   System.out.println();
   System.out.println();
   //Calculate and Convert our Strings
   int indexloan= loanAmount.indexOf(loanAmount);
   String loan= loanAmount.substring(indexloan);
   double newLoan= Integer.parseInt(loan);
   
   int annualInterestRate3= annualInterestRate.indexOf('%');
   String annualRate= annualInterestRate.substring(0,annualInterestRate3);
   double newAnnualRate= Double.parseDouble(annualRate);
   double annualRate2= newAnnualRate/100;
   
    
   double monthyPay1= (newLoan*annualRate2);
   double monthyPay2= monthyPay1/12;
  
   double ratePT1= annualRate2/12;
   double ratePT2= 1+ ratePT1;
   double ratePT3= Math.pow(ratePT2,-months);
   double monthlyLoanPayment1= 1- ratePT3;
   
   double output= monthyPay2/monthlyLoanPayment1;
   double monthlyTotal1= output*months;
   
  System.out.println("The monthly payment for loan 1 is " + dollarformat.format(output));
  
  //Calculations for Second set of Monthly Payments
  
   int indexloan2= loanAmount.indexOf(loanAmount);
   String loan2= loanAmount.substring(indexloan2);
   double newLoan2= Integer.parseInt(loan);
   
   
   int annualInterestRate4= annualInterestRate2.indexOf('%');
   String annualRates= annualInterestRate2.substring(0,annualInterestRate4);
   double newAnnualRate1= Double.parseDouble(annualRates);
   double annualRate3= newAnnualRate1/100;
   
      
      
    double monthyPay3= (newLoan2*annualRate3);
   double monthyPay4= monthyPay3/12;
  
   double denom1= annualRate3/12;
   double denom2= 1+ denom1;
   double denom3= Math.pow(denom2,-months2);
   double monthlyLoanPayment2= 1- denom3;
   
   double output2= monthyPay4/monthlyLoanPayment2;
   double monthlyTotal2= output2*months2;
   System.out.println("The monthly payment for loan 2 is " + dollarformat.format(output2));
   
   double monthlypaymin1= Math.min(output,output2);
   System.out.println(" Therefore your minimum payment would be " + dollarformat.format(monthlypaymin1));
   
   System.out.println("With the first loan, you would be paying a total of " + dollarformat.format(monthlyTotal1));
   System.out.println("With the second loan, you would be paying a total of " + dollarformat.format(monthlyTotal2));


   
   
   
   

   }
}