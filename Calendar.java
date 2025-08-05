import java.util.Calendar;
import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar c = Calendar.getInstance();

        // Get current time
        Date d = c.getTime();
        System.out.println("Current Date: " + d);

        // Set date to 13 September 2023
        c.set(2023, Calendar.SEPTEMBER, 13);
        System.out.println("Updated Date: " + c.getTime());

        // Get the week year
        int year = c.getWeekYear();
        System.out.println("Week Year: " + year);

        // Get the first day of the week
        int h = c.getFirstDayOfWeek();
        System.out.println("First Day of Week: " + h);
    }
}
