import java.util.Scanner;
import java.io.*;

/**
 * This program counts the occurrences of a letter in a file.
 * Author: Richard Davis
 */

public class RichardDavisLetterCounter
{
  public static void main(String args[])
  {
    String fileName;
    char target;
    int numTargets = 0;
    Scanner in = new Scanner(System.in);

    // gets file name from user
    System.out.print("Enter the file name -> ");
    fileName = in.nextLine();

    // gets target character from user, truncates extra characters
    System.out.print("Enter the target character -> ");
    target = in.nextLine().charAt(0);

    // tries to open specified file, catches FNF exception
    try {
      File inputFile = new File(fileName);
      Scanner text = new Scanner(inputFile);
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
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
      System.exit(0);
    }

    // displays results
    System.out.printf("The character %c occurs %d times in file %s\n",
        target, numTargets, fileName);

    // terminates program
    System.exit(0);
  }
}
