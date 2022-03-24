package P5622.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int second = 0;

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char word = input.charAt(i);
            if ((int) word <= (int) 'C') {
                second += 3;
            } else if ((int) word <= (int) 'F') {
                second += 4;
            } else if ((int) word <= (int) 'I') {
                second += 5;
            } else if ((int) word <= (int) 'L') {
                second += 6;
            } else if ((int) word <= (int) 'O') {
                second += 7;
            } else if ((int) word <= (int) 'S') {
                second += 8;
            } else if ((int) word <= (int) 'V') {
                second += 9;
            } else if ((int) word <= (int) 'Z') {
                second += 10;
            } else {
                continue;
            }
        }

        System.out.println(second);

        scanner.close();
        return;
    }
}
