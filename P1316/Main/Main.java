package P1316.Main;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            List<Character> exists = new ArrayList<>();
            boolean isGroupWord = true;
            Character prevAlphabet = null;

            for (int j = 0; j < input.length(); j++) {
                char alphabet = input.charAt(j);
                if (exists.contains(alphabet)) {
                    if (prevAlphabet.equals(alphabet)) continue;
                    isGroupWord = false;
                } else {
                    exists.add(alphabet);
                }
                prevAlphabet = alphabet;
            }

            if (isGroupWord) result++;
        }

        System.out.println(result);

        scanner.close();
        return;
    }
}
