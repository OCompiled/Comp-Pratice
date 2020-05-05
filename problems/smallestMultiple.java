/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author aanto
 * purpose: What is the smallest number that is divisible with no remainder from 1-20.
 *          1-10 is 2520.
 */
public class smallestMultiple {

    static int y = 1;

    public static int calculation(int x) {

        int i = 1, w, n = 1;
        while (i <= 20) {
            w = x % i;
            if (w == 0) {
                i++;
            } else {
                i = 1;
                x++;
            }
        }
        if (i == 20) {
            y = 0;
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 20;
        System.out.println(calculation(x));

    }
}
