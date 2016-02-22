import java.util.Scanner;
import java.io.*;

/**
 * This program converts the characters in a file to uppercase.
 * Author: Richard Davis
 */

public class RichardDavisUpperFile
{
  public static void main(String args[]) throws IOException
  {
    System.out.println("Richard Davis' Uppercase File Converter");
    String fileNameR, fileNameW, line;
    Scanner in = new Scanner(System.in);

    // gets name of file to reads from and opens for reading
    System.out.print("Enter the name of the file to convert -> ");
    fileNameR = in.nextLine();
    File fileR = new File(fileNameR);
    Scanner reader = new Scanner(fileR);

    // gets name of file to write to and opens for writing
    System.out.print("Enter the name of the file to write -> ");
    fileNameW = in.nextLine();
    File fileW = new File(fileNameW);
    PrintWriter writer = new PrintWriter(fileW);

    // reads first file and prints converted string to second file
    while (reader.hasNext()) {
      line = reader.nextLine();
      writer.println(line.toUpperCase());
    }

    // closes files
    reader.close();
    writer.close();

    // terminates program
    System.out.println("=== File converted! ===");
    System.exit(0);
  }
}
