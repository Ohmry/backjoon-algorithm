package P1463.Main;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    // int X = Integer.parseInt(reader.readLine());
    // int count = 0;

    // while (X > 1) {
    //   count++;
    //   if (X % 3 > 0) {
    //     X %= 3;
    //   } else if (X % 2 > 0) {
    //     X %= 2;
    //   } else {
    //     X -= 1;
    //   }
    // }

    // writer.write(String.valueOf(count));
    // writer.newLine();
    writer.flush();
    writer.close();
    reader.close();
    return;
  }
}
