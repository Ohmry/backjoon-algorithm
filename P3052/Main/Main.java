package backjoon.P3052.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean[] exists = new boolean[42];
    int count = 0;

    for (int i = 0; i < 10; i++) {
      int value = scanner.nextInt();
      exists[value % 42] = true;
    }

    for (int i = 0; i < exists.length; i++) {
      if (exists[i]) count++;
    }

    System.out.println(count);

    scanner.close();
    return;
  }
}
