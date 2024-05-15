import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        //the current date
        LocalDate currentDate=LocalDate.now();
        System.out.println("Current date: "+currentDate);
        //current time
        LocalTime currentTime=LocalTime.now();
        System.out.println("current time: "+currentTime);
        //the current time and date
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println("Current date time: "+currentDateTime);
        //to print in a particular format
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        String formatedDateTime=currentDateTime.format(format);
        System.out.println("Current date time in given format: "+formatedDateTime);
        //printing months days and seconds
        Month month=currentDateTime.getMonth();
        int day=currentDateTime.getDayOfMonth();
        int hour = currentDateTime.getHour();
        int seconds=currentDateTime.getSecond();
        int minutes=currentDateTime.getMinute();
        int monthValue=currentDateTime.getMonthValue();
        System.out.println("Month: "+month+"\nDay: "+day+ "\nhour: "+hour+ "\nminutes: "+minutes+ "\nseconds: "+seconds+ "\nmonth value:"+monthValue);
        // printing some specified date
        LocalDate specifiedDate=LocalDate.of(2001,06,15);
        System.out.println("Specified Date: "+specifiedDate);
        // printing date with current time.
        LocalDateTime specificDateTime=currentDateTime.withDayOfMonth(24).withYear(2016);
        System.out.println("specific date with current time : "+specificDateTime);

    }

}
