enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    boolean isWeekend() {

        return this == SATURDAY || this == SUNDAY;
    }
}


public class Problem13_Enum {

    public static void main(String[] args) {

        System.out.println(Day.SATURDAY.isWeekend());

        System.out.println(Day.MONDAY.isWeekend());
    }
}