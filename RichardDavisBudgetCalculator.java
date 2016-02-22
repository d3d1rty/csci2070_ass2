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
    double payRate, tempHours, grossPay, diff;
    double costs = 0;
    double hours = 0;
    boolean done = false;
    String check;

    System.out.println("Richard Davis' Budget Calculator");

    // prompts user for pay rate
    System.out.print("Enter your hourly pay -> ");
    payRate = in.nextDouble();

    // prompts user for hours worked each day for the month
    for (int i = 0; i < 4; i++) {
      System.out.println("=== Hours for Week " + (i+1) + " ===");
      for (int j = 0; j < 5; j++) {
        System.out.print("Enter hours worked for Day " + (j+1) + " -> ");
        tempHours = in.nextDouble();
        hours = hours + tempHours;
      }
    }

    // calculates gross pay
    grossPay = hours * payRate;

    // prompts user to enter expenses, loops until confirmed
    System.out.print("=== Monthly Expenses ===\n");
    while (!done) {
      System.out.println("Enter your monthly expenses at the prompts");
      System.out.print("Rent -> ");
      costs += in.nextDouble();
      System.out.print("Electricity -> ");
      costs += in.nextDouble();
      System.out.print("Automobile -> ");
      costs += in.nextDouble();
      System.out.print("Fuel -> ");
      costs += in.nextDouble();
      System.out.print("Groceries -> ");
      costs += in.nextDouble();
      System.out.print("Insurance -> ");
      costs += in.nextDouble();
      System.out.print("Miscellaneous -> ");
      costs += in.nextDouble();

      System.out.print("Are these expenses correct? (y/n) -> ");
      in.nextLine();
      check = in.nextLine();
      if (check.compareTo("y") == 0) {
        done = true;
      }
    }

    // displays results
    System.out.printf("\nTotal monthly gross pay: $%8.2f\n", grossPay);
    System.out.printf("Total monthly expenses:  $%8.2f\n", costs);

    // determines if under or over budget
    diff = grossPay - costs;
    if (diff > 0) {
      System.out.printf("You are under budget by: $%8.2f\n", diff);
    } else if (diff < 0) {
      System.out.printf("You are over budget by:  $%8.2f\n", diff);
    } else {
      System.out.println("You are not over or under budget");
    }

    // terminates program
    System.exit(0);
  }
}
