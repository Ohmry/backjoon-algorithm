package P10951.Main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = reader.readLine();
        while (line != null && !line.isEmpty()) {
            String[] input = line.split(" ");
            int one = Integer.parseInt(input[0]);
            int two = Integer.parseInt(input[1]);

            writer.write(String.valueOf(one + two));
            writer.newLine();

            line = reader.readLine();
        }

        writer.flush();
        writer.close();
        reader.close();
        return;
    }
}
