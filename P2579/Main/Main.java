package P2579.Main;

import java.io.*;

public class Main {
  static Integer[] stairs;
  static Integer[] memory;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // BufferedReader reader = new BufferedReader(new FileReader("./P2579/Main/input.txt"));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int stairCount = Integer.parseInt(reader.readLine());
    stairs = new Integer[stairCount + 1];
    memory = new Integer[stairCount + 1];
    
    stairs[0] = 0;
    for (int index = 1; index <= stairCount; index++) {
      stairs[index] = Integer.parseInt(reader.readLine());
    }

    int score = recursive(stairCount);

    writer.write(String.valueOf(score));
    writer.newLine();
    writer.flush();
    writer.close();
    reader.close();
    return;
  }

  static int recursive (int index) {
    if (memory[index] == null) {
      if (index == 0) {
        memory[index] = 0;
      } else if (index == 1) {
        memory[index] = stairs[index];
      } else if (index == 2) {
        memory[index] = stairs[index] + stairs[index - 1];
      } else {
        int case_1 = recursive(index - 3) + stairs[index - 1] + stairs[index];
        int case_2 = recursive(index - 2) + stairs[index];
        memory[index] = Math.max(case_1, case_2);
      }
    }
    return memory[index];
  }
}
