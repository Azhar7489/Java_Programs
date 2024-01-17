import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args) {
        int a = 10, b = 11, c = 14;
        if(a>=b && a>=c)
        System.out.println("A");
        else if (b>=c) 
        System.out.println("B");
        else
        System.out.println("C");
    }
}