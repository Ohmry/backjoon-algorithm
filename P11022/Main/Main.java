package backjoon.P11022.Main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= count; i++) {
            String[] input = reader.readLine().split(" ");
            int one = Integer.parseInt(input[0]);
            int two = Integer.parseInt(input[1]);
            writer.write("Case #" + i + ": " + one + " + " + two + " = " + (one + two));
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();
        return;
    }
}
