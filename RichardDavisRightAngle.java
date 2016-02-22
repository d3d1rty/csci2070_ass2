import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * This program produces two mirrored right triangles.
 * Author: Richard Davis
 */

public class RichardDavisRightAngle
{
  public static void main(String args[])
  {
    int length = 0; // the length of each side of the triangles
    int totalLength; // total length of drawing area
    boolean done = false; // controls loop for user input
    Scanner in = new Scanner(System.in);

    // prompts user for input
    while (!done) {
      System.out.print("Enter the length -> ");
      // tries to assign user input as length; catches InputMismatchException
      try {
        length = in.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input; must be of type integer.");
        System.exit(0);
      }
      // ends loop if input is an integer within 1-15 range
      if (length > 0 && length <= 15) {
        done = true;
      } else {
        System.out.println("Invalid length entered. Try again.");
      }
    }

    // calculates length of total drawing area
    totalLength = (length * 2) + 1;

    // "draws" the triangles
    for (int i = 1; i < length+1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("X");
      }
      for (int k = (totalLength - (i * 2)); k > 0; k--) {
        System.out.print(" ");
      }
      for (int l = 0; l < i; l++) {
        System.out.print("X");
      }
      System.out.print("\n");
    }

    // terminates program
    System.exit(0);
  }
}
