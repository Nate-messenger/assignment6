/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment6;

import java.util.Scanner;

/**
 *
 * @author nate
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] num = new int[1000];

        // populating the array from 0 - 1000
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }

        //increases the position to get multiples of the num 
        for (int i = 2; i < num.length; i++) {

            //System.out.println("multiples of " + num[i]);
            for (int x = 2; x <= num.length; x++) {
                int y = i * x;
                //set the multiples to 0
            if (y < 1000) {
                    num[y] = 0;
            }
              
            }

        }
        //prints out anything I havent gotten rid of
        System.out.println("the prime numbers are");
        for (int i = 2; i < num.length; i++) {
            if (num[i] != 0) {
                System.out.println(num[i]);
                
            }
        }

    }
}
