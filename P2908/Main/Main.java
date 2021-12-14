package backjoon.P2908.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");
        int max = Integer.MIN_VALUE;
        
        for (String input : inputs) {
            StringBuilder builder = new StringBuilder(input);
            int value = Integer.parseInt(builder.reverse().toString());

            if (max < value) {
                max = value;
            }
        }

        System.out.println(max);

        scanner.close();
        return;
    }
}
