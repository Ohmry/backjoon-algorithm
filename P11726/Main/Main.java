package P11726.Main;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(reader.readLine());
    Integer[] memory = new Integer[N + 1];
    int count = recursive(memory, N);

    writer.write(String.valueOf(count));
    writer.flush();
    writer.close();
    reader.close();
    return;
  }

  static int recursive (Integer[] memory, int N) {
    if (memory[N] == null) {
      if (N == 0 || N == 1) {
        memory[N] = 1;
      } else {
        memory[N] = (recursive(memory, N - 1) + recursive(memory, N - 2)) % 10007;
      }
    }

    return memory[N];
  }
}
