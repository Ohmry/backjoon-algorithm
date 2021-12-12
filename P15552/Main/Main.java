package backjoon.P15552.Main;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String[] input = reader.readLine().split(" ");
            int one = Integer.parseInt(input[0]);
            int two = Integer.parseInt(input[1]);

            writer.write(String.valueOf(one + two));
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();
        return;
    }    
}
