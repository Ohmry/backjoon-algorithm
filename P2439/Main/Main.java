package backjoon.P2439.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int depth = 1;

        for (int i = 0; i < count; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < depth; j++) {
                builder.append("*");
            }
            depth++;
            System.out.println(String.format("%" + count + "s", builder.toString()));
        }

        scanner.close();
        return;
    }
}
