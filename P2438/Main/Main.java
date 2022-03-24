package P2438.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int depth = 1;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < depth; j++) {
                System.out.print("*");
            }
            depth++;
            System.out.println();
        }

        scanner.close();
        return;
    }
}
