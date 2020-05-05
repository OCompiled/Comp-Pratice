/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * Purpose: To get the 10001th prime number.
 */
public class prime10001st {
    
    //This method is used to check if a number is prime
   private static boolean primeNum(long num)
   {   
       if(num <1) //Constraint that prime number must be greater than 1. 
           return false;
       if(num ==1|| num ==2) //if the number is 1 or 2.
           return true;
       if(num%2==0) //if the number is even then false.
           return false;
       
       //This is making sure the numbers are above 9, and
       for(long i=3L;i*i<=num; i+=2)
       {
           if(num %i==0) //if they are and they are a multiple of 3 then false.
               return false;
           
       }
       return true; //other than that true.
   }
   
   //This is to find the position of the Prime number.
   public static long primeIndex(int index)
   {
       if(index<1)// if position is less than 1
           return 1;
       if(index ==1) //if position is is 1
           return 2;
       
       //So if primeNum() returns true add 1 to to i.
       //i represents 10001. Because when i == 10001 then program prints.S
       int i=1;
       for(long n=3L; ;n+=2)
       {
           if(primeNum(n))
               if(++i==index)
                   return n;
       }
   }
   
   public static void main (String[]args){
       System.out.println(primeIndex(10001));
   }
}
