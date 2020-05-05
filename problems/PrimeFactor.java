/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * Purpose: Finding the prime factor of the number 600,851475143
 */
public class PrimeFactor {
    
    public static long prim(long x){
        long a=2;
        while(x>1)
        {
            if((x%a)==0){
                x=x/a;
            }
            else
                a++;
        }
        return a;
    }
    
    public static void main(String[]args){
        long y = 600851475143l;
        
        System.out.println(prim(y));
    }
       
}
