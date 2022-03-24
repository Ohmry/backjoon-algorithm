package P1546.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int[] scores = new int [count];
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < count; i++) {
      scores[i] = scanner.nextInt();
      if (max < scores[i]) {
        max = scores[i];
      }
    }

    double sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += (double) scores[i] / max * 100;
    }

    System.out.println(sum / scores.length);

    scanner.close();
    return;
  }
}
