package example;

public class enumexample {


    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }


    public static String checkHoliday(DaysOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                return "Holiday";
            default:
                return "Not Holiday";
        }
    }


    public static void main(String[] args) {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day + ": " + checkHoliday(day));
        }
    }
}
