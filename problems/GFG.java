/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 */
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0)
		{
		    int num=sc.nextInt();
		    int lb = sc.nextInt();
		    int ub = sc.nextInt();
		    int i,check,result,count=0;
		    for(i=lb+1;i<ub;i++)
		    {
		        check = i;
		        while(check>0)
		        {
		            result = check%10;
		            check = check/10;
                            
		            if(result==num)
                                System.out.println(result);
		                count++;
		        }
		    }
		    System.out.println(count);
		    
		}
	}
}
