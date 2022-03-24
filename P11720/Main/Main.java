package P11720.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    scanner.nextLine();
    
    String value = scanner.nextLine();
    int sum = 0;

    for (int i = 0; i < count; i++) {
      sum += Integer.parseInt(String.valueOf(value.charAt(i)));
    }

    System.out.println(sum);
    scanner.close();
    return;
  }  
}
