package P2675.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    scanner.nextLine();
    
    for (int i = 0; i < count; i++) {
      String[] input = scanner.nextLine().split(" ");
      int repeat = Integer.parseInt(input[0]);
      String value = input[1];

      for (int j = 0; j < value.length(); j++) {
        for (int k = 0; k < repeat; k++) {
          System.out.print(value.charAt(j));
        }
      }
      System.out.println();
    }

    scanner.close();
    return;
  }
}
