package backjoon.P1157.Main;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> board = new HashMap<>();

        String input = scanner.nextLine().toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            char alphabet = input.charAt(i);
            int count = 1;
            if (board.containsKey(alphabet)) {
                count += board.get(alphabet);
            }
            board.put(alphabet, count);
        }

        int maxCount = Integer.MIN_VALUE;
        String maxKey = "";
        boolean isDuplicated = false;

        for (char key : board.keySet()) {
            int count = board.get(key);
            if (maxCount < count) {
                maxCount = count;
                maxKey = String.valueOf(key);
                isDuplicated = false;
            } else if (maxCount == count) {
                isDuplicated = true;
            }
        }

        System.out.println(isDuplicated ? "?" : maxKey);

        scanner.close();
        return;
    }
}
