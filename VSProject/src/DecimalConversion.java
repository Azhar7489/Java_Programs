import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal conversion:- ");
        int dec = sc.nextInt();
        System.out.println(Integer.toBinaryString(dec));
    }  
}
