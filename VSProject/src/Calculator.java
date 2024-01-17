import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter a Number:- ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("Enter Operaotr:- ");
        char operator = sc.next().charAt(0);
        System.out.println();
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;  
            case '/':
            System.out.println(a/b);
            case '%':
            System.out.println(a%b);
            break;
            default :
            System.out.println("Invalid expression");
        }
    }
}