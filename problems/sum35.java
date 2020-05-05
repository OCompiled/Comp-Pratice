package problems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aanto
 * purpose: This find the multiple of a number below 1000.
 */
public class sum35 {
    
    public static void main (String [] args){
        int sum3=0;
        int sum5 =0;
        int sum=0;
        for(int i=999; i>1; i--){
            if(i%3 ==0){
                sum3=sum3+i;
                System.out.println(i);
            }
            
            
            if(i%5 ==0){
                if(i%3==0){
                    
                }
                else{
               sum5= sum5+i;

                }
            }

        }
        sum= sum3+sum5;
        System.out.println(sum);
    }
}
