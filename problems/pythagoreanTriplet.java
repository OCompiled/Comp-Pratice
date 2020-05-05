/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * Purpose: Find one Pythagorean triplet for which a+b+c=1000. Find the product of abc
 */
public class pythagoreanTriplet {
    
    //finding the greatest common divisor
    public static int gcd(int a, int b){
        
        int y=0;
        int x=0;
        if(a>b) {
            x=a;
            y=b;
        } else {
            x =b;
            y=a;
        }
        
        while(x%y !=0){
            int temp =x;
            x=y;
            y=temp%x;
        }
        return y;
    }
    
    
    
    
    public static void main (String[]args){
        
        //a2+b2=c2
        int a=0, b=0, c=0;
        int s=1000;  //the sum
        int m =0, k=0, n=0, d=0; //The Euclid therory:  a=d(m^2-n^2), b=2d*m*n, c=d(m^28n^2)
        boolean found = false;
        
        int mlimit = (int) Math.sqrt(s/2);
        for(m=2; m<=mlimit; m++){
            if((s/2)% m==0){ // m is found
                if(m%2==0){ //ensure that we find an odd number for k
                    k=m+1;
                }else{
                    k=m+2;
                }
                while(k<2* m&& k <=s/(2*m)){
                    if(s/(2*m)% k==0 && gcd(k,m)==1){
                        d= s/2/(k*m);
                        n=k-m;
                        a=d*(m*m-n*n);
                        b= 2*d*n*m;
                        c= d*(m*m+n*n);
                        found = true;
                        break;
                    }
                    k+=2;
                }
            }
            if(found){
                    System.out.println(c*a*b);
                break;
            }
        }
        
        
    }
}
