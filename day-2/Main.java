import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter 1 for sum \nEnter 2 for subtraction \nEnter 3 for multiplication \nEnter 4 for Division \nEnter 5 for wxiting the program");
        System.out.print("Enter Operation you want : ");
        int Operator = sc.nextInt();


    do { 
        switch (Operator) {
                case 1:
                    System.out.println("The sum of " + num1 +" and " + num2 + " is " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("The sum of " + num1 +" and " + num2 + " is " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("The sum of " + num1 +" and " + num2 + " is " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("The sum of " + num1 +" and " + num2 + " is " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Program ended.");

                default:
                    System.out.println("No operation is selected...");
                    break;
            }
    } while (Operator!=5);
        
    }
}
