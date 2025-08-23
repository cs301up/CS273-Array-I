import java.io.*;
import java.util.*;

public class ArrayMain {

    /**
     * Our main method.
     *  - Prompt user for a # of elements.
     *  - Create array of that size, using random values in the range
     *    -1000 to 1000, inclusive.
     *  - Compute and print various things about the array's contents.
     * @param args
     */
    public static void main(String[] args) {
        int numElements = getNumElements();
        if (numElements <= 0) {
            System.out.println("We need a positive number.");
            return;
        }

        // declare and initialize our array
        int[] numberArray = createNumberArray(numElements);

        /////////////////////////////////////////////////////////////////
        //   At this point, the array has been created and initialized.
        /////////////////////////////////////////////////////////////////

        // ***** CHECKPOINT 1 *****
        // Print the numbers, followed by a line of dashes


        // ***** CHECKPOINT 2 *****
        // Compute/print the average of the numbers


        //System.out.println("The average of the numbers is "+???);

        
        // ***** CHECKPOINT 3 *****
        // Set a breakpoint somewhere above and show the contents of the array
        

        // ***** CHECKPOINT 4 *****
        // Find/print the smallest number in the array


        //System.out.println("The minimum element is "+???);


        // ***** CHECKPOINT 5 *****
        // Find/print the percentage of numbers that is even


        //System.out.println("The percentage of even numbers is "+???);


        // ***** CHECKPOINT 6 *****
        // Compute/print the percentage of numbers in the range -300 to 300


        //System.out.println(
        //  "The percentage of numbers in the range -300..300 is "+???);


        // ***** CHECKPOINT 7 *****
        // Sort the numbers and print them out
        
        
        // ***** CHECKPOINT 8 *****
        // Print the sorted numbers up to 10 per line
    }
    
    private static int getNumElements() {
        Scanner keyboard = new Scanner(System.in); // set up for keyboard input

        // prompt user for file name; read file name
        System.out.print("Number of elements: ");
        System.out.flush();
        
        return keyboard.nextInt();
    }

    private static int[] createNumberArray(int numElements) {
        // create random-generator object
        Random rand = new Random();
        
        // set the seed, so that we always get the same "random" sequence
        rand.setSeed(38274899339428L);
        
        // return the object
        return rand.ints(numElements, -1000, 1001).toArray();
    }
}