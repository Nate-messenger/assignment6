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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of people in your sample");
        //gets the number of people to use as the array legnth
        int s = input.nextInt();
        //creates the array the legnth of the number of students
        double[] heights = new double[s];
        System.out.println("Please enter " + s + " heights");
        //gets the heights
        for (int i = 0; i < s; i++) {
            heights[i] = input.nextDouble();
        }
        //calculate the average
        double sum = 0;
        for (int i = 0; i < s; i++) {
            sum = sum + heights[i];
        }
        double average = sum / s;
        int p = 0;
        for (int i = 0; i < s; i++) {
            if (heights[i] > average) {
                p++;
            }
        }
        //printing out all info gathered
        System.out.println("the average is " + average);
        System.out.println("there are " + p + " who are above the sample average height");
        for (int i = 0; i < s; i++) {

            if (heights[i] > average) {
                System.out.print(heights[i] + ", ");
            }
        }
        System.out.println("");
    }
}
