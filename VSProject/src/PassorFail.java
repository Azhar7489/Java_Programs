import java.util.Scanner;

public class PassorFail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You marks :- ");
        int marks = sc.nextInt();
        String status = (marks>=33)?"Pass":"Fail";
        System.out.println(status);
    }
}