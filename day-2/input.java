import java.util.*;

public class input{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        int n = sc.nextInt();

        n += 10;
        System.out.println("Output:" + n);
    }
}