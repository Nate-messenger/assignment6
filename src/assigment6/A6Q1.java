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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of students");
        ///gets the number of students to use as the array legnth
        int s = input.nextInt();
        //creates the array the legnth of the number of students
        double[] marks = new double[s];
        System.out.println("Please enter " + s + " marks");
        //gets the marks
        for (int i = 0; i < s; i++) {
            marks[i] = input.nextDouble();
        }
        //calculate the averave
        double sum = 0;
        for (int i = 0; i < s; i++) {
            sum = sum + marks[i];
        }
        double average = sum / s;
        //rounds to 2 decimal places
        average = Math.round(average * 100) / 100.0;
        //display average
        System.out.println("the average is " + average + "%");
    }
}
