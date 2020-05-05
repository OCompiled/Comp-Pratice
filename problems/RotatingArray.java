/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto Purpose: TO rotate an array by a certain number.
 */
import java.util.*;

public class RotatingArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c;

        System.out.println("Number of cases");
        c = scan.nextInt();

        while (c > 0) {

            System.out.println("Enter size and rotation num");
            int s = scan.nextInt();
            int r = scan.nextInt();

            arrayRotation(s, r);
            c--;
        }
    }

    public static int[] arrayRotation(int s, int r) {

        int[] arr = new int[s];
        int[] rArr= new int[r];
        int convert[]= new int[s];
        String num, num2[];
        int count = 0, temp = 0; 
        Scanner scan = new Scanner(System.in);
        num= scan.nextLine();
        
        for(int i=0; i<arr.length; i++){
            num2= num.split(" ");
            convert[i] = Integer.parseInt(num2[i]);

            if (count < r) {
                rArr[count] = convert[i];
                count++;
            } else {
                arr[temp] = convert[i];
                temp++;
            }
        }
        
        for (int j = 0; j < rArr.length; j++) {
            arr[temp] = rArr[j];
            temp++;
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
