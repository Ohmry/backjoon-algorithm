package P10871.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder();
        String[] input = scanner.nextLine().split(" ");
        int target = Integer.parseInt(input[1]);

        String[] array = scanner.nextLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            if (target > Integer.parseInt(array[i])) {
                if (builder.length() > 0) {
                    builder.append(" " + array[i]);
                } else {
                    builder.append(array[i]);
                }
            }
        }

        System.out.println(builder.toString());

        scanner.close();
        return;
    }
}
