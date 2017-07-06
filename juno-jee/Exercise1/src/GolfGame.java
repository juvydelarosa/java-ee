import java.util.Scanner;

/*
 * Debugging Exercise - Chapter 4
 *
 * Debug the error(s) and submit to the Dropbox on Angel
 * Please do not submit if it is not debugged
 *
 */

///////////////////////////////////////////////////////////////////////////////
// READ ME FIRST:
//   This program compiles, but, there is logic error in the while statement.
//   Debug the logic error and run the program to calculate your golf score.
//   Try inputting several numbers to get the total score.
//   The program should keep looping until the user selects -1 to terminate.
///////////////////////////////////////////////////////////////////////////////

public class GolfGame {

    Scanner input = new Scanner(System.in);

    public void getTotalScore() {

        int score = 0, total = 0;

        while ( score != -1 )
        {
            System.out.print("Please enter a score [-1 to quit]: ");
            score = input.nextInt();
            System.out.println();
            total += score;
        }

        if (total != -1)
            System.out.println("Your total score is " + total);
    }
}