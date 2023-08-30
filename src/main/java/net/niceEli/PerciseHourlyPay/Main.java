package net.niceEli.PerciseHourlyPay;

public class Main {
    public static void main(String[] args) {
        float _time = calculateElapsedTime(args[0], args[1]);
        float _hours = _time / 60;
        float _pay = _hours * Float.parseFloat(args[2]);
        System.out.println("Start: " + args[0]);
        System.out.println("End: "+ args[1]);
        System.out.println("Price: " + args[2]);
        System.out.println("Elapsed: " + _time / 60+"h");
        System.out.println("_________________");
        System.out.println("Total: " + _pay);
    }

    public static float calculateElapsedTime(String startTime, String endTime) {
        String[] startParts = startTime.split(":");
        String[] endParts = endTime.split(":");

        int startHour = Integer.parseInt(startParts[0]);
        int startMinute = Integer.parseInt(startParts[1]);

        int endHour = Integer.parseInt(endParts[0]);
        int endMinute = Integer.parseInt(endParts[1]);

        int totalStartMinutes = (startHour * 60) + startMinute;
        int totalEndMinutes = (endHour * 60) + endMinute;

        return (float) (totalEndMinutes - totalStartMinutes);
    }
}