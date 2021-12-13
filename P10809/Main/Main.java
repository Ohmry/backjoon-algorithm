package backjoon.P10809.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    StringBuilder builder = new StringBuilder();

    for (int ascii = 97; ascii <= 122; ascii++) {
      String alpha = String.valueOf((char) ascii);
      int index = value.indexOf(alpha);
      if (builder.length() < 1) {
        builder.append(index);
      } else {
        builder.append(" " + index);
      }
    }

    System.out.println(builder.toString());
    scanner.close();
    return;
  }
}
