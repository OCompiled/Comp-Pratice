/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * purpose: Create a program that sorts the array.
 */
import java.util.*;

public class bubbleFunction {
    
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        int x,s,v;
        bubbleFunction bubs = new bubbleFunction();
        
        System.out.println("Enter the amount of Array");
        x= scan.nextInt();
        
        
        while(x>0){
            System.out.println("Enter size of array");
            s= scan.nextInt();
            
            System.out.println("Enter the values for the array");
            for(int i=0; i <s; i++){
                v= scan.nextInt();
                num.add(v);
            }
           bubblesort(num);
           num.removeAll(num);
           x--;
        }
    }
    
    public static ArrayList<Integer> bubblesort(ArrayList<Integer> num){
        
        for(int i =0; i < num.size(); i++){
            for(int j=0; j< num.size()-1-i; j++){
                if(num.get(j)> num.get(j+1)){
                    int temp = num.get(j);
                    num.set(j, num.get(j+1));
                    num.set(j+1, temp);
                }
            }
            System.out.print("soreted:"+(i+1)+": ");
            printArray(num);
        }
        return num;
    } 
    public static void printArray(ArrayList<Integer> num){
        for(int i=0; i< num.size(); i++)
        {
            System.out.print(num.get(i)+ " ");
        }
        System.out.println();
    }
}
