import java.util.Scanner;

public class ConditionalStatement{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0)
        System.out.println("Even");
        else if(number == 1)
        System.out.println("Neither Even Nor Odd");
        else
        System.out.println("Odd");
    }
}