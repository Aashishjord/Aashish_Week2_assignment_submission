import java.util.Scanner;
public class Qn3_simple {
public static void main(String[] args) {
    try (Scanner Checkevenodd = new Scanner(System.in)) {
        System.out.println("Enter the number: ");
        int n=Checkevenodd.nextInt();
        if(n % 2==0){
            System.out.println("The number is even number.");
        }
        else{
            System.out.println("The number is odd number. ");
        }
    }
    
}
}