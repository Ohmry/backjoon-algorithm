package P2941.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alphabets = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        StringBuilder input = new StringBuilder(scanner.nextLine());
        int count = 0;

        for (int i = 0; i < alphabets.length; i++) {
            String alpha = alphabets[i];
            int index = -1;
            do {
                index = input.indexOf(alpha);
                if (index == -1) break;
                count++;
                input.replace(index, index + alpha.length(), "-");
            } while (index != -1);
        }

        String remain = input.toString().replaceAll("-", "");
        count += remain.length();

        System.out.println(count);

        scanner.close();
        return;
    }
}
