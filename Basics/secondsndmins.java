package Basics;

public class secondsndmins {
    private static final String INVALID_VALUE_MESSAGE = "Invalid vlaue";

    public static void main(String[] args) {
        System.out.println(getDurationString(1, 4));
        System.out.println(getDurationString(-3954));
    }

    public static String getDurationString(long min, long sec) {
        if (min >= 0 || (sec >= 0 && sec <= 59)) {
            long h = min / 60;
            long remmin = min % 60;

            String hString = h + "h";
            if (h < 10) {
                hString = "0" + hString;
            }
            String minString = remmin + "min";
            if (remmin < 10) {
                minString = "0" + minString;
            }
            String secString = sec + "sec";
            if (sec < 10) {
                secString = "0" + secString;
            }
            return hString + " " + minString + " " + secString;
        }
        return INVALID_VALUE_MESSAGE;

    }

    public static String getDurationString(long sec) {
        if (sec >= 0) {
            long min = sec / 60;
            long remsec = sec % 60;
            return getDurationString(min, remsec);
        }
        return INVALID_VALUE_MESSAGE;

    }

}

