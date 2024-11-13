import intAndAdapt.*;

public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        // Set initial date
        dateAdapter.setDay(1);
        dateAdapter.setMonth(1);
        dateAdapter.setYear(2024);
        System.out.println("Initial Date: " + dateAdapter);

        // Advance the date by 30 days
        dateAdapter.advanceDays(30);
        System.out.println("After Advancing 30 Days: " + dateAdapter);

        // Advance the date by 365 days
        dateAdapter.advanceDays(365);
        System.out.println("After Advancing 365 Days: " + dateAdapter);
    }
}
