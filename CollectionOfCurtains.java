import java.util.*;

public class CollectionOfCurtains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int l = sc.nextInt();

        int max = 0;

        for(int i = 0; i < str.length(); i += l) {
            int count = 0;

            for(int j = i; j < Math.min(i + l, str.length()); j++) {
                if(str.charAt(j) == 'a') {
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}