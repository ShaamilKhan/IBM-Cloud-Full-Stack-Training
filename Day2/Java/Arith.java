import java.util.*;

public class Arith{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firt number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The sum is: " + (a+b));
        System.out.println("The difference is: " + (a-b));
        System.out.println("The product is: " + (a*b));
        System.out.println("The quotient is: " + (a/b));
        sc.close();     
    }
}