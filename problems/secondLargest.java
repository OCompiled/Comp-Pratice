/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto Purpose: Print out the second largest number in an array.
 */
import java.util.*;

public class secondLargest {

    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of input?");
        x = scan.nextInt();

        if (1 <= x && x <= 50) {
            while (x > 0) {
                System.out.println(cal(x));
                
                x--;
            }
        }

    }

    public static int cal(int x) {
        int y, temp2 = 0, temp=0;
        int arr[];
        String z;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many value");
        y = scan.nextInt();
        arr = new int[y];
        if (1 <= y && y <= 500) {
            System.out.println("Enter the values");
             z = scan.nextLine();
            for (int i = 0; i < arr.length; i++) {
                String p=z.substring(1,z.indexOf(' '));
                 int m = (int)z.indexOf(i+1);
                arr[i] = m;
                if (temp < arr[i]) {
                    temp = arr[i];
                }
                if(arr[i] < temp){
                    if(temp2<arr[i])
                        temp2=arr[i];
            }   
        }
        }
        return temp2;
    }
}
