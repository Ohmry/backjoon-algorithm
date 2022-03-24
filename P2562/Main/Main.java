package P2562.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int index = -1;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < 9; i++) {
      int value = scanner.nextInt();

      if (max < value) {
        max = value;
        index = i + 1;
      }
    }

    System.out.println(max);
    System.out.println(index);

    scanner.close();
    return;
  }
}
