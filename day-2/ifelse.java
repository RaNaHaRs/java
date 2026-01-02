import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        if ( a > b && a > c) {
            System.out.println("The higest value is " + a);
        }
        if( b > a && b > c){
            System.out.println("The higest value is : "+b);
        }
        else {
            System.out.println("The higest value is : " + c);
        }

    }
}