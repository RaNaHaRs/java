import java.util.*;

public class function{

    Scanner sc =new Scanner(System.in);


    public int sum (){
        
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();

        return a+b;
    }
    
       public static void main(String[] args) {
        function fn = new function();
        System.out.println("The sum of a and b is "+ fn.sum());
    }


 
}
