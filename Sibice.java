import java.util.*;

public class Sibice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();

        }

        double diagonal = Math.sqrt(W * W + H * H);

        for (int num : arr) {
            if (num <= diagonal) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }


    }
}
