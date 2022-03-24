package P9095.Main;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int times = Integer.parseInt(reader.readLine());
    for (int i = 0; i < times; i++) {
      int N = Integer.parseInt(reader.readLine());
      Integer[] memory = new Integer[N + 1];
      int count = recursive(memory, N);
      writer.write(String.valueOf(count));
      writer.newLine();
    }
    
    writer.flush();
    writer.close();
    reader.close();
    return;
  }

  static int recursive (Integer[] memory, int n) {
    if (memory[n] == null) {
      if (n == 0) {
        memory[n] = 0;
      } else if (n == 1) {
        memory[n] = 1;
      } else if (n == 2) {
        memory[n] = 2;
      } else if (n == 3) {
        memory[n] = 4;
      } else {
        memory[n] = recursive(memory, n - 1) + recursive(memory, n - 2) + recursive(memory, n - 3);
      }
    }
    return memory[n];
  }
}
