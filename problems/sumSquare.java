/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * Purpose: To find the difference between the sum of the square and the square of the sum of 100 natural number
 * sum of squares: 1^2+2^2+...10^2 =385
 * square of the sum: (1+2+3...+10)2 = 55^2 =3025
 */

public class sumSquare {
    
    //A method to calculate the sumof square
    public static int sumOfSqares(){
        int value=0;
        for(int i=1; i<=100; i++){
            int hold;
            hold=i*i;
            value+=hold;
        }
        return value;
    }
    
    //A method to calculate the squareOfSum
    public static int squareOfSum(){
        int value=0;
        for(int i=1; i<=100; i++){
            int h=0;
            h=i+h;
            value+=h;

            
        }
        return value;
    }
    
    public static void main (String[]args){
        int total, sum;
        sum= squareOfSum()* squareOfSum();
        //sum=sum*sum;
        //System.out.println(sum);
        total= sum-sumOfSqares();
        System.out.println(total);
        
    }
}
