package P2577.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] useCount = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    String value = String.valueOf(A * B * C);

    for (int i = 0; i < value.length(); i++) {
      int chr = Integer.parseInt(String.valueOf(value.charAt(i)));
      useCount[chr]++;
    }

    for (int i = 0; i < useCount.length; i++) {
      System.out.println(useCount[i]);
    }

    scanner.close();
    return;
  }
}
