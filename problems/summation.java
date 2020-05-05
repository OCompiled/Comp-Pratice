/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Vector;
import static java.lang.Math.sqrt;
import static java.lang.Math.floor;

/**
 *
 * @author aanto Purpose: To find the sum of all the primes below two million
 */
public class summation {
static int sum=0;
    //This method finds all primes smaller than the limit, using
    // Sieve of eratosthenes
    public static void simpleSieve(int limit, Vector<Integer> prime) {
        boolean mark[] = new boolean[limit + 1]; //The array will use to represent if a number is a prime or not.

        //This is giving the boolean a value
        for (int i = 0; i < mark.length; i++) {
            mark[i] = true;
        }

        //This is to find all the even numbers and make them false.
        for (int p = 2; p * p < limit; p++) {
            //If p is nto changed, then it is a prime
            if (mark[p] == true) {
                //Update all multiples of p
                //This runs thru the list again, and then make all of them false
                for (int i = p * 2; i < limit; i += p) {
                    mark[i] = false;
                }
            }
        }

        //Print all prime numbers and store them in prime
        for (int p = 2; p < limit; p++) {
            //if the p corolating to the the position inn mark is true
            if (mark[p] == true) {
                prime.add(p);
               // System.out.println(p);
                sum=sum+p;
            }
        }
    }

    //prints all prime number smaller than 'n'
    //This works with the other half. SimpleSieve works with 0-> square(n)
    //This worsk with everything above.
    public static void segmentedSieve(int n) {
        //Compute all primes smaller than or equal to square root of n using simple sieve
        int limit = (int) (floor(sqrt(n)) + 1);
        Vector<Integer> prime = new Vector<>();
         
        simpleSieve(limit, prime);

        //Divide the range [0..n-1] in different segments, the segment size is sqrt(n)
        int low = limit;
        int high = 2 * limit;
  

        //process one segment of [0..n-1] are not processed, process one segement at a time
        //Not too sure what this one does.
        while (low < n) {
            if (high >= n) {
                high = n;
            }

            boolean mark[] = new boolean[limit + 1]; //This is making another boolean array

            for (int i = 0; i < mark.length; i++) {
                mark[i] = true; //filling this area, making it true again.
            }
            //Use the found primes by simpleSieve() to find primes in current range
            for (int i = 0; i < prime.size(); i++) {
                //find the minimum num in the {low/high} that is a multiple of prime at i.
                int loLim = (int) (floor(low / prime.get(i)) * prime.get(i));
                if (loLim < low) {
                    loLim += prime.get(i);
                }
                //Marking multipels of p at i position. marking measn to increase by 1.
                for (int j = loLim; j < high; j += prime.get(i)) {
                    mark[j - low] = false;
                }
            }
            //# that are nor marked as false are prime
            for (int i = low; i < high; i++) {
                 //sum =sum+i;
                if (mark[i - low] == true){
                    //System.out.println(i);
                    sum= i+sum;
                }
            }
            
            //Update low and high for next degment
            low = low + limit;
            high = high + limit;
             
        }
       
    }

    public static void main(String[] args) {
        int n = 1999999;
        System.out.println("test: " + n);
        segmentedSieve(n);
        System.out.println("\n SUM: "+ sum);
    }
}
