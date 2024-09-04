import java.util.Scanner;

public class BudgetCalculatorProject
{
    public static void main(String[]args)
    {
        /*
         Constant part of the assignment
        */
        final double SAVINGS_PERCENT = 0.20;
        final double Rent_PERCENT = 0.30;
        final double GROCERIES_PERCENT = 0.15;
        final double ENTERTAINMENT_PERCENT = 0.10;
        /* Scanner console
        */
        Scanner console = new Scanner(System.in);

        // Asking for Monthly salary to do the rest of the calculating
        System.out.println("What is you salary?" );
        double monthlySalary;
        monthlySalary = console.nextInt();

        // Multiplying the Saving percentage and Monthly Salary to get Saving amount
        double savedAmount = SAVINGS_PERCENT * monthlySalary;
        System.out.println("Your saving amount is "+ savedAmount);

       // Multiplying Rent percentage and Monthly Salary to get Rent Amount
        double rentAmount = Rent_PERCENT * monthlySalary;
        System.out.println("Your rent amount is "+ rentAmount);
        
        // Multiplying Goceries Percentage with the Monthly Salary to get the Groceries Amount
        double groceriesAmount = GROCERIES_PERCENT * monthlySalary;
        System.out.println("Your groceries amount is "+ groceriesAmount);
        
        // Multiplying Enterainment Percentage with the Monthly Salary to get the Enterainment Amount
        double entertainmentAmount = ENTERTAINMENT_PERCENT * monthlySalary;
        System.out.println("Your interainment amount is "+ entertainmentAmount);
        
        // Adding All the thing that were multiply to see the amount that you spent
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        System.out.println("Your total expenses is "+ totalExpenses);

        // Subtracting Monthlyl Salary with Totla Expenses to get the remaning balance
        double remainingBalance = monthlySalary - totalExpenses;
        System.out.println("Your remaining balance is "+ remainingBalance);


    }
}