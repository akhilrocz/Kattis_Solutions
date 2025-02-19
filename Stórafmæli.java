import java.util.*;

public class Stórafmæli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n % 10 == 0) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }


        scanner.close();
    }
}
