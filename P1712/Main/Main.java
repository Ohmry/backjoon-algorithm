package P1712.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fixedAmount = scanner.nextInt();
        int perAmount = scanner.nextInt();
        int perSaleAmount = scanner.nextInt();

        if (perSaleAmount - perAmount == 0) {
            System.out.println(-1);
        } else {
            int count = fixedAmount / (perSaleAmount - perAmount) + 1;
            System.out.println(count > 0 ? count : -1);
        }

        scanner.close();
        return;
    }
}
