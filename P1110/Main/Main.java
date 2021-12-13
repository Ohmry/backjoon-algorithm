package backjoon.P1110.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 10 1 01
        int N = scanner.nextInt();
        int goal = N;
        int cycle = 0;
        
        do {
            cycle++;
            String goalString = String.valueOf(goal < 10 ? "0" + goal : goal);
            int compare = 0;
            for (int i = 0; i < goalString.length(); i++) {
                compare += Integer.parseInt(String.valueOf(goalString.charAt(i)));
            }

            String compareString = String.valueOf(compare);
            String firstString = String.valueOf(goalString.charAt(goalString.length() - 1));
            String secondString = compare >= 10 ? String.valueOf(compareString.charAt(compareString.length() - 1)) : compareString;

            goal = Integer.parseInt(firstString + secondString);
        } while (goal != N);

        System.out.println(cycle);

        scanner.close();
        return;
    }
}
