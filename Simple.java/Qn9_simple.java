import java.util.Scanner;
public class Qn9_simple {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=num.nextInt();
        if(a>0){
            System.out.println("The number is a positive number");
        }
        else if(a<0){
            System.out.println("The number is a negative number");
        }
        else{
            System.out.println("The number is zero");
        }
        num.close();



    }
}