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
public class a6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers to be evaluated");
        int[] num = new int[2];
//populates the array
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        //checks wich one is bigger then display acordingly
        if (num[0] > num[1]) {
            System.out.println(num[1] + ", " + num[0]);
        } else {
            System.out.println(num[0] + ", " + num[1]);
        }
    }
}
