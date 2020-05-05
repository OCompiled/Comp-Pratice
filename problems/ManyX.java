/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * Purpose: Find the # of times X occures as a digit within a range of numbers
 */
import java.util.*;
public class ManyX {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int m=scan.nextInt();
        int count =0;
        String w;
        
        while(m-->0){
            int n= scan.nextInt();
            if(scan.hasNextInt()){
                int o = scan.nextInt();
                int p = scan.nextInt();
                int rs =o+1;
                String r = String.valueOf(n);
                
                while(rs<p){
                    w = String.valueOf(rs);

                    if(-1!= w.indexOf(r)){
                        count++;
                    }
                    rs++;
                    //count++;
                }
            }
            System.out.println(count);
        }
    }
}
