package P10828.Main;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader reader = new BufferedReader(new FileReader("./P10828/Main/input.txt"));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    List<String> stack = new ArrayList<>();
    int count = Integer.parseInt(reader.readLine());

    for (int i = 0; i < count; i++) {
      String[] arguments = reader.readLine().split(" ");

      switch (arguments[0]) {
        case "push":
          stack.add(arguments[1]);
          break;
        case "pop":
          if (stack.size() < 1) {
            writer.write("-1");
            writer.newLine();
          } else {
            writer.write(stack.get(stack.size() - 1));
            writer.newLine();
            stack.remove(stack.size() - 1);
          }
          break;
        case "size":
          writer.write(String.valueOf(stack.size()));
          writer.newLine();
          break;
        case "empty":
          writer.write(stack.size() == 0 ? "1" : "0");
          writer.newLine();
          break;
        case "top":
          if (stack.size() < 1) {
            writer.write("-1");
            writer.newLine();
          } else {
            writer.write(stack.get(stack.size() - 1));
            writer.newLine();
          }
          break;
        default:
          break;
      }
    }

    writer.flush();
    writer.close();
    reader.close();
    return;
  }  
}
