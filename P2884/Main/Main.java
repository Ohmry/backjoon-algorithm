package backjoon.P2884.Main;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.add(Calendar.MINUTE, -45);

        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");

        hour = Integer.parseInt(hourFormat.format(calendar.getTime()));
        minute = Integer.parseInt(minuteFormat.format(calendar.getTime()));

        System.out.println(hour + " " + minute);

        scanner.close();
        return;
    }
}
