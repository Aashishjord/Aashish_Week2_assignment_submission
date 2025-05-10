//Write a Java program that asks the user to enter two numbers and an operator (+, -, *, /) and then calculates the result based on the operator using if-else statements.
import java.util.Scanner;
public class Qn8_simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operators:(+ - * %)");
        char oper=sc.next().charAt(0);
        switch (oper) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Result: "+a+b);
                break;
            case '*':
                System.out.println("Result: "+a*b);
                break;
            case '/':
                System.out.println("Result: "+a/b);
                break;
            default:
            System.out.println("Please enter the mentioned operators:");
        }
        sc.close();
        
    }
}
