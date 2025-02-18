import java.util.*;

public class BilaðLyklaborð {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        char lastCharacter = '\0';

        for (char c : s.toCharArray()) {
            if (c != lastCharacter) {
                sb.append(c);
                lastCharacter = c;
            }
        }

        System.out.println(sb.toString());
        scanner.close();

    }
}
