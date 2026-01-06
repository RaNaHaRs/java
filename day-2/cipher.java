import java.util.*;

public class cipher{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Text you want to encrypt :");
        String text = sc.nextLine();
        
        System.out.print("Enter the key number (0-25) :");
        int key = sc.nextInt();

        String Encrypt = " ";

        for (int i = 0 ; i < text.length() ; i ++){
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z'){
                int pos = ch - 'A';
                int newPos = (pos + key)%26;
                char newCh = (char) ('A' + newPos);
                Encrypt += newCh ;
            } else if (ch >= 'a' && ch <='z') {
                int pos = ch - 'a';
                int newPos = (pos + key)%26;
                char newCh = (char) ('a' + newPos);
                Encrypt += newCh ;
            } else {
                Encrypt += ch ;
            }
        }

        System.out.println("Encrypted :" + Encrypt);

        sc.close();

    }
}
