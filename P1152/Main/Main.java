package P1152.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        int count = 0;
        for (String word : value.split(" ")) {
            if (word.length() > 0) {
                count++;
            }
        }
        System.out.println(count);

        scanner.close();
        return;
    }
}
