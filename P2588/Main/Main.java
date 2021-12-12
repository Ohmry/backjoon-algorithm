package backjoon.P2588.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String b = String.valueOf(B);
        
        for (int i = b.length() - 1; i >= 0; i--) {
            int c = Integer.parseInt(String.valueOf(b.charAt(i)));
            System.out.println(A * c);
        }

        System.out.println(A * B);

        scanner.close();
        return;
    }
}
