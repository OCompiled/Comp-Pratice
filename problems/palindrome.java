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
public class palindrome {

    public static int check(int x) {
        int result = 0;

        while (x != 0) {
            int num = x % 10;
            result = result * 10 + num;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {

        int total, hold, result = 0;
        for (int i = 100; i < 999; i++) {
            for (int m = 100; m < 999; m++) {
                total = i * m;
                hold = check(total);
                if (total == hold) {
                    if (hold > result) {
                        result = hold;
                    }

                }
            }

        }
        System.out.println(result);
    }
}
