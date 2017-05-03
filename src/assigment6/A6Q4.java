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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter in  10 marks");
        //entering in the marks to be odered
        double[] marks = new double[10];
        
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextInt();
        }
        
        for (int p = 0; p < 9; p++) {

            for (int i = 0; i < 9; i++) {
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
        //sends outordered numbers
        for (int p = 0; p < 10; p++) {
            System.out.print(marks[p] + ", ");
        }
    }

}

