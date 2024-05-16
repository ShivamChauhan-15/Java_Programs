package dateTime;

// Java code for ChronoUnits Enum
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahChronology;
import java.time.temporal.ChronoUnit;

public class ChronologiesExample {

    // Function to check ChronoUnit
    public static void checkingChronoEnum()
    {
        LocalDate date = LocalDate.now();
        System.out.println("current date is :" +date);

        // adding 2 years to the current date
        LocalDate year =date.plus(2, ChronoUnit.YEARS);
        System.out.println("next to next year is " +year);

        // adding 1 month to the current date
        LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
        System.out.println("the next month is " +nextMonth);

        // adding 1 week to the current date
        LocalDate nextWeek =date.plus(1, ChronoUnit.WEEKS);
        System.out.println("next week is " + nextWeek);

        // adding 2 decades to the current date
        LocalDate decade =date.plus(2, ChronoUnit.DECADES);
        System.out.println("20 years after today " +decade);

        // Using Hijrah (Islamic) chronology
        Chronology hijrahChrono = HijrahChronology.INSTANCE;
        ChronoLocalDate hijrahDate = hijrahChrono.dateNow();
        System.out.println("Hijrah Date: " + hijrahDate);
    }

    // Driver code
    public static void main(String[] args) {
        checkingChronoEnum();
    }
}

