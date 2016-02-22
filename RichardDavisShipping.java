import java.util.Scanner;

/**
 * This program calculates shipping costs.
 * Author: Richard Davis
 */

public class RichardDavisShipping
{
  public static void main(String args[])
  {
    double rateOne = 1.10; // rate for lightest package
    double rateTwo = 2.20; // rate for light package
    double rateThree = 3.70; // rate for medium package
    double rateFour = 3.80; // rate for heavy package
    double distance, weight, charges;
    Scanner in = new Scanner(System.in);

    // prompts user for distance in miles
    System.out.print("Enter the distance in miles -> ");
    distance = in.nextDouble();

    // prompts user for weight of package
    System.out.print("Enter the weight of the package -> ");
    weight = in.nextDouble();

    // performs calculation for cost based on weight
    if (weight <= 2) {
      charges = ((int)distance / 500) * rateOne;
    } else if (weight > 2 && weight <= 6) {
      charges = ((int)distance / 500) * rateTwo;
    } else if (weight > 6 && weight <= 10) {
      charges = ((int)distance / 500) * rateThree;
    } else {
      charges = ((int)distance / 500) * rateFour;
    }

    // displays results
    System.out.printf("Shipping charges: $%6.2f\n", charges);

    // terminates program
    System.exit(0);
  }
}
