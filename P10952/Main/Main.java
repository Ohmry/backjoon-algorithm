package P10952.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = 0;
        int two = 0;

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            one = Integer.parseInt(input[0]);
            two = Integer.parseInt(input[1]);

            if (one != 0 && two != 0) {
                System.out.println(one + two);
            } else {
                break;
            }
        }
        
        scanner.close();
        return;
    }
}
