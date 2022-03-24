package P11654.Main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char value = scanner.nextLine().charAt(0);
    System.out.println((int) value);
    
    scanner.close();
    return;
  }
}
