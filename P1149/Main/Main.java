package P1149.Main;

import java.io.*;

public class Main {
  final static int COLOR_R = 0;
  final static int COLOR_G = 1;
  final static int COLOR_B = 2;

  static int[][] costs;
  static Integer[][] memory;
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // BufferedReader reader = new BufferedReader(new FileReader("./P1149/Main/input.txt"));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(reader.readLine());
    costs = new int[T][3];
    memory = new Integer[T][3];
    
    for (int i = 0; i < T; i++) {
      String[] values = reader.readLine().split(" ");
      
      costs[i][COLOR_R] = Integer.parseInt(values[0]);
      costs[i][COLOR_G] = Integer.parseInt(values[1]);
      costs[i][COLOR_B] = Integer.parseInt(values[2]);
    }

    int cost = Math.min(recursive(T, COLOR_R), Math.min(recursive(T, COLOR_G), recursive(T, COLOR_B)));
    writer.write(String.valueOf(cost));
    writer.newLine();

    writer.flush();
    writer.close();
    reader.close();
    return;
  }
  
  static int recursive (int house, int color) {
    int index = house - 1;
    if (memory[index][color] == null) {
      if (index != 0 && color == COLOR_R) {
        memory[index][color] = costs[index][color] + Math.min(recursive(house - 1, COLOR_G), recursive(house - 1, COLOR_B));
      } else if (index != 0 && color == COLOR_G) {
        memory[index][color] = costs[index][color] + Math.min(recursive(house - 1, COLOR_R), recursive(house - 1, COLOR_B));
      } else if (index != 0 && color == COLOR_B) {
        memory[index][color] = costs[index][color] + Math.min(recursive(house - 1, COLOR_R), recursive(house - 1, COLOR_G));
      } else {
        memory[index][color] = costs[index][color];
      }
    }
    return memory[index][color];
  }
}
