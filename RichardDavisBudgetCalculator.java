import java.util.Scanner;

/**
 * This program calculates a budget.
 * Author: Richard Davis
 */

public class RichardDavisBudgetCalculator
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    double payRate, tempHours, grossPay;
    double hours = 0;

    System.out.println("Richard Davis' Budget Calculator");

    // prompts user for pay rate
    System.out.print("Enter your hourly pay -> ");
    payRate = in.nextDouble();

    // prompts user for hours worked each day for the month
    for (int i = 0; i < 4; i++) {
      System.out.println("Hours for Week " + (i+1));
      for (int j = 0; j < 5; j++) {
        System.out.print("Enter hours worked for Day " + (j+1) + " -> ");
        tempHours = in.nextDouble();
        hours = hours + tempHours;
      }
    }

    // calculates gross pay
    grossPay = hours * payRate;

    System.out.println("Gross pay is " + grossPay);
  }
}
