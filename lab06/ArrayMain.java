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
        // (No code needed.)
        

        // ***** CHECKPOINT 2 *****
        

        // ***** CHECKPOINT 3 *****

        //System.out.println("The average of the numbers is "+???);

        
        // ***** CHECKPOINT 4 *****

        //System.out.println("The minimum element is "+???);


        // ***** CHECKPOINT 5 *****

        //System.out.println("The percentage of even numbers is "+???);


        // ***** CHECKPOINT 6 *****

        //System.out.println(
        //  "The percentage of numbers in the range -300..300 is "+???);


        // ***** CHECKPOINT 7 *****
        
        
        // ***** CHECKPOINT 8 *****

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
        
        // generate number that determines whether:
        // - 0 => only negative numbers
        // - 1 => positive and negative numbers
        // - 1 => only positive numbers
        int rangeNum = numElements % 3;
        
        // determine minimum and maximum ranges
        int min = rangeNum == 2 ? 1 : -999;
        int max = rangeNum == 0 ? -1 : 999;
        
        // return the object
        return rand.ints(numElements, min, max).toArray();
    }
}