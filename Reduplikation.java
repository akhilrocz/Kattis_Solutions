import java.util.*;
public class Reduplikation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(s+"");
        }

        scanner.close();
    }
}
