package P2292.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = scanner.nextInt();
        int maxRoom = 1;
        int count = 1;

        while (goal > maxRoom) {
            maxRoom += 6 * count;
            count++;
        }

        System.out.println(count);

        scanner.close();
        return;
    }
}
