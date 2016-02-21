import java.util.Scanner;

/**
 * This program calculates shipping costs.
 * Author: Richard Davis
 */

public class RichardDavisShipping
{
  public static void main(String args[])
  {
    double rateOne = 1.10;
    double rateTwo = 2.20;
    double rateThree = 3.70;
    double rateFour = 3.80;
    double distance, weight, charges;
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the distance in miles -> ");
    distance = in.nextDouble();

    System.out.print("Enter the weight of the package -> ");
    weight = in.nextDouble();

    if (weight <= 2) {
      charges = ((int)distance / 500) * rateOne;
    } else if (weight > 2 && weight <= 6) {
      charges = ((int)distance / 500) * rateTwo;
    } else if (weight > 6 && weight <= 10) {
      charges = ((int)distance / 500) * rateThree;
    } else {
      charges = ((int)distance / 500) * rateFour;
    }

    System.out.printf("Shipping charges: $%6.2f\n", charges);

    System.exit(0);
  }
}
