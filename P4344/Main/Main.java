package P4344.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < count; i++) {
      String[] inputs = scanner.nextLine().split(" ");
      int scoreCount = Integer.parseInt(inputs[0]);
      int[] scores = new int[scoreCount];
      int sum = 0;

      for (int j = 1; j <= scoreCount; j++) {
        int score = Integer.parseInt(inputs[j]);
        scores[j - 1] = score;
        sum += score;
      }

      double average = (double) sum / scores.length;
      int includes = 0;
      
      for (int j = 0; j < scores.length; j++) {
        if (average < (double) scores[j]) {
          includes++;
        }
      }

      System.out.println(String.format("%.3f", (double) includes / scores.length * 100) + "%");
    }

    scanner.close();
    return;
  }
}
