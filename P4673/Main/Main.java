package P4673.Main;

public class Main {
  public static void main(String[] args) {
    boolean[] exists = new boolean[10000];
    for (int i = 1; i <= 10000; i++) {
      int sum = i;
      String str = String.valueOf(i);
      for (int j = 0; j < str.length(); j++) {
        sum += Integer.parseInt(String.valueOf(str.charAt(j)));
      }
      if (sum > 10000) continue;
      if (exists[sum - 1] == false) {
        exists[sum - 1] = true;
      }
    }

    for (int i = 0; i < exists.length; i++) {
      if (exists[i] == false) {
        System.out.println(i + 1);
      }
    }
  }
}
