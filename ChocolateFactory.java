import java.util.*;

public class ChocolateFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        for(int num : arr) {
            if(num != 0) {
                result[index++] = num;
            }
        }

        while(index < n) {
            result[index++] = 0;
        }

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}