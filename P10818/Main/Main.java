package backjoon.P10818.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    int count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      int value = scanner.nextInt();
      if (min > value) {
        min = value;
      }
      if (max < value) {
        max = value;
      }
    }

    System.out.println( min + " " + max);

    scanner.close();
    return;
  }
}
