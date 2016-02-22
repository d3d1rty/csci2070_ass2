import java.util.Scanner;
import java.io.*;

/**
 * This program counts the occurrences of a letter in a file.
 * Author: Richard Davis
 */

public class RichardDavisLetterCounter
{
  public static void main(String args[]) throws IOException
  {
    String fileName; // user supplied file name
    char target; // the character to look for
    int numTargets = 0; // the number of targets found
    Scanner in = new Scanner(System.in);

    // gets file name from user
    System.out.print("Enter the file name -> ");
    fileName = in.nextLine();
    File inputFile = new File(fileName);
    Scanner text = new Scanner(inputFile);

    // gets target character from user, truncates extra characters
    System.out.print("Enter the target character -> ");
    target = in.nextLine().charAt(0);

    // continues looping until EOF
    while (text.hasNext()) {
      String textLine = text.nextLine();
      // traverses string, increments numTargets if target found
      for (int i = 0; i < textLine.length(); i++) {
        if (textLine.charAt(i) == target) {
          numTargets++;
        }
      }
    }

    // displays results
    System.out.printf("The character %c occurs %d times in file %s\n",
        target, numTargets, fileName);

    // closes file
    text.close();

    // terminates program
    System.exit(0);
  }
}
