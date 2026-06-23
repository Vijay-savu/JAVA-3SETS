import java.util.*;

public class AyushStringTransformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        int operations = 0;

        for(int i = 0; i < n; i++) {
            if(A.charAt(i) < B.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }

        boolean[][] relation = new boolean[26][26];

        for(int i = 0; i < n; i++) {
            if(A.charAt(i) != B.charAt(i)) {
                relation[A.charAt(i)-'a'][B.charAt(i)-'a'] = true;
            }
        }

        for(int i = 0; i < 20; i++) {
            int target = -1;

            for(int j = i + 1; j < 20; j++) {
                if(relation[i][j]) {
                    target = j;
                    break;
                }
            }

            if(target != -1) {
                operations++;

                for(int j = target + 1; j < 20; j++) {
                    if(relation[i][j]) {
                        relation[target][j] = true;
                    }
                }
            }
        }

        System.out.println(operations);
    }
}