/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * Purpose: Calculate the time(in min) the last patient needs to wait 
 */
import java.util.*;

public class DoctorClinic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner Object
        int t = sc.nextInt(); //reading input
        
        //checking the value of t, and then decrementing t
        while (t-- != 0) {
            //Reading integer like this, allows you to read group of int with space inbetween 
            int a = sc.nextInt(); //collecting the number of patient
            int b = sc.nextInt(); //The time in min of a new patient

            System.out.println((a - 1) * 10 - (a - 1) * b); //printing result
        }
    }
}
