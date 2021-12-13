package backjoon.P1065.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int count = 0;
    
    for (int i = 1; i <= N; i++) {
      if (i < 10) {
        count++;
        continue;
      }
      String value = String.valueOf(i);
      int term = 0;
      boolean correct = false;
      
      for (int j = 0; j < value.length() - 1; j++) {
        int fst = Integer.parseInt(String.valueOf(value.charAt(j)));
        int sec = Integer.parseInt(String.valueOf(value.charAt(j + 1)));

        if (j == 0) {
          term = fst - sec;
          correct = true;
        } else {
          if (term != (fst - sec)) {
            correct = false;
            break;
          } else {
            correct = true;
          }
        }
      }

      if (correct) count++;
    }

    System.out.println(count);

    scanner.close();
    return;
  }
}
