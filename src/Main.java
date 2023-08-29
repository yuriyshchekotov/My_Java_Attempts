//Class, System, simple math operations, conditions
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This useful code can show you the correct time, if you send the number of seconds, passed from the midnight!");
        Scanner scanner = new Scanner(System.in);
        long in_seconds = scanner.nextInt();
        long out_hours = (in_seconds % 86400) / 3600;
        long out_minutes = (in_seconds % 3600) / 60;
        long out_seconds = in_seconds % 60;
        System.out.print(out_hours+":");
        if (out_minutes < 10) System.out.print("0");
        System.out.print(out_minutes+":");
        if (out_seconds < 10) System.out.print("0");
        System.out.print(out_seconds);

    }
}