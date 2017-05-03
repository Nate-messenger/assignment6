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
public class A6Q5 {

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
        for (int p = 0; p < s; p++) {
            System.out.print(marks[p] + ", ");
        }
        int med = s / 2;
        //if the number of people is even prints out 2 middle numbers
        if (s % 2 == 0) {

            System.out.println("");
            System.out.println("your medians are ");
            System.out.print(marks[med - 1] + ", ");
            System.out.print(marks[med]);
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("the median is " + marks[med]);
        }
    }

}
