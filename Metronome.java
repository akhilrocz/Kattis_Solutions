import java.util.*;

public class Metronome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double quotient = (double) n/4.0;

        System.out.println(quotient);

        scanner.close();
    }
}
