package backjoon.P1110.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int value = N < 10 ? N * 10 : N;
        int cycle = 0;
        int target = 0;

        do {
            cycle++;
            String str = String.valueOf(value);
            target = 0;
            for (int i = 0; i < str.length(); i++) {
                target += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        } while (target == N);

        System.out.println(cycle);

        scanner.close();
        return;
    }
}
