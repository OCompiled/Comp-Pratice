/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * purpose: to print out all even number in the Fabianice number below 4 million.
 */
public class FibSequence {

    
    public static void main(String[]args){
        int evenNum=0;
        int n=1,m=2, y=0, o=0;
        
        while( n <4000000)
        {
            if(n%2==0)
                evenNum= evenNum+n;
            if(m%2==0)
                evenNum= evenNum+m;
            y = n+m;
            o=y+m;
             n=y;
             m=o;          
        }
        System.out.println(evenNum);

    }
}
