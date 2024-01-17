import java.util.Scanner;

public class BinaryConversion{
    public static void main(String[] args) {
        int bin, dec=0, n=0;
        Scanner sc = new Scanner(System.in);
        bin = sc.nextInt();
        while(bin>0){
            int temp = bin%10;
            dec += temp*Math.pow(2, n);
            bin = bin/10;
            n++;
        }
        System.out.println(dec);
    }
}