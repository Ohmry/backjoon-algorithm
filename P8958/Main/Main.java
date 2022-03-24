package P8958.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < count; i++) {
      String results = scanner.nextLine();
      int score = 0;
      int additional = 0;
      for (int j = 0; j < results.length(); j++) {
        if (results.charAt(j) == 'O') {
          score += 1 + additional++;
        } else {
          additional = 0;
        }
      }

      System.out.println(score);
    }

    scanner.close();
    return;
  }
}
