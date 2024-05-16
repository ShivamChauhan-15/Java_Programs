package dateTime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExample {
    public static void main(String[] args) {
        // Creating OffsetDateTime using LocalDateTime and ZoneOffset
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneOffset offset=ZoneOffset.of("+02:00");
//        ZoneOffset offset = ZoneOffset.ofHours(2); // UTC+02:00
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);

        // Accessing components of OffsetDateTime
        System.out.println("OffsetDateTime: " + offsetDateTime);
        System.out.println("Year: " + offsetDateTime.getYear());
        System.out.println("Month: " + offsetDateTime.getMonth());
        System.out.println("Hour: " + offsetDateTime.getHour());
        System.out.println("Minute: " + offsetDateTime.getMinute());
        System.out.println("Offset: " + offsetDateTime.getOffset());
    }
}
