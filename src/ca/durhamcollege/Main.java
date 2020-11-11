/*
*Author: Jacky Yuan
* Date: Nov 11, 2020
*
 */

package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        float age = 0.0f;

        //sentinel variable
        boolean isValidInput = false;

        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if((age <=0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age between 0.0 and 120.0");
                    keyboard.nextLine();
                    isValidInput = false;
                }

            } catch (InputMismatchException InputMismatchException) {
                System.out.println("Error; You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;
            }
        }
        while(!isValidInput);


        //multidimentional array
        int rows = 8;
        int cols = 8;

        float[][] board = new float[rows][cols];

        for (int x=0; x < rows; x++)
        {
            for (int y=0; y< cols; y++)
            {
                board[x][y] = (float)(Math.random()*100.0) + 1.0f;
            }
        }
        for(int i=0; i<10;i++)
        {
            var randomRows = (int) (Math.random() * rows);
            var randomCols = (int) (Math.random() * cols);
            System.out.print("For row: " + randomRows + " col: " + randomCols + " ");
            System.out.printf("The random number is: %.2f\n", board[randomRows][randomCols]);
        }



        //output
        System.out.println();
        System.out.printf("You Entered: %s\n",name);
        System.out.printf("You Entered: %.2f\n",age);

	}
}
