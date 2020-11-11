/*
*Author: Jacky Yuan
* Date: Nov 11, 2020
*
 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();
        //output
        System.out.printf("You Entered: %s\n",name);
        System.out.printf("You Entered: %.2f\n",age);

	}
}
