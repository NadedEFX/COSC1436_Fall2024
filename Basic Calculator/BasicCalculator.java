import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args)
    {
        /*
        Scanner for the for the keyboard input name SyScanner as a nickname
        for the bot
       */
        Scanner SyScanner = new Scanner(System.in);

        /*
        boolean to end the program
        */
        boolean exit = false;

        /*
        * While(!exit) to make the operation loop
        */
        while(!exit){
        System.out.println("Welcome to the Java Calculator!");

        System.out.println("Enter an operation (+,-,*,/) or exit to quit");

        /*
        The part to see if the user wants to exit or not
        */
        String operationInput = SyScanner.next();
        char operation = operationInput.charAt(0);
        if (operationInput.equalsIgnoreCase("exit")){
        exit = true;
        System.out.println("Exiting the calculator. Goodbye!");
        break;
        }

        /*
        *part to enter your numbers to get the sum or product of your answer
        */
        System.out.println("What is your first number");
        double firstNumber;
        firstNumber = SyScanner.nextDouble();

        System.out.println("What is your second number");
        double secondNumber;
        secondNumber = SyScanner.nextDouble();

        /*
        Choosing the operation
        */
       switch (operation){

        // Adding the numbers
             case'+':
                double result = firstNumber + secondNumber;
                System.out.println("The result of " + firstNumber + " + " + secondNumber + " = " + result);
                break;

        // Subtracting the numbers
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("The result of " + firstNumber + " - " + secondNumber + " = " + result);
                break;

        // Mutiplying the numbers
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("The result of " + firstNumber + " * " + secondNumber + " = " + result);
                break;

        // Dividing the number
            case '/':
                /*
                * The if to make 0 not be able to divide
                */
                if (secondNumber == 0){
                    System.out.println("Error: Division by zero is not allowed.");
                    break;
                }
                result = firstNumber / secondNumber;
                System.out.println("The result of " + firstNumber + " / " + secondNumber + " = " + result);        
                break; 
                

            default:
                System.out.println("Invalid operator!");
                break;

         /*
         * part to see if the loop ends or keeps on going
         */     
       }
        System.out.println("Would you like to perform another operation (yes/no)?");
        String anotherOperation = SyScanner.next();
        if (anotherOperation.equalsIgnoreCase("no")){
           exit = true;
            System.out.println("Exiting the calculator. Goodbye!");
        }
        }
        
        
        SyScanner.close();
    }

}