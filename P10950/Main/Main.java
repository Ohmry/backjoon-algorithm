package backjoon.P10950.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(" ");

            int first = Integer.parseInt(input[0]);
            int second = Integer.parseInt(input[1]);

            System.out.println(first + second);
        }

        scanner.close();
        return;
    }
}
