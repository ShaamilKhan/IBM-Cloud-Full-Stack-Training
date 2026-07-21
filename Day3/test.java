import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class test {
    public static void main(String[] args){
        int arr [] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(5);
        futureDate.format(DateTimeFormatter.ofPattern("yyyy-dd-MM"));

        System.out.println("Today: " + today);
        System.out.println("Future Date: " + futureDate);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}