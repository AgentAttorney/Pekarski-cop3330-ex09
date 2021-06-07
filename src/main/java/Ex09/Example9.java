package Ex09;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int gal = 350, count = 0;

        System.out.println("Enter the length and width of the room.");
        int length = input.nextInt();
        int width = input.nextInt();
        
        int sq_feet = length * width;

        while(true)
        {
            count++;
            if(sq_feet <= (count * gal)) {
                System.out.print("You will need to purchase " + count + " gallons of paint to cover " +
                         sq_feet + " square feet.");
                break;
            }
        }
    }
}
