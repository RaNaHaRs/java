

public class day1 {
    public static void main(String[] args) {
        //hello world program
        System.out.println("Hello, World!");

        // variables declaration
        System.out.println();
        System.out.println();

        int a = 1;
        System.out.println("this is variable initalization"+a);
        
        System.out.println();
        System.out.println();

        // type of variables
        //8 types int,float,long,double,boolean,byte,char,short
        System.out.println("Types of variable");

        int b = 2;
        float c = 3.14f;
        long d = 123456789L;
        double e = 3.14159;
        boolean f = true;
        byte g = 127;
        char h = 'A';
        short i = 32767;
        System.out.println("int: " + b + "\nfloat: " + c + "\nlong: " + d + "\ndouble: " + e + "\nboolean: " + f + "\nbyte: " + g + "\nchar: " + h + "\nshort: " + i);

        System.out.println();
        System.out.println();

        // type casting
        System.out.println("Type casting");

        // implicit casting  byte->short->char->int->long->float->double
        int j = 10;
        double k = j; // int to double
        System.out.println("Implicit casting: " + k);

        // explicit casting double->float->long->int->char->short->byte
        double l = 9.78;
        int m = (int)l; // double to int
        System.out.println("Explicit casting: " + m);

        System.out.println();
        System.out.println();

        // Arithmetic operators(+,-,*,/,%)
        System.out.println("Arithmetic Operator");

        int num1 =2 , num2 =5;

        //Addition 
        int sum = num1 + num2;

        //subtraction 
        int sub = num1 - num2;

        //multiplication 
        int multi = num1 * num2;

        //division 
        int divide = num1 / num2;

        //modulo 
        int modulo = num1 % num2;

        System.out.println("Addition : "+ sum + "\nSubtraction : " + sub + "\nMultiplication : " + multi + "\nDivision : " + divide + "\nModulo : " + modulo);

        System.out.println();
        System.out.println();
        
        //Unary operators(++,--)
        System.out.println("Unary operator");
        System.out.println("Postincrement : " + (num1++));
        System.out.println("Preincrement : " + (++num1));
        System.out.println();
        System.out.println("Postdecrement : " + (num1--));
        System.out.println("Predecrement : " + (--num1));

        System.out.println();
        System.out.println();

        //Assignment operator (+=,-=,=,/=,*=,%=)
        System.out.println("Assignment Operator");

        num2 += 5;
        System.out.println("after += : " + num2);

        num2 -= 5;
        System.out.println("After -= : " + num2);

        num2 *= 5;
        System.out.println("After *= : " + num2);

        num2 /= 5;
        System.out.println("After /= : " + num2);

        num2 %= 5;
        System.out.println("After %= : " + num2);

        num2 = 5;

        System.out.println();
        System.out.println();

        //Relational operator(>,<,>=,<=,!=,==)
        System.out.println("Relational Operator");

        System.out.println("num1 > num2 : " + (num1 > num2));
        System.out.println("num1 < num2 : " + (num1 < num2));
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));
        System.out.println("num1 != num2 : " + (num1 != num2));

        System.out.println();
        System.out.println();

        // Logical Operator
        System.out.println("Logical Operator");

        boolean tr = true;
        boolean fa = false;

        System.out.println("If tr && fa = " + (tr && fa));
        System.out.println("If tr || fa = " + (tr || fa));
        System.out.println("If !fa = " + (!fa));

        System.out.println();
        System.out.println();

        //ternary operators
        System.out.println("Ternary Operators");

        int t1 = 5 , t2 = 4;

        int max = (t1 > t2) ? t1 : t2 ;
        
        System.out.println("The max using ternary Opertaor:" + max);

        

    }
}