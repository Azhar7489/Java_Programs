import java.util.Scanner;
import java.util.Arrays;

public class FindFrequency {
    private static final String Arrays = null;
    public static void countFrequency(int[] arr, int n){
        boolean[] visit = new boolean[n];
        Arrays.fill(visit, false);
        for (int i = 0; i < n; i++) {
            if(visit[i]==true)
            continue;
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    visit[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" occurs "+count+" times ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of An array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of arrays:-");
        int[] arr = new int[n];
        for (int i : arr) {
            i = sc.nextInt();
        }
        countFrequency(arr, n);
        sc.close();
    }

    
}
