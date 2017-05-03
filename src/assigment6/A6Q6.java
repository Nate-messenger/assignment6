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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("please enter in how manny people are in your sample");
        int s = input.nextInt();
        System.out.println("please enter in " + s + " marks");
        //entering in the marks to be odered
        double[] marks = new double[s];
        for (int i = 0; i < s; i++) {
            marks[i] = input.nextInt();
        }
        for (int p = 0; p < s - 1; p++) {

            for (int i = 0; i < s - 1; i++) {
                //i is x
                //i + 1 is y
                if (marks[i] > marks[i + 1]) {
                    double nm = marks[i + 1];
                    double nm2 = marks[i];
                    marks[i] = nm;
                    marks[i + 1] = nm2;
                }
            }
        }
        double sum = 0;
        for (int i = 0; i < s; i++) {
            
            //add number that it is on to the current sum
            sum = sum + marks[i];
        }
        //printing out gathered info
        for (int p = 0; p < s; p++) {
            System.out.print(marks[p] + ", ");
        }
        System.out.println("the lowest mark is " + marks[0]);
        System.out.println("the heighest mark is " + marks[s]);
        
        double average = sum/s;
        System.out.println("the average is" + average);
    }
    
}
