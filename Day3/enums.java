import java.time.LocalDate;

enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
public class enums {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(30);

        if(futureDate.getDayOfWeek() == java.time.DayOfWeek.SATURDAY) {
            futureDate = futureDate.plusDays(2);
        }
        else if(futureDate.getDayOfWeek() == java.time.DayOfWeek.SUNDAY){
            futureDate = futureDate.plusDays(1);
        }
        System.out.println(futureDate);
    }
}