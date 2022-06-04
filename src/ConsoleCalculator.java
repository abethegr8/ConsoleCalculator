//Creating a calculator per class assignment


import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Abraham's Calculator!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Instructions are below: \n");
        System.out.println("Please enter two numbers, then we'll ask what type of calculation you'd like between the two. \n");
        System.out.print("Now enter the first number here: ");
        int numOne = sc.nextInt();
        System.out.println();
        System.out.print("Please enter the second number here: ");
        int numTwo = sc.nextInt();
        System.out.println();
        System.out.println("Now enter what type of calculation? Type one of these (add, sub, mult, divide)");
        String calculation = sc.next();
        System.out.println();

        switch(calculation){
            case "add":
                System.out.println("Your result is: " + (numOne + numTwo));
                break;
            case "sub":
                System.out.println("Your result is: " + (numOne - numTwo));
                break;
            case "mult":
                System.out.println("Your result is: " + (numOne * numTwo));
                break;
            case "divide":
                System.out.println("Your result is: " + (numOne / numTwo));
                break;
            default:
                System.out.println("There was an invalid input.");
        }

        sc.close();

    }

}
