import java.util.Scanner;
public class Qn6_simple {
    public static void main(String[] args) {
        Scanner greaternumber=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=greaternumber.nextInt();
        System.out.println("Enter the second number: ");
        int b=greaternumber.nextInt();

        if(a>b){
            System.out.println(a+" Is Greater Than "+b);
        }
        else{
            System.out.println(b+" Is Greater Than "+a);
        }
        greaternumber.close();
    }
}